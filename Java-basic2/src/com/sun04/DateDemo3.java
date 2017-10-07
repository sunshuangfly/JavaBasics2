package com.sun04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat:
 * 		��ʽ��:
 * 			Date --- String
 * 			String format(Date date) 
 * 		����:
 * 			String --- Date
 * 			Date parse(String source) 
 * ���췽��:
 * 		SimpleDateFormat():ʹ��Ĭ��ģʽ���ж��󹹽�
 * 		SimpleDateFormat(String pattern):ʹ��ָ����ģʽ���ж���Ĺ���
 * 		
 * @date 2017��10��7��
 */
public class DateDemo3 {
	public static void main(String[] args) throws Exception {
		//method();
		method2();
		
	}

	private static void method2() throws ParseException {
		//ʹ��ָ��ģʽ���ж�����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		//�������ڶ���
		Date d = new Date();
		//�����趨�ĸ�ʽ��ʽ�����ڶ���
		String format = sdf.format(d);
		System.out.println(format); //2017��10��07�� 19:59
		
		
		//����
		Date date = sdf.parse("2017��10��07�� 19:59:22");
		System.out.println(date.toLocaleString());
	}

	private static void method() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat();
		//����Date����
		Date d = new Date();
		//�����ڸ�ʽ��
		String format = sdf.format(d);
		System.out.println(format);
	
		//����  ���ַ���ת�������ڶ���
		Date date = sdf.parse("17-10-7 ����7:51");
		System.out.println(date.toLocaleString());
	}
}
