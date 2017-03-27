/*
 * java的继承是单继承,也就是一个类最多只能有一个父类，这种单继承的机制保证类的纯洁
 * 性,比C++中多继承机制要简洁，但是不可否认，对子类功能的扩展有一定的影响，所以我们
 * 认为:(1),实现接口可以看作是对继承的一种补充 (2),实现接口可在不打破继承关系的
 * 前提下，对某个类功能的扩展，非常灵活
 * 
 * */

package com.March.eight;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Fish{
	public void	swiming();
}

interface Bird{
	public void fly();
}

class Monkey{
	String name;
	public void jump() {
		System.out.println("跳来跳去");
	}
}

class LittleMonkey extends Monkey implements Fish,Bird{//弥补单继承
	@Override
	public void swiming() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}
