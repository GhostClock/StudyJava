/**
 * GUI界面的开发
 * 
 * 
 * */

package com.GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo01 extends JFrame {
	// 把需要的Swing组件定义为一个属性
	JButton jButton;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo01 test01 = new Demo01();

	}

	// 构造函数
	public Demo01() {
		
		// 创建一个JButton
		jButton = new JButton("按钮");
		// 添加JButton组件
		this.add(jButton);
		// 给窗体设置标题
		this.setTitle("Hello World");
		// 设置大小 传入像素
		this.setSize(300, 300);
		// 设置初始位置
		this.setLocation(100, 200);
		// 设置当关闭窗口的时候 保证jvm也退出
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 显示
		this.setVisible(true);
	}
}
