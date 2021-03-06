/**
 * BorderLayout的演示
 * 1.继承自JFrame
 * 2.定义需要的各个组件
 * 3.创建组件(构造函数里面创建)
 * 4.添加组件
 * 5.对窗体设置
 * 6.显示窗体
 * */
/**
 * 注意事项:
 * 1.不是五个部分必须要添加的
 * 2.中部组件会自动添加大小
 * 3.JFrame，JDialog默认布局管理器就是BorderLayout
 * 
 * */

package com.GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo02 extends JFrame {
	//定义变量
	JButton jButton1,jButton2,jButton3,jButton4,jButton5;
	public static void main(String[] args) {
		new Demo02();

	}
	public Demo02() {
		//创建组件
		jButton1 = new JButton("中部");
		jButton2 = new JButton("北部");
		jButton3 = new JButton("东部");
		jButton4 = new JButton("南部");
		jButton5 = new JButton("西部");
		//添加各个组件
		this.add(jButton1,BorderLayout.CENTER);
		this.add(jButton2, BorderLayout.NORTH);
		this.add(jButton3, BorderLayout.EAST);
		this.add(jButton4, BorderLayout.SOUTH);
		this.add(jButton5, BorderLayout.WEST);
		//设置窗体属性
		this.setTitle("边界布局的演示");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//显示窗体
		this.setVisible(true);
	}

}
