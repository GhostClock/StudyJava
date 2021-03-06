
//hashMap和HashTable的用法

package com.Set;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class HashMap_HashTable_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap();
	}

	private static void HashMap() {
		// 创建一个HashMap 的对象
		HashMap hashMap = new HashMap();
		Employee employee1 = new Employee("2000", "aaa", 3.122f);
		Employee employee2 = new Employee("3000", "bbb", 3.122f);
		Employee employee3 = new Employee("4000", "bbb", 3.122f);
		// 将employee放入到hashMap中去
		hashMap.put("2000", employee1);
		hashMap.put("3000", employee2);
		// hashMap.put("3000", employee3);//这样会覆盖掉key为3000的值
		// 如果要查找编号为3000
		if (hashMap.containsKey("3000")) {
			System.out.println("找到了");
			// 如何取出 键值对
			Employee employee = (Employee) hashMap.get("3000");
			System.out.println(employee.getName());

		} else {
			System.out.println("没找到");
		}

		// 变量hashMap中所有的key和value
		// Iterator迭代器
		Iterator iterator = hashMap.keySet().iterator();
		// hashNext返回一个boolean值
		while (iterator.hasNext()) {
			// 取出key值
			String key = iterator.next().toString();
			// 通过key取出value
			Employee employee = (Employee) hashMap.get(key);
			System.out.println(employee.getName() + " " + employee.getEmployeeNO());

		}
	}
	
	private static void HashTable() {
		//
		Hashtable hashtable = new Hashtable();
		//
//		hashtable.put(key, value)
//		hashtable.get(key)
		//用法和HashMap几乎一模一样
		
		
	}
}
