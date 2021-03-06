/**
 * 演示如何通过继承Thread来开发线程
 * 
 * */

package com.test01;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建一个对象
		Cat cat = new Cat();
		//启动线程 会导致run函数的运行
		cat.start();
	}

}

class Cat extends Thread{
	//重写run函数
	int count = 0;
	@Override
	public void run() {
		super.run();
		while (true) {
			//休眠一秒
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1000毫秒 sleep会让该线程Blocked状态，并释放资源
			count ++;
			System.out.println("hello World " + count);
			if (count == 10) {
				break;
			}
		}
		
	}
}
