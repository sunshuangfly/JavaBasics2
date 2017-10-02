package com.sun.abstracts;
/**
 * 抽象类的成员特点
 * 		成员变量
 * 			可以有成员变量
 * 			可以有常量
 * 		成员方法
 * 			可以有抽象方法
 * 			可以有非抽象方法
 * 		构造方法
 * 			可以有构造方法,需要对抽象类中的成员变量初始化
 * 
 * @date 2017年10月2日
 */
public class AbstractDemo2 {
	public static void main(String[] args) {
		Dogs d = new Dogs();
		d.show();
	}
}

abstract class Animals {
	String name = "大黄";
	final int num = 10;
	
	public Animals(){
		System.out.println("抽象类无参构造");
	}
	
	public abstract void eat();
	
	public void run() {
		System.out.println("吃");
	}
}

class Dogs extends Animals{
	public void show() {
		System.out.println(name);
		System.out.println(num);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

}
