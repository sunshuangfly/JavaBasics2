package com.sun.second;
/**
 * ������д��Ӧ�ó���:������ķ���������ȫ��������ʹ��,���ʱ��������д����ķ���,
 * 				�������ڷ�����ʹ��super�ؼ��ֵ��ø��෽��,������,�ȿ���ѡ���๦��,Ҳ����ӵ���Լ����й���
 * ������д��ע������:������д����˽�еķ���,
 * 				��д�ķ���Ȩ�ޱ�����ڵ��ڸ��෽����Ȩ��
 * 
 * ע��:@Override
 * 
 * @date 2017��10��2��
 */
public class ExtendsDemo5 {
	public static void main(String[] args) {
		NewPhone np = new NewPhone();
		np.call();
	}
}

class Phone {
	public void call() {
		System.out.println("��绰");
	}
}

class NewPhone extends Phone {
	@Override
	//������д����call����
	public void call() {
		System.out.println("������");
		//��super�ؼ��ֵ��ø��෽��
		super.call();
	}
}
