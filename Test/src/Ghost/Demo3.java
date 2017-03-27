package Ghost;

public class Demo3 {
	
	public static void main(String[] args) {
		//创建一直猫
		Cat cat = new Cat();
		cat.cry();
		
		Dog dog = new Dog();
		dog.cry();
		
		
	}
}


//动物类
class Animal{
	int age;
	String name;
	
	//都会叫
	public void cry() {
		System.out.println("我是动物 不知道怎么叫");
	}
	
}

//猫猫类
class Cat extends Animal{
	//重写父类的方法
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("喵喵");
	}
}

//狗类
class Dog extends Animal{
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("汪汪");
	}
}

