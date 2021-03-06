//事件处理机制
/**
 * Java事件处理是采取"委派事件处理模型",所谓"委派事件模型"是指当事件发生时,产生事件的对象(即事件源)
 * 会把此"信息"传递给"事件的监听者"处理的一种方式,而这里所说的"信息"实际上就是java.awt.event事件类库
 * 里某个类所创建的对象,
 * 
 * 
 * */
package com.test02;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Demo01 extends JFrame implements ActionListener {
	JPanel myPanel = null;
	JButton jButton1 = null;
	JButton jButton2 = null;
	public static void main(String[] args) {
		new Demo01();

	}

	public Demo01() {
		myPanel = new JPanel();
		myPanel.setBackground(Color.black);
		jButton1 = new JButton("黑色");
		jButton2 = new JButton("红色");
		
		//注册监听
		jButton1.addActionListener(this);
		//指定Action的命令
		jButton1.setActionCommand("black");
		
		jButton2.addActionListener(this);
		jButton2.setActionCommand("red");
		
		Cat cat = new Cat();
		jButton1.addActionListener(cat);//用别的类来监听
		jButton2.addActionListener(this);
		this.add(jButton1,BorderLayout.NORTH);
		this.add(myPanel);
		this.add(jButton2,BorderLayout.SOUTH);
		
		this.setSize(200, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	//事件处理方法
	@Override
	public void actionPerformed(ActionEvent e) {
		//判断是哪个按钮被点击
		if (e.getActionCommand().equals("black")) {
			System.out.println("click Black button");
			myPanel.setBackground(Color.black);
		}else if (e.getActionCommand().equals("red")) {
			System.out.println("click Red button");
			myPanel.setBackground(Color.red);
		}else {
			//
		}
		
	}
}

class Cat implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("black")) {
			System.out.println("Cat get Black Action");
		}else if (e.getActionCommand().equals("red")) {
			System.out.println("Cat get Red Action");
		}
	}
	
}
/**
 * 1.一个类要实现的监听步骤
 * a.实现相应的接口[KeyListerener,MouseListerent,WindoeListerent]
 * b.把接口的处理方法根据需要重新编写
 * c.在事件源上注册监听
 * d.事件的传递是靠事件类的
 * */


//class MyPanel extends JPanel{
//	@Override
//	public void paint(Graphics g) {
//		// TODO Auto-generated method stub
//		super.paint(g);
//		g.fillRect(0, 0, 200, height);
//	}
//}
