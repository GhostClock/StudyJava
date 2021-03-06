
package com.Set;

import java.io.*;
import java.util.ArrayList;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 创建EmployeeManager的对象
		EmployeeManager manager = new EmployeeManager();
		// 做出一个简易菜单
		while (true) {
			System.out.println("请选择你要进行的操作");
			System.out.println("1:表示要添加一个员工");
			System.out.println("2:表示要查找一个员工");
			System.out.println("3:表示要修改一个员工的薪水");
			System.out.println("4:表示要删除一个员工");
			System.out.println("5:表示退出系统");
			String operType = userPutInfo().readLine();
			if (operType.equals("1")) {
				System.out.println("请输入工号");
				String number = userPutInfo().readLine();
				System.out.println("请输入姓名");
				String name = userPutInfo().readLine();
				System.out.println("请输入薪水");
				float sal = Float.parseFloat(userPutInfo().readLine());

				Employee employee = new Employee(number, name, sal);

				manager.addEmployee(employee);

			} else if (operType.equals("2")) {
				System.out.println("请输入你要查找的工号");
				String number = userPutInfo().readLine();

				manager.showInfo(number);

			} else if (operType.equals("3")) {
				System.out.println("请输入你要修改员工薪水的工号");
				String employeeNo = userPutInfo().readLine();
				System.out.println("请输入薪水");
				float newSal = Float.parseFloat(userPutInfo().readLine());

				manager.uopdateSal(employeeNo, newSal);
			} else if (operType.equals("4")) {
				System.out.println("请输入你要删除员工薪水的工号");
				String employeeNo = userPutInfo().readLine();
				manager.deleteEmployee(employeeNo);
			} else if (operType.equals("5")) {
				//退出系统
				System.exit(0);
			}
		}
	}

	private static BufferedReader userPutInfo() {
		return new BufferedReader(new InputStreamReader(System.in));
	}
}

// 管理类
class EmployeeManager {
	private ArrayList arrayList = null;

	public EmployeeManager() { // 初始化成员变量
		arrayList = new ArrayList();
	}

	// 加入员工
	public void addEmployee(Employee employee) {
		arrayList.add(employee);
	}

	// 显示员工的相关消息
	public void showInfo(String employeeNO) {
		for (Object object : arrayList) {
			// 取出对象
			Employee employee2 = (Employee) object;
			// 比较编号
			if (employee2.getEmployeeNO().equals(employeeNO)) {
				System.out.println("找到该员工,信息是:\n工号:" + employee2.getEmployeeNO() + "\n" + "姓名:" + employee2.getName()
						+ "\n" + "薪水:" + employee2.getSal());
			}
		}
	}

	// 修改薪水
	public void uopdateSal(String employeeNo, float newSal) {
		for (Object object : arrayList) {
			Employee tEmployee = (Employee) object;
			if (tEmployee.getEmployeeNO().equals(employeeNo)) {
				tEmployee.setSal(newSal);
			}
		}
	}

	// 删除某个员工
	public void deleteEmployee(String employeeNo) {
		for (Object object : arrayList) {
			Employee employee = (Employee) object;
			if (employee.getEmployeeNO().equals(employeeNo)) {
				arrayList.remove(employee);
				// arrayList.remove(index); //不用foreach的时候页可以这样删除
			}
		}
	}
}

// 创建一个员工类
class Employee {
	// 工号
	private String employeeNO;
	private String name;
	private float sal;

	public Employee(String employeeNO, String name, float sal) {
		this.employeeNO = employeeNO;
		this.name = name;
		this.sal = sal;
	}

	public String getEmployeeNO() {
		return employeeNO;
	}

	public void setEmployeeNO(String employeeNO) {
		this.employeeNO = employeeNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

}
