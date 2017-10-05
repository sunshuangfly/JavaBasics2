package com.sun.interfaces;
/**
 * �����˶�Ա�ͽ���
 * ƹ�����˶�Ա�ͽ���
 * ���������˶�Ա�ͽ�����Ҫ����,��ҪѧϰӢ��
 * �������ѧ֪ʶ,��������Щ����,��Щ�³�����,��Щ�ǽӿ�
 * 
 * @date 2017��10��5��
 */
public class InterfaceDemo3 {
	public static void main(String[] args) {
		//���������˶�Ա����
		BasketballPlayer bbp = new BasketballPlayer();
		bbp.name = "Ҧ��";
		bbp.age = 35;
		bbp.sex = "��";
		bbp.eat();
		bbp.study();
		bbp.speak();
		//����ƹ�����˶�Ա
		PingpangPlayer ppp = new PingpangPlayer();
		ppp.name = "���";
		ppp.age = 34;
		ppp.sex = "Ů";
		ppp.eat();
		ppp.sleep();
		ppp.study();
		
	}
}

//���㶼����,������,����,�Ա�
class Person {
	String name;
	int age;
	String sex;
	
	public Person() {}
	
	public Person(String name,int age,String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public void eat() {
		System.out.println("�Է�");
	}
	
	public void sleep() {
		System.out.println("˯��");
	}
}

interface SpeackEnglish {
	public abstract void speak();
}

//����
abstract class Coach extends Person{
	public abstract void teach();
}

//�˶�Ա
abstract class Player extends Person{
	public abstract void study();
	
}

//�����˶�Ա
class BasketballPlayer extends Player implements SpeackEnglish{

	@Override
	public void study() {
		System.out.println("ѧϰ����");
		
	}

	@Override
	public void speak() {
		System.out.println("ѧϰӢ��");
		
	}
	
}
//ƹ�����˶�Ա
class PingpangPlayer extends Player {

	@Override
	public void study() {
		System.out.println("ѧϰ����");
		
	}
	
}
//�������
class BasketbassCoach extends Coach implements SpeackEnglish {

	@Override
	public void teach() {
		System.out.println("�̿���");
		
	}

	@Override
	public void speak() {
		System.out.println("ѧϰӢ��");
		
	}
	
}
//ƹ�������
class PingpangCoach extends Coach {

	@Override
	public void teach() {
		System.out.println("�̳���");
		
	}
	
}