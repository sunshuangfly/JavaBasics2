package com.sun.abstracts;
/**
 * 雇员(Employee)
 * 需求:
 * 		程序员:姓名,工号,薪水,工作内容
 * 		项目经理:姓名,工号,薪水,奖金,.工作内容
 * 
 * @date 2017年10月2日
 */
public class AbstractTest2 {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.name = "张三";
		p.work();
		
		Manager m = new Manager();
		m.name = "李四";
		m.work();
		
		
	}
}

abstract class Employee {
	String name;
	String id;
	double pay;
	
	public abstract void work(); 
}

class Programmer extends Employee{

	@Override
	public void work() {
		System.out.println("努力写代码");
		
	}
	
}

class Manager extends Employee {
	double bonus;

	@Override
	public void work() {
		System.out.println("管理项目进度");
		
	}
	
}
