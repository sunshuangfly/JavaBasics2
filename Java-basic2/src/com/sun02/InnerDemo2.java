package com.sun02;
/**
 * �ֲ��ڲ���
 * 		������,���˷�������޷�ʹ��
 * 
 * @date 2017��10��6��
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