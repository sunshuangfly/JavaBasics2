package com.sun03;

import java.util.ArrayList;

/**
 * boolean equals(Object obj)
 * 		
 * public boolean equals(Object obj) {
        return (this == obj);
    }
      使用==比较两个对象是否相等,引用数据类型比较的是地址值
 * 
 * 重写equals方法
 * @date 2017年10月6日
 */
public class ObjectDemo {
	public static void main(String[] args) {
		Person p = new Person("张三",18);
		Person p2 = new Person("张三",18);
	
		boolean flag = p.equals(p2);//创建一个对象就是一个新的地址值
		System.out.println(flag);
		//如果我们认为姓名年龄都一样就是一个的,那么我们就需要重写equals方法
		
		//一个对象与本身比较,也为true,但是这样没有意义,所以可以改进方法
		System.out.println(p.equals(p));
		
		//如果比较的对象不是同一个类,那么本身就无法比较,这个时候就需要考虑代码的安全性
		System.out.println(p.equals(new ArrayList<>()));
	}
}

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object o) {
		//提高效率,当两个比较对象地址值一样,不在进行其他比较
		if(this == o) {
			return true;
		}
		
		//提高效率
		if(o == null) {
			return false;
		}
		//提交代码的安全性(健壮性),当两个对象不是同一个类型,那么直接返回false
		if(this.getClass() != o.getClass()) {
			return false;
		}
		
		//向下转型
		Person other = (Person)o;
		
		if(!this.name.equals(other.name)) {
			return false;
		}
		
		if(this.age != other.age) {
			return false;
		}
		
		return true;
	}
}
