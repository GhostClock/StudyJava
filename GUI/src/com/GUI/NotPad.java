
/**
 * 记事本
 * 
 * */

package com.GUI;
import java.awt.BorderLayout;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class NotPad extends JFrame {
	private static final int InputEvent = 0;
	JMenuBar jMenuBar;//菜单条组件
	JMenu menu1,menu2,menu3,menu4,menu5;
	JMenuItem item2,item3,item4,item5,item6,item7;
	JMenu xinjian;//二级菜单
	JMenuItem file,project;
	
	JTextArea jTextArea;
	
	JToolBar jToolBar;//工具条
	JButton jButton1,jButton2,jButton3,jButton4,jButton5,jButton6;
	
	public static void main(String[] args) {
		new NotPad();
	}
	public NotPad() {
		//创建组件
		jToolBar = new JToolBar();
		jButton1 = new JButton(new ImageIcon("images/NWE.jpg"));
		jButton1.setToolTipText("新建");//设置提示信息
		jButton2 = new JButton(new ImageIcon("images/OPEN.jpg"));
		jButton2.setToolTipText("打开");
		jButton3 = new JButton(new ImageIcon("images/SAVE.jpg"));
		jButton4 = new JButton(new ImageIcon("images/COPY.png"));
		jButton5 = new JButton(new ImageIcon("images/CUT.jpg"));
		jButton6 = new JButton(new ImageIcon("images/PASTE.jpg"));
		
		jMenuBar = new JMenuBar();
		
		menu1 = new JMenu("文件(F)");
		menu1.setMnemonic('F');//设置助记符
		menu2 = new JMenu("编辑(E)");
		menu2.setMnemonic('E');
		menu3 = new JMenu("格式(O)");
		menu3.setMnemonic('O');
		menu4 = new JMenu("查看(V)");
		menu4.setMnemonic('V');
		menu5 = new JMenu("帮助(H)");
		menu5.setMnemonic('H');
		
		xinjian = new JMenu("新建");
		file = new JMenuItem("文件");
		project = new JMenuItem("工程");
		
		item2 = new JMenuItem("打开",new ImageIcon("new.jpg"));
		item3 = new JMenuItem("保存(S)");
		item3.setMnemonic('S');
		//和哦菜单项添加快捷键
		item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent));
		item4 = new JMenuItem("另存为");
		item5 = new JMenuItem("页面设置");
		item6 = new JMenuItem("打印");
		item7 = new JMenuItem("退出");
		
		jTextArea = new JTextArea();
		
		//设置布局
		
		//添加组件
		//将按钮添加到工具条
		jToolBar.add(jButton1);
		jToolBar.add(jButton2);
		jToolBar.add(jButton3);
		jToolBar.add(jButton4);
		jToolBar.add(jButton5);
		jToolBar.add(jButton6);
		
		//将菜单项添加到菜单上
		xinjian.add(file);
		xinjian.add(project);
		
		menu1.add(xinjian);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		menu1.addSeparator();//设置分割线
		menu1.add(item5);
		menu1.add(item6);
		menu1.addSeparator();
		menu1.add(item7);
		
		//将菜单添加到菜单条上
		jMenuBar.add(menu1);
		jMenuBar.add(menu2);
		jMenuBar.add(menu3);
		jMenuBar.add(menu4);
		jMenuBar.add(menu5);
		
		//将菜单条添加到窗体上
		this.setJMenuBar(jMenuBar);
		
		//将工具条添加到窗体上
		this.add(jToolBar,BorderLayout.NORTH);
		
		JScrollPane jScrollPane = new JScrollPane(jTextArea);
		jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(jScrollPane);
		
		//显示
		this.setTitle("记事本");
		ImageIcon icon = new ImageIcon("images/QQLOGO64x64.png");
		this.setIconImage(icon.getImage());
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
}
