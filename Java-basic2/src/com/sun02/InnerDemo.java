package com.sun02;
/**
 * 成员内部类
 * 		在类的成员位置,和成员变量成员方法位置一样的
 * 		在内部类中可以访问外部类的成员,包括私有成员
 * 		在外面访问内部类,需要先导入外部类,才可以调用内部类
 * @date 2017年10月6日
 */
public class InnerDemo {
	public static void main(String[] args) {
		/*Other o = new Other();
		o.eat();*/
		Other.Inner i = new Other().new Inner();
		i.run();
		
		
	}
}

class Other {
	private int num = 10;
	int name;
	
	public void eat() {
		System.out.println("吃");
		Inner in = new Inner();
		in.run();
	}
	
	class Inner {
		public void run() {
			System.out.println("跑");
			System.out.println(num);
		}
	}
}
