/***
 * 
 * 演示线程使用的注意事项
 * 
 * 
 * */

package com.test04;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.start();
//		cat.start(); ///线程只能启动一次
		
		Dog dog1 = new Dog();
		Thread thread1 = new Thread(dog1);
		
		Dog dog2 = new Dog();
		Thread thread2 = new Thread(dog2);
		
		thread1.start();
		thread2.start();
	}

}

class Dog implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Dog Run");
	}
	
}

class Cat extends Thread{
	public void run() {
		System.out.println("Cat Run");
	}
}