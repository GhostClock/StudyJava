/*
 * 接口
 *1.接口不能被实例化
 *2.接口中所有的方法都不能有主体
 *3.一个类可以实现多个接口
 *4.接口中可以有变量 ，但是变量不能用private和protect修饰
 * a).接口中的变量，实质上都是static的,而且是final类型，不管你加不加static修饰
 * b).在Java开发中，我们经常把经常用的变量，定义在接口中，作为全局变量使用，
 * 	访问形式:接口名.变量名
 *5.一个接口不能继承其他的类，但是可以继承别的接口
 * 
 * 
 * 接口是更加抽象的抽象类,抽象类里面的方法可以有方法体,接口里面所有的方法都没有
 * 方法体，接口体现了程序设计的多态和高内聚低耦合的设计思想
 * 
 * */
package com.March.Nine;

public class Tets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Usb.a);
		
		//创建计算机
		Computer computer = new Computer();
		
		//创建Camera
		Camera camera = new Camera();
		
		//创建 Phone
		Phone phone = new Phone();
		
		computer.useUsb(camera);
		computer.useUsb(phone);
	}

}

interface Aaa{
	public void Eee();
}

interface kk extends Aaa{
	public void test();
}

//定义一个接口
interface Usb{
	int a = 0;//静态的
	
	//声明了两个方法
	public void strat();//开始工作
	public void stop();//停止工作
}
//编写了一个照相机类 实现了Usb的这个接口 --> 必须把接口里面的方法都要实现
//一个重要的原则：当一个类实现了一个接口，就要去该类把这个接口类的所有方法统统实现
class Camera implements Usb,kk{
	@Override
	public void strat() {
		System.out.println("相机开始工作");
	}
	@Override
	public void stop() {
		System.out.println("相机停止工作");
		
	}
	
	@Override
	public void test() { //实现kk接口里面的方法
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void Eee() {//实现Eee接口里面的方法
		// TODO Auto-generated method stub
		
	}
}
//编写了一个手机类 也实现Usb这个接口
class Phone implements Usb{
	@Override
	public void strat() {
		System.out.println("手机开始工作");
	}
	@Override
	public void stop() {
		System.out.println("手机停止工作");
	}
}
//计算机
class Computer{
	//开始使用Usb接口
	public void useUsb(Usb usb) {
		usb.strat();
		usb.stop();
	}
}



