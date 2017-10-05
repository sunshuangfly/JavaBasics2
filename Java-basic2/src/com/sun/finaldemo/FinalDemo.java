package com.sun.finaldemo;


/**
 * final:���η�,����������,��Ա�����ͳ�Ա����
 * 
 * final���ε���,���ܱ��̳�,����������
 * final���εķ���,���ܱ���д
 * final���εı���,���ܱ��޸�,�ǳ���
 * 
 * ����:
 * 		����ֵ����:1,2,3...
 * 		�Զ��峣��:��final���εĳ�Ա����,һ����ʼ���򲻿����޸�
 *
 * @date 2017��10��5��
 */
public class FinalDemo {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		
		Animal2 a2 = new Animal2();
		a2.run();
		
		Cat c = new Cat();
		System.out.println(c.num);
		
		//�޸�numֵ,�޷��޸�
		//c.num = 20;
	}
}

final class Animal {
	public void eat() {
		System.out.println("��");
	}
}

class Animal2 {
	final void run() {
		System.out.println("��");
	}
}

class Cat extends Animal2 {
	final int num = 10;
	/*public void run() {
		
	}*/
	
}


/*class Cat extends Animal {
	
}*/
