
/**
 * 泛型的必要性
 * 
 * */

package com.Generic;

import java.util.ArrayList;

public class Generic_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Dog> arrayList = new ArrayList<Dog>();
		//创建对象
		Dog dog = new Dog();
		arrayList.add(dog);
		//取出
//		Dog dog2 = (Dog)arrayList.get(0);//这里必须强转一下
		Dog dog2 = arrayList.get(0);
		
	}

}



class Dog{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

