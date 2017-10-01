package com.sun.second;

/**
 * 继承中成员方法的特点
 * 		子类中没有这个方法,调用父类方法
 * 		子类中重写了这个方法,调用子类
 * 
 * 方法的重写(override):子类方法与父类方法完全一样,子类重写了父类的方法(覆盖),这时候调用子类方法,就是子类自己重写后的方法
 * 方法的重载(overload):在一个类中方法名相同但是参数列表不同的方法
 * @date 2017年10月1日
 */
public class ExtendsDemo {
	public static void main(String[] args) {
		Son s = new Son();
		s.eat();
	}
}

class Father {
	public void eat() {
		System.out.println("喝酒!");
		System.out.println("喝多了睡觉");
	}
}

class Son extends Father{
	public void eat() {
		System.out.println("好好吃饭,不许喝酒");
	}
}
