/**
 * java的画图原理
 * 
 * 
 * */

package com.test01;

import java.awt.*;

import javax.swing.*;

public class Demo01 extends JFrame {
	MyPanle myPanle = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo01();
	}
	
	public Demo01() {
		myPanle = new MyPanle();
		
		this.add(myPanle);
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

//我自己的面板 用户绘图和显示的区域
class MyPanle extends JPanel{
	//重写JPanel的paint的方法
	@Override
	public void paint(Graphics g) {//Graphics绘图的重要类
		//1.调用父类函数，完成初始化任务
		super.paint(g);//不能少
		System.out.println("被执行");
		//先画一个圆
		g.drawOval(10, 10, 50, 50);
		//画直线
		g.drawLine(20, 20, 40, 40);
		//矩形边框
		g.drawRect(60, 60, 100, 100);
		//填充矩形
		//设置颜色
		g.setColor(Color.PINK);
		g.fillRect(70, 100, 30, 30);
		g.setColor(Color.red);
		g.fillRect(100, 200, 50, 50);
		
		//填充椭圆
		g.fillOval(100, 50, 60, 60);
		
		//画图片
		Image image = Toolkit.getDefaultToolkit().
				getImage(Panel.class.getResource("/NEW.jpg"));
		g.drawImage(image, 150, 90, 90, 90,this);
		
		//画字符串
		g.setFont(new Font("微软雅黑", Font.BOLD, 20));
		g.drawString("我是画出来的字符串", 200, 250);
		
		
		//画一个王八
		g.drawArc(250, 80, 120, 300, 50, 100);
		// .....
	}
}

