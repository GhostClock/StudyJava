/*
 * 多态 ---> 所谓多态，就是一个引用(类型)在不同情况下的多种状态
 * 			也可以理解成：多态是指通过父类的指针，来调用在不同子类中的实现方法
 * 1.java允许父类的引用变量引用他的子类的实例对象
 * 	Animal5 animal5 = new Cat5(); //转换时自动完成
 * 2.
 * */
package Ghost;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//常规做法，没有体现多态
//		Cat5 cat5 = new Cat5();
//		cat5.cry();
//		
//		Dog5 dog5 = new Dog5();
//		dog5.cry();
		/*
		//体现多态
		Animal5 animal5 = new Cat5();
		animal5.cry();
		
		animal5 = new Dog5();
		animal5.cry();
		*/
		Master master = new Master();
		master.feed(new Dog5(), new Bone());
		master.feed(new Cat5(), new Food());
	}

}

class Master{
	//喂食物  使用多态，方法就可以用一个
	public void feed(Animal5 animal5,Food food) {
		animal5.eat();
		food.showName();
	}
	
}

class Food{
	String name;
	public void showName() {
		
	}
}

class Fish extends Food{
	@Override
	public void showName() {
		System.out.println("鱼");
	}
}

class Bone extends Food{
	public void showName() {
		System.out.println("骨头");
	}
}

//动物类
class Animal5{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void cry() {
		System.out.println("不知道怎么叫");
	}
	
	public void eat() {
		System.out.println("不知道吃什么");
	}
}

class Cat5 extends Animal5{
	//猫自己的交换
	@Override
	public void cry() {
		System.out.println("喵喵~");
	}
	@Override
	public void eat() {
		System.out.println("吃鱼");
	}
}

class Dog5 extends Animal5{
	@Override
	public void cry() {
		System.out.println("汪汪~");
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃骨头");
	}
	
}


