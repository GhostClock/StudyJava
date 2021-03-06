/**
 * 多种布局管理器的使用
 * 
 * */
/**
 * JPanel:面板组件
 * JPanel 面板组件,非顶层容器
 * 一个界面只可以有一个JFrame窗体组件,但是可以有多个JPanel面板组件,而JPanel
 * 上也可以使用FlowLayout,BorderLayout,GirdLayout等各种布局管理器,这样
 * 可以组合使用达到较为复杂的布局效果
 * */

/**
 * 1.JPanel是JComponent的子类
 * 2.属于容器类组件,可以加入别的组件
 * 3.默认布局管理器是流式布局(FlowLayout)
 * */


package com.GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo05 extends JFrame {
	//定义组件
	JPanel jPanel1,jPanel2;
	JButton jButton1,jButton2,jButton3,jButton4,jButton5,jButton6;
	public static void main(String[] args) {
		new Demo05();

	}
	//构造函数
	public Demo05() {
		//创建组件
		//JPanel布局默认是FlowLayout
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		
		jButton1 = new JButton("西瓜");
		jButton2 = new JButton("苹果");
		jButton3 = new JButton("荔枝");
		jButton4 = new JButton("橘子");
		jButton5 = new JButton("干货");
		jButton6 = new JButton("香蕉");
		
		//设置布局管理器
		
		//添加组件JPanel
		jPanel1.add(jButton1);
		jPanel1.add(jButton2);
		jPanel2.add(jButton3);
		jPanel2.add(jButton4);
		jPanel2.add(jButton5);
		
		//把JPanel添加到JFrame
		this.add(jPanel1, BorderLayout.NORTH);
		this.add(jButton6,BorderLayout.CENTER);
		this.add(jPanel2, BorderLayout.SOUTH);
		
		this.setSize(300, 200);
		this.setLocation(200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
