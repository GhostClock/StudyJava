
package com.Exception;

import java.io.FileReader;

public class Demo02 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Father father = new Father();
		father.test1();
	}

}

class Father{
	private Son son = null;
	public Father() {
		// TODO Auto-generated constructor stub
		son = new Son();
	}
	public void test1() throws Exception{
		System.out.println("1");
//		try {
			son.test2();
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("异常在这儿处理");
//			e.printStackTrace();
//		}
		
	}
}

class Son{
	public void test2() throws Exception{
		FileReader fileReader = null;
		fileReader = new FileReader("/Users/ghostclock/Desktop/bb.txt");
	}
}
