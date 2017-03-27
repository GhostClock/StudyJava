/*
 * 对象数组的使用
 * 
 * */
package com.test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//定义一个对象数组，创建长度为4
		Dog dogs[] = new Dog[4];
		
		//给各个狗付初始值
//		dog[0].setName("花花");----> 这样赋值会报空指针异常 java.lang.NullPointerException
//		dog[0].setWeight(4.5f);
		
//		dog[0] = new Dog(); ---> 必须要创建
//		dog[0].setName("花花");
//		dog[0].setWeight(1.5f);
		
		//充控制台输入各个狗的消息
		for (int i = 0; i < 4; i++) {
			dogs[i] = new Dog();//必不可少
			
			System.out.println("请输入第" + (i + 1) + "狗的名字");
			//从控制台读取狗名
			String name = getUserInput().readLine();
			//将名字付给dog对象
			dogs[i].setName(name);
			
			System.out.println("请输入第" + (i + 1) + "狗的体重");
			String weight = getUserInput().readLine();
			dogs[i].setWeight(Float.parseFloat(weight));//把String转化为float
		}
		//1.先计算总体重
		float allWeight = 0;
		//2.计算平均体重
		for (int i = 0; i < dogs.length; i++) {
			allWeight += dogs[i].getWeight();
		}
		System.out.println("狗的总体重为:" + allWeight + "\n"
		 + "狗的平均体重为:" + allWeight / dogs.length);
		
		//找出体重最大和最小的狗
		Dog weightMax = dogs[0];
		Dog weightMin = dogs[0];
		for (int i = 1; i < dogs.length; i++) {
			if (dogs[i].getWeight() > weightMax.getWeight()) {
				weightMax = dogs[i];
			}
			if (dogs[i].getWeight() < weightMin.getWeight()) {
				weightMin = dogs[i];
			}
		}
		System.out.println("体重最大狗的名字:" + weightMax.getName() + "体重为:" + weightMax.getWeight() +"\n" +
				" 体重最小狗的名字:" + weightMin.getName() + "体重为:" + weightMin.getWeight() );
		//根据名字来查找狗的体重
		
		System.out.println("请输入你要查找的狗的名字:");
		String name = getUserInput().readLine();
		for (int i = 0; i < dogs.length; i++) {
			if (name.equals(dogs[i].getName())) {
				System.out.println("你查找的狗的名字为:"
						+ dogs[i].getName() + " 体重为:" + dogs[i].getWeight());
			}
		}
		//==比较的是地址 equals比较的是字符串内容
		
		
		
	}
	
	private static BufferedReader getUserInput() {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		return bufferedReader;
	}

}

//定义一个狗类

class Dog{
	private String name;
	private float weight;
	
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
