package com.sun.interfaces;
/**
 * 接口和类之间的各种关系
 * 
 * 类与类:继承关系,单一继承,多层继承
 * 类与接口:实现关系,多实现
 * 接口与接口的关系:继承关系,多继承
 * 
 * @date 2017年10月3日
 */
public class InterfaceDemo2 {

}

//接口A继承接口B
interface InterA extends InterB{
	public void eat();
}

//接口B
interface InterB {
	public void show();
}

//接口C继承接口A
interface InterC extends InterA{
	public void run();
}

//类实现接口A,C,可以多实现.(类不可以多继承,接口可以多实现)
//接口A继承接口B,所以类也必须实现接口B的方法,此为接口的多层继承(类与接口都可以多继承)
class Demo implements InterA,InterC {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
