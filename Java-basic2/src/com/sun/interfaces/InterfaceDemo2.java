package com.sun.interfaces;
/**
 * �ӿں���֮��ĸ��ֹ�ϵ
 * 
 * ������:�̳й�ϵ,��һ�̳�,���̳�
 * ����ӿ�:ʵ�ֹ�ϵ,��ʵ��
 * �ӿ���ӿڵĹ�ϵ:�̳й�ϵ,��̳�
 * 
 * @date 2017��10��3��
 */
public class InterfaceDemo2 {

}

//�ӿ�A�̳нӿ�B
interface InterA extends InterB{
	public void eat();
}

//�ӿ�B
interface InterB {
	public void show();
}

//�ӿ�C�̳нӿ�A
interface InterC extends InterA{
	public void run();
}

//��ʵ�ֽӿ�A,C,���Զ�ʵ��.(�಻���Զ�̳�,�ӿڿ��Զ�ʵ��)
//�ӿ�A�̳нӿ�B,������Ҳ����ʵ�ֽӿ�B�ķ���,��Ϊ�ӿڵĶ��̳�(����ӿڶ����Զ�̳�)
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
