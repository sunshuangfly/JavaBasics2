package com.sun.abstracts;
/**
 * abstract
 * 抽象类的特点:抽象方法只能在抽象类中
 * 			抽象类和抽象方法都必须用abstract修饰
 * 			抽象类不能创建对象(不能实例化)
 * 			抽象类中可以有非抽象方法,非抽象方法可以不用重写
 * 			继承抽象类后,要么重写所有抽象方法,要么自己本身也是抽象类
 * @date 2017年10月2日
 */
public class AbstractDemo {
	public static void main(String[] args) {
		//不能创建对象
		//Animal a = new Animal();
	}
}
//动物类
//动物具有吃的共性,但是无法具体描述吃什么,这个时候可以使用抽象类及方法
abstract class Animal {
	public abstract void eat();
	public void run() {
		System.out.println("跑...");
	}
}

//狗类
class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("狗吃骨头");
		
	}
	/*public void eat() {
		System.out.println("狗吃骨头");
	}*/
}

//猫类
class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
		
	}
	/*public void eat() {
		System.out.println("猫吃鱼");
	}*/
}
