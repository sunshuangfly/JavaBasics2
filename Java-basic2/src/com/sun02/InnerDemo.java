package com.sun02;
/**
 * ��Ա�ڲ���
 * 		����ĳ�Աλ��,�ͳ�Ա������Ա����λ��һ����
 * 		���ڲ����п��Է����ⲿ��ĳ�Ա,����˽�г�Ա
 * 		����������ڲ���,��Ҫ�ȵ����ⲿ��,�ſ��Ե����ڲ���
 * @date 2017��10��6��
 */
public class InnerDemo {
	public static void main(String[] args) {
		/*Other o = new Other();
		o.eat();*/
		Other.Inner i = new Other().new Inner();
		i.run();
		
		
	}
}

class Other {
	private int num = 10;
	int name;
	
	public void eat() {
		System.out.println("��");
		Inner in = new Inner();
		in.run();
	}
	
	class Inner {
		public void run() {
			System.out.println("��");
			System.out.println(num);
		}
	}
}
