/**
 * 坦克游戏的3.0
 * 1.画出坦克
 * 2.我得坦克可以上下左右移动
 * 3.可以发射子弹，子弹可以连发(最多发5课)
 * 4.当我的坦克击中敌人的坦克时，敌人的坦克就消失(爆炸效果)
 * 5.让敌人的坦克也能随机移动起来
 * 6.控制我放的坦克的敌人的坦克的移动范围
 * 7.让敌人的坦克也能发射子弹
 * 8.当敌人的坦克击中我的坦克时，也能爆炸
 * */
package com.test05;

import java.awt.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.RenderingHints.Key;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.*;

public class MyTankGame extends JFrame {
	MyPanel2 myPanle = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTankGame();
	}

	// 构造函数
	public MyTankGame() {
		myPanle = new MyPanel2();
		this.add(myPanle);

		// 启动myPanle线程
		Thread thread = new Thread(myPanle);
		thread.start();

		// 注册监听
		this.addKeyListener(myPanle);

		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

// 我的面板
class MyPanel2 extends JPanel implements KeyListener, Runnable {
	// 定义我自己的坦克
	Hero hero = null;
	// 定义敌人的坦克 (用Vector为了线程安全)
	Vector<EnemyTank> enemyTanks = new Vector<EnemyTank>();

	// 定义炸弹集合
	Vector<Bomb> bombs = new Vector<Bomb>();

	int enemySize = 3;// 敌人坦克的数量

	// 定义三张图片,三张图片才能组成一颗炸弹
	Image image1 = null;
	Image image2 = null;
	Image image3 = null;

	// 构造函数
	public MyPanel2() {
		hero = new Hero(100, 100);
		
		// 初始化敌人的坦克
		for (int i = 0; i < enemySize; i++) {
			// 创建坦克对象
			EnemyTank enemyTank = new EnemyTank((i + 1) * 50, 0);
			enemyTank.setColor(0);
			enemyTank.setDirect(2);

			// 启动敌人的坦克
			Thread thread = new Thread(enemyTank);
			thread.start();
			// 给敌人坦克添加一颗子弹
			Shot shot = new Shot(enemyTank.x + 10, enemyTank.y + 30, 2);
			// 加入给敌人坦克
			enemyTank.shots.add(shot);
			Thread thread2 = new Thread(shot);
			thread2.start();

			// 添加到Vector
			enemyTanks.add(enemyTank);
		}

		// 初始化图片
		image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/boom1.PNG"));
		image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/boom2.PNG"));
		image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/boom3.PNG"));
	}

	// 抽象paint
	@Override
	public void paint(Graphics g) {
		super.paint(g); 
		g.fillRect(0, 0, 400, 300);

		// 画出自己的坦克
		if (hero.isLive) {
			this.drawTanke(hero.getX(), hero.getY(), g, this.hero.direct, 1);
		}
		// 从shorts中取出每一刻子弹并画出
		for (int i = 0; i < hero.shots.size(); i++) {
			Shot myShot = hero.shots.get(i);

			// 画出子弹 画出一颗子弹
			if (myShot != null && myShot.isLive == true) {
				g.draw3DRect(myShot.x, myShot.y, 1, 1, false);
			}

			if (myShot.isLive == false) {
				// 从向量shots中移除掉该子弹
				hero.shots.remove(myShot);
			}
		}

		// 画出炸弹
		for (int i = 0; i < bombs.size(); i++) {

			System.out.println("bomb.size() = " + bombs.size());
			// 取出炸弹
			Bomb bomb = bombs.get(i);
			if (bomb.life > 6) {
				g.drawImage(image1, bomb.x, bomb.y, 30, 30, this);
			} else if (bomb.life > 3) {
				g.drawImage(image2, bomb.x, bomb.y, 30, 30, this);
			} else {
				g.drawImage(image3, bomb.x, bomb.y, 30, 30, this);
			}
			// 让bomb的生命值减小
			bomb.lifeDown();
			// 如果炸弹生命值为0，把该炸弹从bombs中移除
			if (bomb.life == 0) {
				bombs.remove(bomb);
			}
		}

		// 画出敌人的坦克
		for (int i = 0; i < enemyTanks.size(); i++) {

			EnemyTank enemyTank = enemyTanks.get(i);
			if (enemyTank.isLive) {
				this.drawTanke(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);

				// 再画出敌人的子弹
				for (int j = 0; j < enemyTank.shots.size(); j++) {
					// 取出子弹
					Shot enemyShot = enemyTank.shots.get(j);
					if (enemyShot.isLive) {
						g.draw3DRect(enemyShot.x, enemyShot.y, 1, 1, false);
					}else {
						//如果敌人的子弹死亡了，就从VVector中去掉
						enemyTank.shots.remove(enemyShot);
					}
				}
			}
		}
	}

	// 判断我的子弹是否击中敌人的坦克
	public void hitEnemyTank() {
		// 判断是否击中敌人的坦克
		for (int i = 0; i < hero.shots.size(); i++) {
			// 取出子弹
			Shot myShot = hero.shots.get(i);
			// 判断子弹是否有效
			if (myShot.isLive) {
				// 取出每个坦克与它判断
				for (int j = 0; j < enemyTanks.size(); j++) {
					// 取出坦克
					EnemyTank enemyTank = enemyTanks.get(j);
					if (enemyTank.isLive) {
						this.hitTank(myShot, enemyTank);
					}
				}
			}
		}
	}
	//判断我的子弹是否击中敌人的坦克
	public void hitMe() {
		//取出每一个敌人的坦克
		for (int i = 0; i < this.enemyTanks.size(); i++) {
			//取出敌人的坦克
			EnemyTank enemyTank = enemyTanks.get(i);
			//取出每一颗子弹
			for (int j = 0; j < enemyTank.shots.size(); j++) {
				//取出子弹
				Shot enemyShot = enemyTank.shots.get(j);
				this.hitTank(enemyShot, hero);
			}
		}
	}
	
	
	// 写一个函数判断子弹是否击中敌人的坦克
	public void hitTank(Shot shot, Tank tank) {
		// 判断坦克的方向
		switch (tank.direct) {
		// 敌人的坦克方向是上或者下的时候
		case 0:
		case 2:
			if (shot.x > tank.x && shot.x < tank.x + 20 && shot.y > tank.y
					&& shot.y < tank.y + 30) {
				// 击中
				// 子弹死亡
				shot.isLive = false;
				// 敌人死亡
				tank.isLive = false;

				// 创建一颗炸弹，放入Vector
				Bomb bomb = new Bomb(tank.x, tank.y);
				bombs.add(bomb);
			}
			break;
		// 敌人的坦克向左或者向右
		case 1:
		case 3:
			if (shot.x > tank.x && shot.x < tank.x + 30 && shot.y > tank.y
					&& shot.y < tank.y + 20) {
				// 击中
				// 子弹死亡
				shot.isLive = false;
				// 敌人死亡
				tank.isLive = false;

				// 创建一颗炸弹，放入Vector
				Bomb bomb = new Bomb(tank.x, tank.y);
				bombs.add(bomb);
			}
			break;
		default:
			break;
		}
	}

	// 画出坦克的函数（扩展）
	private void drawTanke(int x, int y, Graphics g, int dirct, int type) {
		// 判断坦克的类型
		switch (type) {
		case 0:
			g.setColor(Color.CYAN);
			break;
		case 1:
			g.setColor(Color.blue);
			break;
		default:
			break;
		}

		// 判断方向
		switch (dirct) {
		case 0:// 向上走

			// 画出坦克
			// 1.画出左边矩形
			g.fill3DRect(x, y, 5, 30, false);
			// 2画出右边矩形
			g.fill3DRect(x + 15, y, 5, 30, false);
			// 3.画出中间矩形
			g.fill3DRect(x + 5, y + 5, 10, 20, false);
			// 4.画出圆形
			g.drawOval(x + 5, y + 10, 10, 10);
			// 5.画出线
			g.drawLine(x + 10, y + 15, x + 10, y);
			break;
		case 1:// 炮筒向右
				// 画出上面矩形
			g.fill3DRect(x, y, 30, 5, false);
			// 画出下面的矩形
			g.fill3DRect(x, y + 15, 30, 5, false);
			// 画出中间的矩形
			g.fill3DRect(x + 5, y + 5, 20, 10, false);
			// 画出圆形
			g.fillOval(x + 10, y + 5, 10, 10);
			// 画出线
			g.drawLine(x + 15, y + 10, x + 30, y + 10);
			break;
		case 2:// 向下
				// 1.画出左边矩形
			g.fill3DRect(x, y, 5, 30, false);
			// 2画出右边矩形
			g.fill3DRect(x + 15, y, 5, 30, false);
			// 3.画出中间矩形
			g.fill3DRect(x + 5, y + 5, 10, 20, false);
			// 4.画出圆形
			g.drawOval(x + 5, y + 10, 10, 10);
			// 5.画出线
			g.drawLine(x + 10, y + 15, x + 10, y + 30);
			break;
		case 3:// 向左
				// 画出上面矩形
			g.fill3DRect(x, y, 30, 5, false);
			// 画出下面的矩形
			g.fill3DRect(x, y + 15, 30, 5, false);
			// 画出中间的矩形
			g.fill3DRect(x + 5, y + 5, 20, 10, false);
			// 画出圆形
			g.fillOval(x + 10, y + 5, 10, 10);
			// 画出线
			g.drawLine(x + 15, y + 10, x, y + 10);
			break;
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	// 键按下 a表示向左 s表示向下 w表示向上 d表示向右
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_W) {
			// 设置我的坦克的方向
			this.hero.setDirect(0);
			this.hero.moveUp();
		} else if (e.getKeyCode() == KeyEvent.VK_D) {
			// 向右
			this.hero.setDirect(1);
			this.hero.moveRight();
		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			this.hero.setDirect(2);// 向下
			this.hero.moveDown();
		} else if (e.getKeyCode() == KeyEvent.VK_A) {
			// 向左
			this.hero.setDirect(3);
			this.hero.moveLeft();
		}

		if (e.getKeyCode() == KeyEvent.VK_J) {// 判断是否按下J键
			System.out.println("this.hero.shots.size() = " + this.hero.shots.size());

			// 开火
			if (this.hero.shots.size() <= 4) {
				this.hero.shotEnemy();
			}
		}

		// 必须重写绘制Panel
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 每隔100毫秒去重绘
		while (true) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			//判断我的子弹是否击中敌人的坦克
			this.hitEnemyTank();
			//判断敌人的子弹是否击中我的坦克
			this.hitMe();
			
			// 重绘
			this.repaint();
		}
	}
}
