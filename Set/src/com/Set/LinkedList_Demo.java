
/*
 * LinkedList的用法
 * 
 * */

package com.Set;

import java.util.LinkedList;

public class LinkedList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList linkedList = new LinkedList();
		Employee employee1 = new Employee("1000", "aa", 1000.0f);
		Employee employee2 = new Employee("1000", "bb", 1000.0f);
		//表示把employee加载链表的最前面
		linkedList.addLast(employee1);
		linkedList.addLast(employee2);
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(((Employee)linkedList.get(i)).getName());
		}
		
		linkedList.removeLast();
	}

}