package com.sun.interfaces;
/**
 * 接口:比抽象类更抽象的类
 * 接口成员特点:
 * 		只能有抽象方法
 * 		只能有常量,没有变量
 * 		默认使用public static final来修饰成员变量
 * 		如果没有修饰,默认使用public&abstract修饰方法
 * 		权限修饰只能使用public修饰方法
 * 
 * 注意:
 * 		接口不能创建对象(不能实例化)
 * 		类与接口的关系是实现(implements)关系,一个类实现一个接口必须实现它的所有方法
 * 		
 * @date 2017年10月3日
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		//不能创建对象
		//Animal a = new Animal();
	}
}

interface Animal {
	//int num;
	final static int num = 1;
	
	
	//只能定义抽象方法
	//public void eat() {}
	 public abstract void eat();
	 void run();
}

class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
