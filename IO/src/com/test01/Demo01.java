/*
 * 功能：File 类的基本用法
 * 
 * **/

package com.test01;

import java.io.*;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/Users/ghostclock/Documents/Eclipse/Java/IO/src/com/test01";
		/*
		//创建一个文件对象// 
		File file = new File(path + "/aa.txt");
		//得到文件路径
		System.out.println("文件路径:" + file.getAbsolutePath());
		//得到文件的大小 字节大小
		System.out.println("文件大小:" + file.length());
		//文件是否可读
		System.out.println("可读吗 ? "
						+ (file.canRead() ? "YES" : "NO") 
						+ "\n可写吗 ? "
						+ (file.canWrite() ? "YES" : "NO"));
		
		*/
		//创建文件和创建文件夹
		File file2 = new File(path + "/bb.txt");
		if (!file2.exists()) {
			//创建文件
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("该文件已经存在");
		}
	}

}