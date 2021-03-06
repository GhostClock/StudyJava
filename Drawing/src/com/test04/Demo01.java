/**
 * 事件编写的步骤
 * 1.编写事件处理类(事件监听者)
 * 2.根据需求给处理类实现监听接口
 * 3.在事件处理类中重写起事件处理的函数
 * 4.在事件源中指定该事件的监听的响应者是谁,即注册监听 
 * 
 * */

package com.test04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Demo01 extends JFrame {
	MyPanel myPanel = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo01();
	}
	public Demo01() {
		// TODO Auto-generated constructor stub
		myPanel = new MyPanel();
		//注册监听
		this.addMouseListener(myPanel);
		this.addKeyListener(myPanel);
		this.addMouseMotionListener(myPanel);
		this.addWindowListener(myPanel);
		
		this.add(myPanel);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
//1.让MyPanel 知道鼠标按下的消息,并知道鼠标点击的位置
//2.让MyPanel 知道哪个键按下了
//3.让MyPanel 知道鼠标移动 拖拽
//4.让MyPanel 指导窗口的变化 (关闭,最小化,最大化)

class MyPanel extends JPanel implements MouseListener,KeyListener,MouseMotionListener,WindowListener{
	@Override
	
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
	}

	@Override
	//鼠标点击
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标点击了 x = " + e.getX() + " y = " + e.getY());
	}

	@Override
	//鼠标按下
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标按下");
	}

	@Override
	//鼠标松开
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标松开");
	}

	@Override
	//鼠标移动到
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标来了");
	}

	@Override
	//鼠标离开
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标离开");
	}

	@Override
	//输入的值
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//键按下
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar() + "键被按下");
	}

	@Override
	//键松开
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//鼠标拖拽
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标拖拽");
	}

	@Override
	//鼠标移动
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标移动 ---> 当前坐标 x = " + e.getX() + " y = " + e.getY());
	}

	@Override
	//窗口打开了
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//窗口正在关闭
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("窗口正在关闭");
	}

	@Override
	//窗口关闭了
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//窗口激活了
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("窗口激活了");
	}

	@Override
	//窗空最小化
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("窗口最小化了");
	}
	
	
}