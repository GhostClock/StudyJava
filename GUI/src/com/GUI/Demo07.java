/**
 * 复选框和单选框的案例
 * 
 * */

package com.GUI;

import java.awt.GridLayout;

import javax.rmi.CORBA.Tie;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Demo07 extends JFrame {
	//定义
	JPanel jPanel1,jPanel2,jPanel3;
	JLabel jLabel1,jLabel2;
	JButton jButton1,jButton2;
	JCheckBox jCheckBox1,jCheckBox2,jCheckBox3;
	JRadioButton jRadioButton1,jRadioButton2;
	ButtonGroup buttonGroup;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo07();
	}
	
	//构造函数
	public Demo07() {
		//创建组件
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		jPanel3 = new JPanel();
		
		jLabel1 = new JLabel("你喜欢的运动");
		jLabel2 = new JLabel("你的性别");
		
		jButton1 = new JButton("注册用户");
		jButton2 = new JButton("取消注册");
		
		jCheckBox1 = new JCheckBox("足球");
		jCheckBox2 = new JCheckBox("篮球");
		jCheckBox3 = new JCheckBox("乒乓球");
		
		jRadioButton1 = new JRadioButton("男");
		jRadioButton2 = new JRadioButton("女");
		
		//要把RadioButton放在一个ButtonGroup里面去管理
		buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButton1);
		buttonGroup.add(jRadioButton2);
		
		//设置布局管理
		this.setLayout(new GridLayout(3,1));//网格布局
		
		//添加组件
		jPanel1.add(jLabel1);
		jPanel1.add(jCheckBox1);
		jPanel1.add(jCheckBox2);
		jPanel1.add(jCheckBox3);
		
		jPanel2.add(jLabel2);
		jPanel2.add(jRadioButton1);
		jPanel2.add(jRadioButton2);
		
		jPanel3.add(jButton1);
		jPanel3.add(jButton2);
		
		this.add(jPanel1);
		this.add(jPanel2);
		this.add(jPanel3);
		
		this.setSize(300,150);
		this.setTitle("用户管理系统登录");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
