/**
 * 坦克游戏的1.0
 * 画出坦克
 * 
 * */
package com.test01;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class MyTankGame1 extends JFrame {
	MyPanel2 myPanle = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTankGame1();
	}

	// 构造函数
	public MyTankGame1() {
		myPanle = new MyPanel2();
		this.add(myPanle);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

// 我的面板
class MyPanel2 extends JPanel {
	// 定义我自己的坦克
	Hero hero = null;

	// 构造函数
	public MyPanel2() {
		hero = new Hero(100, 100);
	}

	// 抽象paint
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0, 0, 400, 300);
		this.drawTanke(hero.getX(), hero.getY(), g, 0, 1);
	}

	// 画出坦克的函数
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
			g.fill3DRect(x , y, 5, 30, false);
			// 2画出右边矩形
			g.fill3DRect(x  + 15, y, 5, 30, false);
			// 3.画出中间矩形
			g.fill3DRect(x  + 5, y + 5, 10, 20, false);
			// 4.画出圆形
			g.drawOval(x  + 5, y + 10, 10, 10);
			// 5.画出线
			g.drawLine(x  + 10, y + 15, x  + 10, y);
			break;
		}

	}
}

// 定义一个坦克类
class Tank {
	int x = 0;// 横坐标
	int y = 0;// 纵坐标

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Tank(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Hero extends Tank {
	public Hero(int x, int y) {
		super(x, y);
	}
}
