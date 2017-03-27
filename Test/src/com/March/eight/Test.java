/*
 * 抽象类的必要性
 * 当父类的一些方法不能确定时，可以用abstract关键字来修饰该方法[抽象方法],
 * 用abstract来修饰该[抽象类]
 * 
 * 1.用abstract关键字来修饰一个类时,这个类就叫抽象类
 * 2.用abstract关键字来修饰一个方法时，这个方法就是抽象方法
 * 
 * 3.面试的时容易出笔试
 * 
 *1) 抽象类不能被实例化
 *2) 抽象类不一定要包含abstract方法,也就是说,抽象类可以没有abstract方法
 *3) 一旦类包含了abstract方法,则这个类必须声明为abstract
 *4) 抽象方法不能有主体
 * */

package com.March.eight;

public class Test {

	public static void main(String[] args) {
		//
//		Animal animal = new Animal();//抽象类不能被实例化
	}
}

//这就是一个抽象类 还是可以被继承
//抽象类中可以有实现了的方法
abstract class Animal{
	String name;
	int age;
	abstract public void cry();
	public void test() {
		System.out.println("抽象类中可以有实现的方法");
	}
}
//当一个类继承的父类是抽象类的话，需要我们把抽象类的所有方法都要实现
class Cat extends Animal{
	//实现父类的方法
	@Override
	public void cry() {
		System.out.println("喵喵~");
	}
	
}

