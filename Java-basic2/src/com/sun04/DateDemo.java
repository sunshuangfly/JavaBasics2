package com.sun04;

import java.util.Date;

/**
 * Date:��ʾ�ض���˲��,��ȷ������,����ͨ�������趨�Լ�����ʾ��ʱ��,
 * 
 * ���췽��:
 * 		Date()	:��������һ����ʾ��ǰϵͳʱ���Date����
 * 		Date(long date) :����'ָ��ʱ��'����Date����,�������ṩ��long���мӷ��������ʱ��
 * @date 2017��10��7��
 */
public class DateDemo {
	public static void main(String[] args) {
		//��������
		Date d = new Date();
		System.out.println(d);
		
		System.out.println(d.toLocaleString());
		
		Date d2 = new Date(0);
		System.out.println(d2);
		System.out.println(d2.toLocaleString());
	}
}
