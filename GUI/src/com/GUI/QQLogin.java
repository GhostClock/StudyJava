/**
 * QQ登录页面
 * 
 * */

package com.GUI;
import java.awt.*;
import javax.swing.*;

public class QQLogin extends JFrame {
	//北部区域
	JLabel jLabel1;
	
	//南部区域
	JButton jButton1,jButton2,jButton3;
	JPanel jPanel1;
	
	//中部区域
	JTabbedPane jTabbedPane;//选择卡窗格
	JPanel jPanel2,jPanel3,jPanel4;
	
	JLabel jLabel2,jLabel3,jLabel4,jLabel5;
	//号码文本框
	JTextField jTextField;
	//密码
	JPasswordField jPasswordField;
	//清除号码的Button
	JButton jButton4;
	//隐身登录,记住密码
	JCheckBox jCheckBox1,jCheckBox2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new QQLogin();
	}
	
	public QQLogin() {
		jLabel2 = new JLabel("QQ号码",JLabel.CENTER);
		jLabel3 = new JLabel("QQ密码",JLabel.CENTER);
		
		jLabel4 = new JLabel("忘记密码",JLabel.CENTER);
		jLabel4.setFont(new Font("微软雅黑", Font.PLAIN, 16));//设置字体
		jLabel4.setForeground(Color.BLUE);//设置字体颜色
		
		jLabel5 = new JLabel("<html><a href='www.baidu.com'>申请密码保护</a></html>");
		jLabel5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//把鼠标变成手的图标
		
		//输入号码
		jTextField = new JTextField();
		//输入密码
		jPasswordField = new JPasswordField();
		
		jButton4 = new JButton(new ImageIcon("images/search_tokenfield_delete_hover@2x.png"));
		//复选框
		jCheckBox1 = new JCheckBox("隐身登录");
		jCheckBox2 = new JCheckBox("记住密码");
		
		//北部
		jLabel1 = new JLabel(new ImageIcon("images/QQLOGO64x64.png"));
		
		//南部
		jPanel1 = new JPanel();
		jButton1 = new JButton(new ImageIcon("images/login.png"));
		jButton2 = new JButton(new ImageIcon("images/quxiao.png"));
		jButton3 = new JButton(new ImageIcon("images/zhuce.png"));
		
		//中部区域
		jTabbedPane = new JTabbedPane();
		jPanel2 = new JPanel();
		jPanel3 = new JPanel();
		jPanel3.setBackground(Color.red);//给面板设置背景颜色
		jPanel4 = new JPanel();
		jPanel4.setBackground(new Color(0, 0, 255));
		
		//将面板添加到选项卡窗格上
		jTabbedPane.add("QQ号码", jPanel2);
		jTabbedPane.add("手机号码", jPanel3);
		jTabbedPane.add("电子邮箱", jPanel4);
		
		//设置布局
		jPanel2.setLayout(new GridLayout(3, 3));
		
		//添加组件
		jPanel1.add(jButton1);
		jPanel1.add(jButton2);
		jPanel1.add(jButton3);
		
		jPanel2.add(jLabel2);
		jPanel2.add(jTextField);
		jPanel2.add(jButton4);
		jPanel2.add(jLabel3);
		jPanel2.add(jPasswordField);
		jPanel2.add(jLabel4);
		jPanel2.add(jCheckBox1);
		jPanel2.add(jCheckBox2);
		jPanel2.add(jLabel5);
		
		this.add(jPanel1,BorderLayout.SOUTH);
		this.add(jLabel1, BorderLayout.NORTH);
		this.add(jTabbedPane, BorderLayout.CENTER);
		
		//显示组件
		this.setIconImage((new ImageIcon("images/QQLOGO64x64.png")).getImage());
		this.setSize(480, 340);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
}
