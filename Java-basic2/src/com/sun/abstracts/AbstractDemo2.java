package com.sun.abstracts;
/**
 * ������ĳ�Ա�ص�
 * 		��Ա����
 * 			�����г�Ա����
 * 			�����г���
 * 		��Ա����
 * 			�����г��󷽷�
 * 			�����зǳ��󷽷�
 * 		���췽��
 * 			�����й��췽��,��Ҫ�Գ������еĳ�Ա������ʼ��
 * 
 * @date 2017��10��2��
 */
public class AbstractDemo2 {
	public static void main(String[] args) {
		Dogs d = new Dogs();
		d.show();
	}
}

abstract class Animals {
	String name = "���";
	final int num = 10;
	
	public Animals(){
		System.out.println("�������޲ι���");
	}
	
	public abstract void eat();
	
	public void run() {
		System.out.println("��");
	}
}

class Dogs extends Animals{
	public void show() {
		System.out.println(name);
		System.out.println(num);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

}
