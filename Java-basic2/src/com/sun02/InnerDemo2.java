package com.sun02;
/**
 * 局部内部类
 * 		方法内,出了方法后就无法使用
 * 
 * @date 2017年10月6日
 */
public class InnerDemo2 {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}

class Outer {
	public void method() {
		class Inner {
			public void show() {
				System.out.println("Inner");
			}
		}
		Inner i = new Inner();
		i.show();
	}
}