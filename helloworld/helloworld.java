import java.io.*;
public class helloworld{//注意:公告类的类名必须和文件名一样
	public static void main(String[] args) {
		// System.out.println("HelloWorld");

		/*
		int a = 10;
		int b = 20;
		double result = a + b;
		System.out.println("Result = " + result);
		// byte byte1 = 128;//超出byte的最小最大范围

		char char1 = 'd';//单字符  char 是两个字节 可以存放汉字
		System.out.println(char1);

		char char2 = 'a' + 'b';
		System.out.println(char2);
		*/

		// int aa = 1.2;//高精度不能转换为低精度 byte<short<int<long<float<double
		//Java中默认是Double类型
		// float aaa = 3.5;//编译不过  float aaa = 3.5f;

		// model(4,2);

		// MaxMin();

		// for (int i = 0; i < 10; i ++) {
		// 	System.out.println("-----");
		// }

		// doWhile();
		showStar(6);
		
	}

	private static void model(int a ,int b){
		if (a % b == 0) {
			System.out.println("OK");
		}else {
			System.out.println("NO");
		}
	}

	private static void MaxMin(){
		System.out.println("判断输入数的大小");
		try{
			//输入流,从键盘接受数
			InputStreamReader isr = new InputStreamReader(System.in);//标准输入
			BufferedReader bufferR = new BufferedReader(isr);

			System.out.println("请输入第一个数");
			//从控制台读取一行数据
			String a1 = bufferR.readLine(); 

			System.out.println("请输入第二个数");
			String a2 = bufferR.readLine();

			//把String转化为float
			float result1 = Float.parseFloat(a1);
			float result2 = Float.parseFloat(a2);
			if (result1 > result2) {
				System.out.println(result1 + " > " + result2);
			}else if (result1 < result2) {
				System.out.println(result1 + " < " + result2);
			}else{
				System.out.println(result1 + " = " + result2);
			}

		}catch(Exception error){
			error.printStackTrace();
		}
	}

	private static void doWhile(){
		int number = 0;
		do{
			System.out.println(" -- " + number + " -- ");
			number ++;
		}while(number < 10);
	}

	private static void showStar(int number){

		for (int i = 0; i < number; i ++) {
			for (int k = 0; k < number - i; k ++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i - 1) * 2 + 1; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("=======");

		for (int i = 0; i < number; i ++) {
			
			for (int k = 0; k < number - i; k ++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= (i - 1) * 2 + 1; j ++) {
				//判断该层是顶层还是底层
				if (i == 0 || i == number) {
					System.out.print("*");
				}else{
					//如果是第一个*
					if (j == 0 || j == (i - 1) * 2 + 1) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}




