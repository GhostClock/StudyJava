/**
 * 坦克游戏的3.0
 * 1.画出坦克
 * 2.我得坦克可以上下左右移动
 * */
package com.test03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.RenderingHints.Key;
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
		
		//启动myPanle线程
		Thread thread = new Thread(myPanle);
		thread.start();
		
		//注册监听
		this.addKeyListener(myPanle);
		
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

// 我的面板
class MyPanel2 extends JPanel implements KeyListener,Runnable{
	// 定义我自己的坦克
	Hero hero = null;
	//定义敌人的坦克 (用Vector为了线程安全)
	Vector<EnemyTank> enemyTanks = new Vector<EnemyTank>();
	int enemySize = 3;//敌人坦克的数量
	// 构造函数
	public MyPanel2() {
		hero = new Hero(100, 100);
		//初始化敌人的坦克
		for (int i = 0; i < enemySize; i++) {
			//创建坦克对象
			EnemyTank enemyTank = new EnemyTank((i + 1) * 50, 0);
			enemyTank.setColor(0);
			enemyTank.setDirect(2);
			//添加到Vector
			enemyTanks.add(enemyTank);
		}
	}

	// 抽象paint
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0, 0, 400, 300);
		
		//画出自己的坦克
		this.drawTanke(hero.getX(), hero.getY(), g, this.hero.direct, 1);
		
		//画出子弹
		if (hero.shot != null && hero.shot.isLive == true) {
			g.draw3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
			
		}
		
		//画出敌人的坦克
		for (int i = 0; i < enemyTanks.size(); i++) {
			EnemyTank enemyTank = enemyTanks.get(i);
			this.drawTanke(enemyTank.getX(),enemyTank.getY() , g, enemyTank.getDirect(), 0);
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
		case 1://炮筒向右
			//画出上面矩形
			g.fill3DRect(x, y, 30, 5, false);
			//画出下面的矩形
			g.fill3DRect(x, y + 15, 30, 5, false);
			//画出中间的矩形
			g.fill3DRect(x + 5, y + 5, 20, 10, false);
			//画出圆形
			g.fillOval(x + 10, y + 5, 10, 10);
			//画出线
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
			//画出上面矩形
			g.fill3DRect(x, y, 30, 5, false);
			//画出下面的矩形
			g.fill3DRect(x, y + 15, 30, 5, false);
			//画出中间的矩形
			g.fill3DRect(x + 5, y + 5, 20, 10, false);
			//画出圆形
			g.fillOval(x + 10, y + 5, 10, 10);
			//画出线
			g.drawLine(x + 15, y + 10, x, y + 10);
			break;
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//键按下 a表示向左 s表示向下 w表示向上 d表示向右
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_W) {
			//设置我的坦克的方向
			this.hero.setDirect(0);
			this.hero.moveUp();
		}else if (e.getKeyCode() == KeyEvent.VK_D) {
			//向右
			this.hero.setDirect(1);
			this.hero.moveRight();
		}else if (e.getKeyCode() == KeyEvent.VK_S) {
			this.hero.setDirect(2);//向下
			this.hero.moveDown();
		}else if (e.getKeyCode() == KeyEvent.VK_A) {
			//向左
			this.hero.setDirect(3);
			this.hero.moveLeft();
		}
		
		if (e.getKeyCode() == KeyEvent.VK_J) {//判断是否按下J键
			//开火
			this.hero.shotEnemy();
		}
		
		
		
		//必须重写绘制Panel
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//每隔100毫秒去重绘
		while (true) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			//重绘
			this.repaint();
		}
	}
}
