package com.sun.abstracts;
/**
 * 基础班老师,就业办老师
 * 
 * 共性:
 * 		属性:姓名,年龄,性别
 * 		行为:讲课,解答
 * 
 * @date 2017年10月2日
 */
public class AbstractTest {
	public static void main(String[] args) {
		BasicTeacher bt = new BasicTeacher();
		bt.name = "李龙";
		bt.teach();
		
		JobTeacher jt = new JobTeacher();
		jt.name = "张三";
		jt.teach();
	}
}

abstract class Teacher {
	String name;
	int age;
	String gender;
	
	public abstract void teach();
}

class BasicTeacher extends Teacher {

	@Override
	public void teach() {
		System.out.println(name+"讲解基础课程");
		
	}
	
}

class JobTeacher extends Teacher {

	@Override
	public void teach() {
		System.out.println(name+"讲解就业课程");
		
	}
	
}
