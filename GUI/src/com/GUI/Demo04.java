/**
 * 网格布局 GridLayout 
 * GridLayout 布局，是将容器分割成多行多列,组件被填充到每个网格中,
 * 添加到容器中的组件首先放置在左上角的网格中，然后从左到右放置其他的组件
 * 当占满该行的所有网格后，接着继续在下一行从左到右放置组件
 * */
/**
 * 注意事项
 * 1.组件的相对位置不随容器的缩放而变化,但是大小会变化
 * 2.所有组件的大小相同
 * 3.可以通过GridLayout(int rows,int cols,float hgap,float vgap)来定义
 * 网格的行/列,水平间隙/垂直间隙
 * 
 * */


package com.GUI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo04 extends JFrame {
	//定义组件
	int size = 9;
	JButton jbButtons[] = new JButton[size];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo04();
	}
	
	public Demo04() {
		//创建组件
		for (int i = 0; i < size; i++) {
			jbButtons[i] = new JButton(String.valueOf(i));
		}
		//设置网格管理器
		this.setLayout(new GridLayout(3, 3,10,10));//显示几行几列 , 上下间距
		//添加组件
		for (int i = 0; i < size; i++) {
			this.add(jbButtons[i]);
		}
		//设置窗体属性
		this.setTitle("网格布局案例");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200, 300);
		this.setVisible(true);
		
	}
}
