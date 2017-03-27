package com.xiangqiang;
import com.xiaoming.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		System.out.println(dog1.name);
		
		
		Cat cat = new Cat();
		System.out.println();
	}

}

class Dog{
	public int a;
	protected String name;
	String color;
	private float price;
	
	public void ab(){
		System.out.println(a);
	}
	
}
