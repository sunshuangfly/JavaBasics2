package com.sun.interfaces;
/**
 * �ӿ�:�ȳ�������������
 * �ӿڳ�Ա�ص�:
 * 		ֻ���г��󷽷�
 * 		ֻ���г���,û�б���
 * 		Ĭ��ʹ��public static final�����γ�Ա����
 * 		���û������,Ĭ��ʹ��public&abstract���η���
 * 		Ȩ������ֻ��ʹ��public���η���
 * 
 * ע��:
 * 		�ӿڲ��ܴ�������(����ʵ����)
 * 		����ӿڵĹ�ϵ��ʵ��(implements)��ϵ,һ����ʵ��һ���ӿڱ���ʵ���������з���
 * 		
 * @date 2017��10��3��
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		//���ܴ�������
		//Animal a = new Animal();
	}
}

interface Animal {
	//int num;
	final static int num = 1;
	
	
	//ֻ�ܶ�����󷽷�
	//public void eat() {}
	 public abstract void eat();
	 void run();
}

class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("è����");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
