package com.Generic;

import java.lang.reflect.Method;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Bird> gen = new Gen<Bird>(new Bird());//反射机制
		gen.showTypeName();
		
	}

}

//定义一个Bird
class Bird{
	public void test1() {
		System.out.println("aa");
	}
	public void count(int a,int b) {
		System.out.println(a + b);
	}
	
}


//定义一个类
class Gen<T>{
	private T o;
	
	//构造函数
	public Gen(T a) {
		// TODO Auto-generated constructor stub
		o = a;
	}
	
	//得到T的类型名称
	public void showTypeName() {
		System.out.println("类型是:" + o.getClass().getName());
		//通过反射机制，我们可以得到类的很多信息 得到成员函数名
		Method  method[] = o.getClass().getDeclaredMethods();
		//打印
		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i].getName());
		}
	}
	
}