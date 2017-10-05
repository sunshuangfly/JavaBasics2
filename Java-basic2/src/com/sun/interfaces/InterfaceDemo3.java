package com.sun.interfaces;
/**
 * 篮球运动员和教练
 * 乒乓球运动员和教练
 * 现在篮球运动员和教练需要出国,需要学习英语
 * 请根据所学知识,分析出那些是类,那些事抽象类,哪些是接口
 * 
 * @date 2017年10月5日
 */
public class InterfaceDemo3 {
	public static void main(String[] args) {
		//创建篮球运动员对象
		BasketballPlayer bbp = new BasketballPlayer();
		bbp.name = "姚明";
		bbp.age = 35;
		bbp.sex = "男";
		bbp.eat();
		bbp.study();
		bbp.speak();
		//创建乒乓球运动员
		PingpangPlayer ppp = new PingpangPlayer();
		ppp.name = "王楠";
		ppp.age = 34;
		ppp.sex = "女";
		ppp.eat();
		ppp.sleep();
		ppp.study();
		
	}
}

//顶层都是人,有姓名,年龄,性别
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
		System.out.println("吃饭");
	}
	
	public void sleep() {
		System.out.println("睡觉");
	}
}

interface SpeackEnglish {
	public abstract void speak();
}

//教练
abstract class Coach extends Person{
	public abstract void teach();
}

//运动员
abstract class Player extends Person{
	public abstract void study();
	
}

//篮球运动员
class BasketballPlayer extends Player implements SpeackEnglish{

	@Override
	public void study() {
		System.out.println("学习扣篮");
		
	}

	@Override
	public void speak() {
		System.out.println("学习英语");
		
	}
	
}
//乒乓球运动员
class PingpangPlayer extends Player {

	@Override
	public void study() {
		System.out.println("学习抽球");
		
	}
	
}
//篮球教练
class BasketbassCoach extends Coach implements SpeackEnglish {

	@Override
	public void teach() {
		System.out.println("教扣篮");
		
	}

	@Override
	public void speak() {
		System.out.println("学习英语");
		
	}
	
}
//乒乓球教练
class PingpangCoach extends Coach {

	@Override
	public void teach() {
		System.out.println("教抽球");
		
	}
	
}