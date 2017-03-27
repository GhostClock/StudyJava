package com.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//检查性异常 1.打开文件
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("/Users/ghostclock/Desktop/aa.txt");
			//在出现异常的地方，就终止执行代码,然后进入到catch语句里面
			//如果有多个catch语句,则进入匹配异常的那个语句catch
			
			Socket socket = new Socket("192.168.1.1000",78);
			
		} catch (FileNotFoundException e) {
			// 把异常的信息输出，利于排除bug
//			e.printStackTrace();
			System.out.println(e.getMessage());
			System.exit(-1);//
		}catch (IOException e) {
			// TODO: handle exception
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally");
			//这个语句块，不管出没出现异常,都会执行
			//一般说,把需要关闭的资源,文件,连接，内存
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			//一下情况finally不会执行
			//1.finally块中发生了异常
			//2.程序所在的线程死亡
			//3.在前面的代码中用了System.exit();
			//4.关闭CUP
		}
		
		
		//2.连接一个端口 192.168.1.100 4567
//		Socket socket = new Socket("");
		
		//3.运行异常
//		int number = 4 / 0; //
		
//		int number[] = {1,2,3};
//		System.out.println(number[4]);
		
		
	}

}
