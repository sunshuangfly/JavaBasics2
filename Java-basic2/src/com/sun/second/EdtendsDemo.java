package com.sun.second;
/**
 * �̳�:������й�ͬ�ĳ�Ա�����ͳ�Ա����,��ȡ����һ������(����),
 * 		���ö����ȥ�̳������,���ǾͿ��Ի�ø����еĳ�Ա��.
 * 
 * @date 2017��10��1��
 */
public class EdtendsDemo {
	public static void main(String[] args) {
		//����Data����,��Ϊ�̳���Game,���Լ̳���Game�еĳ�Ա����������
		Data d = new Data();
		d.start();
		d.stop();
		
		LOL l = new LOL();
		l.start();
		l.stop();
	}
}
//��Ϸ
class Game {
	String name;
	double version; //�汾
	String agent;//������
	
	public void start() {
		System.out.println("��Ϸ����");
	}
	
	public void stop() {
		System.out.println("��Ϸ����");
	}
}

//Data��Ϸ
class Data extends Game{
	/*String name;
	double version; //�汾
	String agent;//������
	
	public void start() {
		System.out.println("��Ϸ����");
	}
	
	public void stop() {
		System.out.println("��Ϸ����");
	}*/
}

//LOL��Ϸ
class LOL extends Game{
	/*String name;
	double version; //�汾
	String agent;//������
	
	public void start() {
		System.out.println("��Ϸ����");
	}
	
	public void stop() {
		System.out.println("��Ϸ����");
	}*/
}