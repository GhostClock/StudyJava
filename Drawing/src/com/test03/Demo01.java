/**
 * 加深对事件处理机制的理解
 * 1.通过上下左右键，来控制小球的位置
 * 
 * */

package com.test03;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class Demo01 extends JFrame {
	MyPanel myPanel = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo01();
	}
	
	public Demo01() {
		myPanel = new MyPanel();
		
		//加到JFrame上
		this.add(myPanel);
		this.addKeyListener(myPanel);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

//定义自己的面板
class MyPanel extends JPanel implements KeyListener{
	
	int x = 10; 
	int y = 10;
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.fillOval(x, y, 10, 10);
		
	}

	@Override
	//键值被输出
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//键被按下
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("Key Clicking " + (char)e.getKeyCode() );
		
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 3;
		}else if (e.getKeyCode() == KeyEvent.VK_UP) {
			y -= 3;
		}else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= 3;
		}else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 3;
		}
		//调用repaint函数，来重新绘制界面
		repaint();
	}

	@Override
	//键被释放
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
