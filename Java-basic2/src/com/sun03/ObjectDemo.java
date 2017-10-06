package com.sun03;

import java.util.ArrayList;

/**
 * boolean equals(Object obj)
 * 		
 * public boolean equals(Object obj) {
        return (this == obj);
    }
      ʹ��==�Ƚ����������Ƿ����,�����������ͱȽϵ��ǵ�ֵַ
 * 
 * ��дequals����
 * @date 2017��10��6��
 */
public class ObjectDemo {
	public static void main(String[] args) {
		Person p = new Person("����",18);
		Person p2 = new Person("����",18);
	
		boolean flag = p.equals(p2);//����һ���������һ���µĵ�ֵַ
		System.out.println(flag);
		//���������Ϊ�������䶼һ������һ����,��ô���Ǿ���Ҫ��дequals����
		
		//һ�������뱾��Ƚ�,ҲΪtrue,��������û������,���Կ��ԸĽ�����
		System.out.println(p.equals(p));
		
		//����ȽϵĶ�����ͬһ����,��ô������޷��Ƚ�,���ʱ�����Ҫ���Ǵ���İ�ȫ��
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
		//���Ч��,�������Ƚ϶����ֵַһ��,���ڽ��������Ƚ�
		if(this == o) {
			return true;
		}
		
		//���Ч��
		if(o == null) {
			return false;
		}
		//�ύ����İ�ȫ��(��׳��),������������ͬһ������,��ôֱ�ӷ���false
		if(this.getClass() != o.getClass()) {
			return false;
		}
		
		//����ת��
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
