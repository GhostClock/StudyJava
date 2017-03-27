
/**
 * 二维数组
 * 
 * */
package com.test1;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[][] = new int[4][6];
		array[1][2] = 1;
		array[2][1] = 2;
		array[2][3] = 3;
		//行
		for (int i = 0; i < 4; i++) {
			//列
			for (int j = 0; j < 6; j++) {
				System.out.print(array[i][j] + " ");
			}
			//换行
			System.out.println();
		}
		
		
	}

}
