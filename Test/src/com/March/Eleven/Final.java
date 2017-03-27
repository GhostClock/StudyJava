/*
 * final 可以修饰变量或者方法
 * 在某些情况下，程序员可能有以下需求
 * 1.当不希望父类的某个方法被子类覆盖（override）时,可以用final关键字修饰
 * 2.当不希望类的某个变量的之被修改使，可以用final来修饰
 * 3.当不希望类被继承时，可以用final来修饰 ，该类不能被继承
 * 4.如果一个类是final，则必须付初始值
 * 
 * 注意事项:
 * 1.final修饰的变量又叫常量，一般用 xx_xx_xx来命名
 * 2.final修饰的变量在定义时，必须赋值，并且以后不能在赋值
 * 
 * final什么时候用
 * 1.因为安全考虑，类的某个方法不允许被修改
 * 2.类不会被其他的类继承
 * 3.某些变量是固定不变的，比如圆周率3.141592654
 * 
 * */
package com.March.Eleven;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aaa aaa = new Aaa();
		aaa.show();
	}

}

class Aaa{
	int a = 0;//不给初值时是多少 
	final float pi = 3.1415926f;
	//给成员方法用final来修饰 ，则表示不可以被修改，不可以被覆盖
	final public void sendMse() {
		System.out.println("发送消息");
	}
	
	public void show() {
		System.out.println(a);
	}
}

class Bbb extends Aaa{
	//不能被子类修改
//	public void sendMse() {
//		System.out.println("发送消息");
//	}
	
	public Bbb() {
		// TODO Auto-generated constructor stub
		a ++;
//		pi ++;// 不能被修改
	}
	
	
}
