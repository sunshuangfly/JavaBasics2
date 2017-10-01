package com.sun.second;
/**
 * 继承中成员变量的特点:
 * 		子类只能访问父类非私有成员
 * 		子父类中成员变量名字不一样直接获取父类中成员变量
 * 		子父类中成员变量名字一样获取子类成员变量
 * 
 * 
 * super关键字:可以获取父类中的成员,用法跟this相似
 * @date 2017年10月1日
 */
public class ExtendsDemo3 {
	public static void main(String[] args) {
		Kid k = new Kid();
		k.show();
	}
}

//父亲
class Dad {
	String name = "张大";
	//私有化
	private int age = 35;
}

//儿子继承父亲
class Kid extends Dad{
	//当子类中有相同变量,采用就近原则
	String name = "小张";
	
	public void show() {
		String name = "小李";
		System.out.println(super.name);//张三
		System.out.println(this.name);//
		System.out.println(name);//小李
		//不能访问
		//System.out.println(age);
	}
}
