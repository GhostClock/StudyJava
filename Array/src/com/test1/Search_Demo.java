/**
 * 二分查找 
 * 
 * */

package com.test1;

public class Search_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,12,36,65,94,100,650};
		
		BinaryFind.find(0, array.length - 1, 23, array);
		
		
	}

}

// 二分查找
class BinaryFind {
	/**
	 * @param rightIndex
	 * 
	 * @param leftIndex
	 * 
	 * @param value
	 *            查找的目标数
	 * 
	 * @param array
	 *            数据
	 */
	public static void find(int leftIndex, int rightIndex, int value, int array[]) {

		int midIndex = (leftIndex + rightIndex) / 2;// 首先找到中间的这个数

		int midValue = array[midIndex];

		if (rightIndex >= leftIndex) {

			// 如果要找的数比midValue大
			if (midValue > value) {
				// 在array的左边去找
				find(leftIndex, midIndex - 1, value, array);
			} else if (midValue < value) {// 如果要找的数比midValue小
				// 在array的右边去找
				find(midIndex + 1, rightIndex, value, array);
			} else if (midValue == value) {
				System.out.println("找到了:" + midIndex);
			}
		}

	}
	
	
	
}
