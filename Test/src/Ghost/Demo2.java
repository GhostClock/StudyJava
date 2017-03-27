package Ghost;

import javax.swing.*;

public class Demo2 extends JFrame{
	
	public static void main(String[] args) {
//		Demo2 demo2 = new Demo2();
		Abc abc = new Abc();
		System.out.println(abc.getMax(12.0f, 10.f));
	}
	
//	public Demo2() {
//		this.setVisible(true);
//		this.setSize(200, 200);
//	}
}


class Abc{
	//返回较大的整数
	public int getMax(int i,int j) {
		return (i > j) ? i : j;
	}
	//方法的重载
	public float getMax(float i,float j) {
		return (i > j) ? i : j;
	}
	//仅仅是返回类型不一样,是不能构成重载的
//	public double getMax(float i,float j) {
//		return (i > j) ? i : j;
//	}
	
	
}


