
//Vector的用法

package com.Set;

import java.util.Vector;

public class Vector_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector = new Vector();
		Employee employee = new Employee("1", "aa", 100.2f);
		vector.add(employee);
		for (Object object : vector) {
			Employee employee2 = (Employee)object;
		}
	}

}
