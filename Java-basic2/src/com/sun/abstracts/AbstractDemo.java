package com.sun.abstracts;
/**
 * abstract
 * ��������ص�:���󷽷�ֻ���ڳ�������
 * 			������ͳ��󷽷���������abstract����
 * 			�����಻�ܴ�������(����ʵ����)
 * 			�������п����зǳ��󷽷�,�ǳ��󷽷����Բ�����д
 * 			�̳г������,Ҫô��д���г��󷽷�,Ҫô�Լ�����Ҳ�ǳ�����
 * @date 2017��10��2��
 */
public class AbstractDemo {
	public static void main(String[] args) {
		//���ܴ�������
		//Animal a = new Animal();
	}
}
//������
//������гԵĹ���,�����޷�����������ʲô,���ʱ�����ʹ�ó����༰����
abstract class Animal {
	public abstract void eat();
	public void run() {
		System.out.println("��...");
	}
}

//����
class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("���Թ�ͷ");
		
	}
	/*public void eat() {
		System.out.println("���Թ�ͷ");
	}*/
}

//è��
class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("è����");
		
	}
	/*public void eat() {
		System.out.println("è����");
	}*/
}
