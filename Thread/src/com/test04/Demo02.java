/**
 * 售票系统   只要在需要同步的代码加上sybchronized(Object) {}即可
 * 
 * */

/**
 * 同步机制的解释:
 * java任意类型的对象都有一个标志位 该标志位具有0 1两种状态 其默认状态为1，当某个线程执行了synchronized(object)语句后
 * object对象的标志位变为0状态，直到执行完整个synchronized语句中的代码块后。该对象才又回到1的状态
 * 
 * 
 * 当一个线程执行到synchronized(Object)语句的时候,先检查object对象的标志位,如果为0状态，
 * 表明已经有另外的线程正在执行synchronized中的代码,那么这个线程将暂时阻塞，让出cpu资源
 * ，直到另外的线程执行完相关同步的代码，并将object对象的标志位变成1的状态,这个线程的阻塞才被取消，
 * 线程能继续运行，该线程有将object的标志为变成0状态,防止其他线程再次进入到代码块中
 * 
 * */


package com.test04;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 定义三个售票窗口
		TicketWindow tWindow1 = new TicketWindow();

		// TicketWindow tWindow2 = new TicketWindow();
		//
		// TicketWindow tWindow3 = new TicketWindow();

		Thread thread1 = new Thread(tWindow1);
		Thread thread2 = new Thread(tWindow1);
		Thread thread3 = new Thread(tWindow1);

		thread1.start();
		thread2.start();
		thread3.start();
	}

}

// 售票窗口
class TicketWindow implements Runnable {
	// 一共有2000张票
	private int numbers = 2000;
	private Dog1 myDog = new Dog1();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			// 出票速度是1秒出一张
			try {
				Thread.sleep(20);
			} catch (Exception e) {
				// TODO: handle exception
			}

			// 认为这个if else要保证原子性
			synchronized (myDog) { //同步代码块 this对象本身
				// 先判断是否还有票
				if (numbers > 0) {
					// 显示售票信息 Thread.currentThread().getName() 当前线程的编号
					System.out.println(Thread.currentThread().getName() + "只在售出第 " + numbers + "张票");
					numbers--;
				} else {
					// 售票结束
					break;
				}
			}
		}
	}
}

class Dog1 {
	
}



