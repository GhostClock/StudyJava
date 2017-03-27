package Ghost;

public class Demo1 {
	/**
	 * @author ghostclock
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pubil pubil = new Pubil();
		pubil.printName();
		
	}

}

//继承的必要性
//抽象共同属性作为一个父类
class Stu{
	public int age;
	public String name;
	public float free;
	
	public void printName() { //方法和属性都能被继承
		System.out.println("名字:" + this.name);
	}
}

//小学生
class Pubil extends Stu{
	public void pay(float fee) {
		this.free = fee;
	}
}
//中学生
class MiddleStu extends Stu{
	public void pay(float fee) {
		this.free = fee;
	}
}

//大学生





