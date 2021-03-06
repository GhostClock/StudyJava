/**
 * JComboBox & JList & JScorllPane
 * 
 * */
package com.GUI;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Demo08 extends JFrame {
	JPanel jPanel1, jPanel2;
	JLabel jLabel1, jLabel2;
	JComboBox jComboBox;
	JList jList;
	JScrollPane jScrollPane;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo08();
	}
	
	public Demo08() {
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		
		jLabel1 = new JLabel("你的籍贯");
		jLabel2 = new JLabel("旅游地点");
		
		String[] jComboBoxString = {"北京","上海","天津","月球"};
		jComboBox = new JComboBox(jComboBoxString);
		
		String []dd = {"张家界","故宫","长城","天安门","张家界","故宫","长城"};
		jList = new JList(dd);
		//设置希望显示多少个选项
		jList.setVisibleRowCount(5);
		jScrollPane = new JScrollPane(jList);
		
		//设置布局
		this.setLayout(new GridLayout(3, 1));
		
		//添加组件
		jPanel1.add(jLabel1);
		jPanel1.add(jComboBox);
		
		jPanel2.add(jLabel2);
		jPanel2.add(jScrollPane);
		
		this.add(jPanel1);
		this.add(jPanel2);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
