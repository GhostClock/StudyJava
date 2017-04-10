/**
 * 实现Runable接口的方式来编写多线程
 * 
 * */

package com.test01;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//注意启动
		Dog dog = new Dog();
		//创建一个线程对象
		Thread thread = new Thread(dog);
		thread.start();
	}

}


class Dog implements Runnable{
	int count = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			count ++;
			System.out.println("hello World " + count);
			if (count == 10) {
				break;
			}
		}
	}
	
}