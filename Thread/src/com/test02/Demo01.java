
/**
 * 并发 两个线程同时进行
 * 
 * */

package com.test02;

import java.security.Timestamp;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig pig = new Pig(10);
		Bird bird = new Bird(10);
		Thread thread1 = new Thread(pig);
		Thread thread2 = new Thread(bird);
		
		thread1.start();
		thread2.start();
	}

}

//打印
class Pig implements Runnable{
	int n = 0;
	int times = 0;
	public Pig(int n) {
		this.n = n;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			times ++;
			System.out.println("我是一个线程，正在输出第 " + times +" 个Hello World");
			if (times == n) {
				break;
			}
		}
	}
	
}


//计算
class Bird implements Runnable{
	int n = 0;
	int result = 0;
	int times = 0;
	
	public Bird(int n) {
		this.n = n;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			result += (++ times);
			System.out.println("当前结果是：" + result);
			if (times == n) {
				System.out.println("最后的结果是：" + result);
				break;
			}
		}
	}
	
}



