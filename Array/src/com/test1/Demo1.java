/*
 * 普通数组
 * 
 * */

package com.test1;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个存放6个float类型的数组
		float array[]  = new float[6];
		//使用for循环赋值
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		//遍历
		float sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("sum = " + sum);
		
		
		//定义一个size为5的数组
		int arr[];//int[] arr;
		arr = new int[5];
		
		//数组越界
//		array[6];
		
		//如何知道数组的长度
		System.out.println(array.length);
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		float all = 0;
		for (int i = 0; i < a.length; i++) {
			all += a[i];
		}
		System.out.println(all / a.length);
		
		
		
	}

}
