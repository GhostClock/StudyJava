/*
 * 排序的介绍
 * 排序就是将一群数据，依据指定的顺序进行排列的过程
 * 排序的分类:
 * 1.内部排序:
 * 	指将需要处理的所有数据都加载到内部存储起中进行排序
 * 	包括(交换式排序法,选择式排序法,插入式排序法)
 * 
 * 2.外部排序法
 *  由于数据量过大,无法全部加载到内存中,需要借助外部存储进行排序
 *  包括(合并排序法,直接合并排序法)
 * 
 * 排序(Sorting)是数据处理中一种很重要的运算,同时也是很常见的运算,一般数据处理工作
 * 中25%的时间都在进行排序,简单的说,排序就是把一组记录(元素)按照某个域值的递增(从小到大)
 * 或者递减(从大到小)的次序重新排列的过程
 * */

/*
 *交换式排序
 * 交换式排序属于内部排序法,是运用数据值比较后,依判断规则对数据位置进行交换,以达到排序的目的
 * 交换式排序又可分为:
 * 1.冒泡排序法（Bubble sort）
 * 2.快速排序法 (Quick sort)
 * 
 * */

package com.test1;

import java.util.Calendar;


public class Paixu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int array[] = { 1, 5, 4, 6, 8, 4, 1, 3, 6, 9, 41, 3, 6, 1, 3, -10};
		
		//创建100000个数据
		int len = 80000000;
		int array[] = new int[len];
		for (int i = 0; i < len; i++) {
			//让程序随机产生1 - 100000数
			int t = (int) (Math.random() * len);//会随机产生一个0 ~ 1
			array[i] = t;
		}
		
		//在排序前打印系统时间
		Calendar calendar1 = Calendar.getInstance();
		System.out.println("排序前" + calendar1.getTime());
		
//		Bubble.Sort(array);//冒泡排序
		
//		Selection.Sort(array); //选择排序
		
//		InsterSort.sort(array);//插入排序
		
		QuickSort.sort(array, 0, array.length - 1);;//快速排序
		
		calendar1 = Calendar.getInstance();//重新获取单例
		System.out.println("排序前" + calendar1.getTime());
		
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}

	}

}

//冒泡排序
class Bubble {
	// 排序方法
	/*
	 * 交换式排序 - 冒泡排序
	 * 基本思想:通过对待排序序列从后向前(从下标较大的元素开始)，依次比较相邻元素的排序码
	 * 		  若发现逆序则交换,使排序码较小的元素逐渐从后部移到前部(从下标较大的单元移向较小
	 * 		  的单元),就像水底下的气泡一样逐渐向上冒的过程
	 * 因为排序的过程中,各元素不断接近自己的位置,如果一趟比较下来,没有进行交换的过程,就说明序列
	 * 有序,因此在排序过程中设置一个标志flag判断元素是否进行过交换,从而减少不必要的比较
	 * */
	// 冒泡排序
	public static void Sort(int[] array) {
		int temp = 0;// 中间变量
		// 外部循环 它决定一共走几趟
		for (int i = 0; i < array.length - 1; i++) {
			// 内层循环 开始逐个比较 如果发现前一个数比后一个数大 则交换
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					// 换位
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
	}
}

//选择排序法
class Selection{
	/*
	 * 选择式排序法 - 选择排序法
	 * 选择式排序法也属于内部排序法,是从欲排序的数据中，按照指定的规则选出某一元素
	 * 经过和其他元素,重整,再依原则交换位置后达到排序的目的
	 * 
	 * 基本思想:第一次从R[0]-R[n - 1]中选取最小值,与R[0]交换,第二次从R[1]-R[n - 1]中
	 * 选取最小值,与R[1]交换,第三次从R[2]-R[n - 1]中选取最小值与R[2]交换,...,第R[i - 1] -
	 * R[n - 1]中选取最小值，与R[i - 1]交换，... ，第R[n-2]-R[n - 1]中选取最小值,与R[n - 2]
	 * 交换,总共通过n - 1次,得到一个按排序码从小到大排列的有序序列
	 * 
	 * */
	static void Sort(int[] array){
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			//认为第一个数就是最小的
			int min = array[i];
			//记录最小数的下标
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (min > array[j]) {
					//修改最小值
					min = array[j];
					minIndex = j;
				}
			}
			//当退出for找到这次的最小值
			temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
		
	}
}

class InsterSort{
	//插入式排序 - 插入式排序法
	/*
	 * 插入式排序属于内部排序法,是对欲排序的元素以插入的方式找寻元素的适当位置，以达到排序的目的
	 * 插入式排序可分为:
	 * 1.插入式排序(INsertion sort)
	 * 2.谢耳排序法(shell sort)
	 * 3.二叉树排序法(Binary-tree sort)
	 * 
	 * */
	
	/*
	 * 插入式排序
	 * 基本思想:
	 * 把n个待排序的元素看成为一个有序表和一个无序表，开始时有序表中只包含一个元素,无序表中包含有n-1个元素，
	 * 排序过程中每次从无序表中取出一个元素,把它的排序码依次与有序表元素的排序码进行比较,将它插入到有序表中的适当位置,
	 * 使之成为新的有序表
	 * 
	 * */
	public static void sort(int array[]) {
		for (int i = 1; i < array.length; i++) {
			int insertVal = array[i];
			//insertVal准备和前一个数比较
			int index = i - 1;
			while (index >= 0 && insertVal < array[index]) {
				//就把这个array[index]向后移动
				array[index + 1] = array[index];
				//让index向前移动
				index --;
			}
			//将insertVal插入到适当位置
			array[index + 1]  = insertVal;
		}
	}
}


class QuickSort{
	/*
	 * 快速排序
	 * 快速排序对冒泡排序的一种改进，是有C.A.R. Hoare在1962年提出来的
	 * 
	 * 基本思想:
	 * 是通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另一部分的所有数据
	 * 都要小,然后再按此方法对这两部分数据分别进行快速排序,整个过程可以递归进行,
	 * 以此来达到整个数据变成有序序列
	 * 
	 * */
	/**
	 * @param array
	 *  目标数组
	 * @param left
	 * 	起始位
	 * @param right
	 *  结束位
	 * 
	 * **/
	public static void sort(int[] array,int left,int right) {
		if (left < right) {
			int i = left, j = right, x = array[left];
			while (i < j) {
				while (i < j && array[j] >= x) {//从右向左找到第一个小于x的数
					j --;
				}
				if (i < j) {
					array[i ++] = array[j];
				}
				
				while (i < j && array[i] < x	) {
					i ++;
				}
				if (i < j) {
					array[j --] = array[i];
				}
			}
			array[i] = x;
			sort(array,left,i - 1);//递归调用
			sort(array,i + 1,right);
		}
	}
}


