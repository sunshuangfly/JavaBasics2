package com.sun.second;
/**
 * java�еļ̳е��ص�:
 * 		java����ֻ֧�ֵ�һ�̳�,ֻ�ܼ̳�һ������ 
 * 		java����֧�ֶ��̳�
 * 
 * @date 2017��10��1��
 */
public class ExtendsDemo2 {
	public static void main(String[] args) {
		LOLGame lg = new LOLGame();
		lg.update();
		
		//LOLGame�ĸ���PCGame���Լ����̳�Games��
		lg.start();
		lg.stop();
	}
}

class Games {
	public void start() {
		System.out.println("��Ϸ������");
	}
	public void stop() {
		System.out.println("��Ϸ������");
	}
}

//PC�˸���
class PCGame extends Games{
	public void update() {
		System.out.println("PCGame������");
	}
}

//Mobile��
class MobileGame extends Games{
	public void update() {
		System.out.println("MobileGame������");
	}
}

//һ����ֻ�ܼ̳�һ������
class LOLGame extends PCGame{
	
}