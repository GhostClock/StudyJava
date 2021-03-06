/**
 * FlowLayout 的演示
 * */
/**
 * FloaLayout布局,是按照组件的添加次序将组件从左往右放置只在容器中,
 * 当到达容器的边界时,组件将放置在下一行,FlowLayout可以左对其,居中对其,
 * 右对其的方式排列组件
 * 
 * */

/**
 * 流式布局：
 * 1.不限制他所管理的组件大小,允许他们有最佳大小
 * 2.当容器被缩放时,组件的位置可能变化,但是组件的大小不变
 * 3.默认组件是居中对其,可以通过FlowLayout(int align)函数来指定对其方式
 * 
 * */

package com.GUI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo03 extends JFrame {
	// 定义需要的组件
	JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo03();
	}

	// 构造函数
	public Demo03() {
		// 创建组件
		jButton1 = new JButton("关羽");
//		jButton1.setSize(100, 200);
		jButton2 = new JButton("张飞");
		jButton3 = new JButton("赵云");
		jButton4 = new JButton("马超");
		jButton5 = new JButton("黄忠");
		jButton6 = new JButton("魏延");

		// 添加组件
		this.add(jButton1);
		this.add(jButton2);
		this.add(jButton3);
		this.add(jButton4);
		this.add(jButton5);
		this.add(jButton6);

		//设置布局管理器
		this.setLayout(new FlowLayout(FlowLayout.LEFT));//默认是居中对其
		
		// 设置窗体属性
		this.setTitle("流式布局的演示");
		this.setSize(350, 200);
		this.setLocation(200, 200);
		
		//禁止用户改变窗体大小
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//显示组件
		this.setVisible(true);
	}

}
