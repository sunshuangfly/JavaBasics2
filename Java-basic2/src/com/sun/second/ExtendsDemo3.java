package com.sun.second;
/**
 * �̳��г�Ա�������ص�:
 * 		����ֻ�ܷ��ʸ����˽�г�Ա
 * 		�Ӹ����г�Ա�������ֲ�һ��ֱ�ӻ�ȡ�����г�Ա����
 * 		�Ӹ����г�Ա��������һ����ȡ�����Ա����
 * 
 * 
 * super�ؼ���:���Ի�ȡ�����еĳ�Ա,�÷���this����
 * @date 2017��10��1��
 */
public class ExtendsDemo3 {
	public static void main(String[] args) {
		Kid k = new Kid();
		k.show();
	}
}

//����
class Dad {
	String name = "�Ŵ�";
	//˽�л�
	private int age = 35;
}

//���Ӽ̳и���
class Kid extends Dad{
	//������������ͬ����,���þͽ�ԭ��
	String name = "С��";
	
	public void show() {
		String name = "С��";
		System.out.println(super.name);//����
		System.out.println(this.name);//
		System.out.println(name);//С��
		//���ܷ���
		//System.out.println(age);
	}
}
