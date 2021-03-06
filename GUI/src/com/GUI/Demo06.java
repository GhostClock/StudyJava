
package com.GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Demo06 extends JFrame {
	// 定义组件
	JPanel jPanel1, jPanel2, jPanel3;
	JLabel jLabel1, jLabel2;
	JButton jButton1, jButton2;
	JTextField jTextField1;
	JPasswordField jPasswordField;

	public static void main(String[] args) {
		new Demo06();
	}

	public Demo06() {
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		jPanel3 = new JPanel();

		jLabel1 = new JLabel("用户名: ");
		jLabel2 = new JLabel("密	 码: ");

		jTextField1 = new JTextField(10);// 宽度是10
		jPasswordField = new JPasswordField(10);

		jButton1 = new JButton("登录");
		jButton2 = new JButton("取消");

		// 设置布局管理器
		this.setLayout(new GridLayout(3, 1));

		// 添加各个组件
		jPanel1.add(jLabel1);
		jPanel1.add(jTextField1);

		jPanel2.add(jLabel2);
		jPanel2.add(jPasswordField);

		jPanel3.add(jButton1);
		jPanel3.add(jButton2);

		// 添加到JFrame
		this.add(jPanel1);
		this.add(jPanel2);
		this.add(jPanel3);

		this.setResizable(false);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 150);
		this.setTitle("混合布局 - 登录页面");
		this.setVisible(true);
		
	}

	

}
