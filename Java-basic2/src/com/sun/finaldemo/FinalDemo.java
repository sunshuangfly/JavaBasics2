package com.sun.finaldemo;


/**
 * final:修饰符,可以修饰类,成员方法和成员变量
 * 
 * final修饰的类,不能被继承,不能有子类
 * final修饰的方法,不能被重写
 * final修饰的变量,不能被修改,是常量
 * 
 * 常量:
 * 		字面值常量:1,2,3...
 * 		自定义常量:被final修饰的成员变量,一旦初始化则不可以修改
 *
 * @date 2017年10月5日
 */
public class FinalDemo {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		
		Animal2 a2 = new Animal2();
		a2.run();
		
		Cat c = new Cat();
		System.out.println(c.num);
		
		//修改num值,无法修改
		//c.num = 20;
	}
}

final class Animal {
	public void eat() {
		System.out.println("吃");
	}
}

class Animal2 {
	final void run() {
		System.out.println("跑");
	}
}

class Cat extends Animal2 {
	final int num = 10;
	/*public void run() {
		
	}*/
	
}


/*class Cat extends Animal {
	
}*/
