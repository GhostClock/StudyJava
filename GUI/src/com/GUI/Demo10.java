/**
 * QQ聊天界面
 * 
 * */
package com.GUI;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Demo10 extends JFrame {
	JTextArea jTextArea;
	JPanel jPanel;
	JScrollPane jScrollPane;//为了文本框可以滚动
	JComboBox jComboBox;
	JTextField jTextField;
	JButton jButton;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo10();
	}

	public Demo10() {
		jTextArea = new JTextArea();
		jScrollPane = new JScrollPane(jTextArea);
		jPanel = new JPanel();
		String []persons = {"布什","林肯","华盛顿","奥巴马"};
		jComboBox = new JComboBox(persons);
		jTextField = new JTextField(10);
		jButton = new JButton("发送");
		
		//设置布局管理器
		
		//添加组件
		jPanel.add(jComboBox);
		jPanel.add(jTextField);
		jPanel.add(jButton);
		
		//加入到JFrame上面
		this.add(jScrollPane);
		this.add(jPanel,BorderLayout.SOUTH);
		
		//设置属性
		this.setResizable(false);
		this.setTitle("腾讯QQ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350, 260);
		this.setLocation(300,300);
		this.setIconImage((new ImageIcon("images/QQLOGO64x64.png")).getImage());
		this.setVisible(true);
		
	}
}
