package com.sun04;

import java.util.Date;

/**
 * Date���÷���
 * 		long getTime() :������ 1970 �� 1 �� 1 �� 00:00:00 GMT ������ Date �����ʾ�ĺ�������
 * 
 * 		void setTime(long time) :���ô� Date �����Ա�ʾ 1970 �� 1 �� 1 �� 00:00:00 GMT �Ժ� time �����ʱ��㡣
 * 
 * @date 2017��10��7��
 */
public class DateDemo2 {
	public static void main(String[] args) {
		Date d = new Date();
		//d.setTime(0);
		d.setTime(1000*60*60*24);
		System.out.println(d.toLocaleString());
		System.out.println(d.getTime());
	}
}
