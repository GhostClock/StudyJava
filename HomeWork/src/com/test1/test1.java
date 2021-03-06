/**
 *1.跳水比赛,8个评委打分,去掉最高分和最低分,下面的6个算平均分,使用一维数组
 *2.找出最高分和最低分
 *3.得到最差评委和最优评委
 * */

package com.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Judge judge = new Judge();
		System.out.println(judge.lastFen());
		System.out.println("最差的评委" + judge.getWorst() + 1);
	}

}

class Judge {
	// 定义一个8个小数的数组
	float fens[] = null;
	int size = 3;

	public Judge() {
		fens = new float[size];
		// 初始化
		try {
			for (int i = 0; i < fens.length; i++) {
				System.out.println("请输入第" + (i + 1) + "个评委的成绩");
				fens[i] = Float.parseFloat(getUserInput().readLine());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				this.getUserInput().close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	private BufferedReader getUserInput() {
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(streamReader);
		return bufferedReader;
	}

	//得到最差评委
	public int getWorst() {
		float lastFen = this.lastFen();
		//认为第一个是最差评委
		int worstIndex = 0;
		float low = Math.abs(fens[0] - lastFen);//取绝对值
		float tempLow = 0.0f; 
		for (int i = 0; i < fens.length; i++) {
			tempLow = Math.abs(fens[i] - lastFen);
			if (low < tempLow) {
				worstIndex = i;
				low = tempLow;
			}
		}
		return worstIndex;
	}
	
	
	// 得到运动员的最后得分
	public float lastFen() {

		// 得到平均分
		float allFen = 0;
		int minIndex = this.getLowFen();
		int maIndex = this.getHightFen();
		for (int i = 0; i < fens.length; i++) {
			if (i != minIndex && i != maIndex) {
				allFen += fens[i];
			}
		}
		return allFen / (fens.length - 2);
	}

	// 去到最低分（找到最低分的下标）
	private int getLowFen() {
		// 选择法
		// 认为第一个是最低分
		float minFen = fens[0];
		int minIndex = 0;
		for (int i = 0; i < fens.length; i++) {
			if (minFen > fens[i]) {
				minFen = fens[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	// 去掉最高分
	private int getHightFen() {
		// 选择法
		// 认为第一个是最低分
		float maxFen = fens[0];
		int maxIndex = 0;
		for (int i = 0; i < fens.length; i++) {
			if (maxFen < fens[i]) {
				maxFen = fens[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
