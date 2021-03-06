/*
 * 对于有符号的而言:
 * 1.二进制的最高外是符号位:0表示正数,1表示复数
 * 2.正数的源码,反码,补码都一样
 * 3.负数的反码 = 它的源码符号位不变,其他位取反(0 ->1, 1 -> 0)  3155420283
 * 4.负数的补码 = 它的反码 + 1
 * 5.0的反码,补码都是0
 * 6.java中没有无符号数,换言之,java中的数都是有符号的
 * 7.在计算机运算的时候,都是以补码的方式来运算的
 * 
 * java中有4个位运算,分别是"按位与&,按位或|,按位异或^,按位取反~"
 * 规则:
 * 按位与&:两位全为1,结果为1
 * 按位或|:两位有一个为1,结果为1
 * 按位异或^:两位一个为0,一个为1,结果为1
 * 按位取反~:0 -> 1  1 -> 0 
 * 比如: ~2 = -3   2&3 = 2  2|3 = 3  2^3 = 1
 * 
 * java中有3个以为运算符
 * >>,<<算术右移和算术左移
 * 规则:
 * 算术右移:低位溢出,符号位不变,并用符号位补溢出的高位
 * 算术左移:符号位不变,低位补0
 * 
 * >>>逻辑右移
 * 规则:低位溢出,高位补0
 * 
 * 
 * 
 * */

package com.Bit;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	
	protected static void test() {
		int a = 1 >> 2;
		int b = -1 >> 2;
		int c = 1 << 2;
		int d = -1 << 2;
		int e = 3 >>> 2;
		System.out.println("a = " + a
				+ " b = " + b
				+ " c = " + c
				+ " d = " + d
				+ " e = " + e);
		System.out.println(~2 + 2&3 + 2|3 + ~-5 + 13&7 + 5|4 + -3^3);
	}
}


