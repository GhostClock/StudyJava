//this的必要性
public class This{

	public static void main(String[] args) {
		
		// Person p = new Person(11,"Ghost");
		// p.showInfo();

		Child ch1 = new Child(12,"123");
		ch1.joinGame();
		System.out.println(Child.total);
	}
}

class Child{
	int age;
	String name;
	static int total = 0;//静态变量,可以被任何一个对象访问到 类名也可以访问到

	public Child(int age,String name){
		this.age = age;
		this.name = name;
	}
	public void joinGame(){
		this.total ++;
		System.out.println("Child Joining");
	}
}

//定义了一个类
class Person{
	int age;
	String name;

	public Person(int age,String name){
		this.age = age; //this是属于一个对象，不是属于一个类
		this.name = name;
	}

	public void showInfo(){
		System.out.println(this.name);
	}
}