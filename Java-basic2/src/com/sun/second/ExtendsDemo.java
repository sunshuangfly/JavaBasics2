package com.sun.second;

/**
 * �̳��г�Ա�������ص�
 * 		������û���������,���ø��෽��
 * 		��������д���������,��������
 * 
 * ��������д(override):���෽���븸�෽����ȫһ��,������д�˸���ķ���(����),��ʱ��������෽��,���������Լ���д��ķ���
 * ����������(overload):��һ�����з�������ͬ���ǲ����б�ͬ�ķ���
 * @date 2017��10��1��
 */
public class ExtendsDemo {
	public static void main(String[] args) {
		Son s = new Son();
		s.eat();
	}
}

class Father {
	public void eat() {
		System.out.println("�Ⱦ�!");
		System.out.println("�ȶ���˯��");
	}
}

class Son extends Father{
	public void eat() {
		System.out.println("�úóԷ�,����Ⱦ�");
	}
}
