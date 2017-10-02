package com.sun.abstracts;
/**
 * ��������ʦ,��ҵ����ʦ
 * 
 * ����:
 * 		����:����,����,�Ա�
 * 		��Ϊ:����,���
 * 
 * @date 2017��10��2��
 */
public class AbstractTest {
	public static void main(String[] args) {
		BasicTeacher bt = new BasicTeacher();
		bt.name = "����";
		bt.teach();
		
		JobTeacher jt = new JobTeacher();
		jt.name = "����";
		jt.teach();
	}
}

abstract class Teacher {
	String name;
	int age;
	String gender;
	
	public abstract void teach();
}

class BasicTeacher extends Teacher {

	@Override
	public void teach() {
		System.out.println(name+"��������γ�");
		
	}
	
}

class JobTeacher extends Teacher {

	@Override
	public void teach() {
		System.out.println(name+"�����ҵ�γ�");
		
	}
	
}
