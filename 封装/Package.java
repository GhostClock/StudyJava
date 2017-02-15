
public class Package{
	static int i = 1;

	static { //静态区域块 只会执行一个
		i ++;
	}

	public Package(){
		i ++;
	}

	public static void main(String[] args) {
		// Package package1  = new Package();
		// System.out.println(package1.i);//3

		// Package package2  = new Package();
		// System.out.println(package2.i);//4


		Stu stu1 = new Stu(11,"aa",360);

		Stu stu2 = new Stu(11,"aa",360);

		System.out.println(Stu.getTotalFee());

	}

}


class Stu{
	int age;
	String name;
	int fee;
	static int totalFee;
	public Stu(int age,String name,int fee){
		this.age = age;
		this.name = name;
		totalFee += fee;
	}

	//java中规则：类（静态变量）变量原则上用类（静态）方法去访问
	public static int getTotalFee(){ //类方法 静态方法
		return totalFee;
	}
}