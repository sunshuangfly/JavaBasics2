package com.sun.polymorphic;
/**
 * ��̬:
 * 		�Ӹ���̳й�ϵ
 * 		��������д
 * 		��������ָ���������
 * 
 * ��̬��ȱ��:
 * 		ȱ��:���������޷�ֱ�ӷ����������еĳ�Ա
 * 		�ŵ�:������߿�ά����(��̬ǰ������֤��),��ߴ������չ��
 * @date 2017��10��5��
 */
public class PoymorphicDemo {
	public static void main(String[] args) {
		//Animal��CatΪ�Ӹ���̳й�ϵ
		//����ת��
		Animal a = new Cat();
		a.eat();
		//�޷������������еķ���,�������޷�ͨ��
		//a.climbTree();
		
		//ǿ��ת��
		//����ת��
		Cat c = (Cat)a;
		c.climbTree();
		c.eat();
	}
}

class Animal {
	public void eat() {
		System.out.println("�Զ���");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}
	
	public void climbTree() {
		System.out.println("è����");
	}
}