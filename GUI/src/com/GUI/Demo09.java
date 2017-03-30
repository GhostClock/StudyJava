/*
 * 金山词霸
 * 
 * */
package com.GUI;
import java.awt.Point;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSplitPane;
public class Demo09 extends JFrame {
	//定义组件
	JSplitPane jSplitPane;//可拆分窗格
	JList jList;
	JLabel jLabel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo09();
	}
	
	public Demo09() {
		//创建组件
		String []words = {"one","two","three","four","fiver","six",};
		jList = new JList(words);
		
		jLabel = new JLabel(new ImageIcon("images/1.png"));
		//拆分窗格
		jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jList,jLabel);//水平拆分 
		//可以变化
		jSplitPane.setOneTouchExpandable(true);//设置可收缩
		
		//设置布局关系
		
		//添加组件
		this.add(jSplitPane);
		
		//设置title
		this.setTitle("拆分窗格的演示");
		
		//设置大小
		this.setSize(400, 300);
	
		this.setLocation(400,300);;
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
