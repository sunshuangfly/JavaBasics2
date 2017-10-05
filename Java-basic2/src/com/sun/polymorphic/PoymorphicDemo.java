package com.sun.polymorphic;
/**
 * 多态:
 * 		子父类继承关系
 * 		方法的重写
 * 		父类引用指向子类对象
 * 
 * 多态优缺点:
 * 		缺点:父类引用无法直接访问子类特有的成员
 * 		优点:可以提高可维护性(多态前提所保证的),提高代码可扩展性
 * @date 2017年10月5日
 */
public class PoymorphicDemo {
	public static void main(String[] args) {
		//Animal与Cat为子父类继承关系
		//向上转型
		Animal a = new Cat();
		a.eat();
		//无法调用子类特有的方法,编译器无法通过
		//a.climbTree();
		
		//强制转换
		//向下转型
		Cat c = (Cat)a;
		c.climbTree();
		c.eat();
	}
}

class Animal {
	public void eat() {
		System.out.println("吃东西");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
	public void climbTree() {
		System.out.println("猫爬树");
	}
}