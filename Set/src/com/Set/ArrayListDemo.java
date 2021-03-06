/*
 * 
 * ArrayList的用法
 * 
 * */

package com.Set;

//先引入包
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 定义一个ArrayList对象
		ArrayList arrayList = new ArrayList();
		// 显示大小
		System.out.println("array大小:" + arrayList.size());
		// 向arraylist加入数据(类型是Object)
		// 创建一个职员
		Clerk clerk1 = new Clerk("1", 20, 100);
		Clerk clerk2 = new Clerk("2", 30, 1200);
		// 加入到arrayList中
		arrayList.add(clerk1);
		arrayList.add(clerk2);
		// 两次存放同一个对象
		arrayList.add(clerk2);

		// 访问ArrayList里面的数据
		Clerk clerk = (Clerk) arrayList.get(0);
		System.out.println(clerk.getName());

		// 遍历所有的数据
		for (Object object : arrayList) {
			Clerk temp = (Clerk) object;
			System.out.println(temp.getValue());
		}

		// 从AArrayList中删除对象
		arrayList.remove(1);
	}
}

class Clerk {
	private String name;
	private int age;
	private float value;

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

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public Clerk(String name, int age, float value) {
		this.name = name;
		this.age = age;
		this.value = value;
	}
}
