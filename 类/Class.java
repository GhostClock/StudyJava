public class Class{
	public static void main(String[] args) {
		/*
		System.out.println(" -- " + args + " -- ");

		//创建一个对象
		// Cat cat = new Cat();
		cat.age = 3;
		cat.name = "小花";
		cat.color = "red";
		cat.master.name = "Ghost";
		System.out.println(cat);

		Cat ca = new Cat();
		ca.age = 10;
		ca.name = "小包";
		ca.color = "blue";
		ca.master.name = "Clock";
		*/

		/*
		Person a = new Person();
		a.age = 10;
		a.name = "Ghost";
		System.out.println(a);
		Person b;
		b = a;
		System.out.println(b);
		*/
		Person person1 =  new Person(10,"Ghost");
		person1.speack();
		person1.jisuan(100);
		person1.add(1,2);
		System.out.println("----> " + person1.add2(2,3));
		person1.add3(1,2.3);


	}
}

class Person{
	int age ;
	String name;

	//构造方法 的主要作用：初始化成员变量（属性）
	public Person(int age,String name){
		age = age;
		name = name;
	}


	public void speack(){
		System.out.println("Im a good man");
	}
	public void jisuan(int number){
		int result = 0;
		for (int i = 1; i <= number; i ++) {
			result += i;
		}
		System.out.println(result);
	}
	public void add(int a,int b){
		System.out.println("a + b = " + (a + b));
	}

	public int add2(int num1,int num2){
		return num1 + num2;
	}

	public double add3(int num1,double num2){
		return num1 + num2;
	}
}

//如何定义一个类
class Cat{
	//类的成员变量
	int age;
	String name;
	String color;
	Master master;
}

class Master{
	int age;
	String name;
}