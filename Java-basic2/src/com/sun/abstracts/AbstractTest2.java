package com.sun.abstracts;
/**
 * ��Ա(Employee)
 * ����:
 * 		����Ա:����,����,нˮ,��������
 * 		��Ŀ����:����,����,нˮ,����,.��������
 * 
 * @date 2017��10��2��
 */
public class AbstractTest2 {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.name = "����";
		p.work();
		
		Manager m = new Manager();
		m.name = "����";
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
		System.out.println("Ŭ��д����");
		
	}
	
}

class Manager extends Employee {
	double bonus;

	@Override
	public void work() {
		System.out.println("������Ŀ����");
		
	}
	
}
