package com.sun04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat:
 * 		格式化:
 * 			Date --- String
 * 			String format(Date date) 
 * 		解析:
 * 			String --- Date
 * 			Date parse(String source) 
 * 构造方法:
 * 		SimpleDateFormat():使用默认模式进行对象构建
 * 		SimpleDateFormat(String pattern):使用指定的模式进行对象的构建
 * 		
 * @date 2017年10月7日
 */
public class DateDemo3 {
	public static void main(String[] args) throws Exception {
		//method();
		method2();
		
	}

	private static void method2() throws ParseException {
		//使用指定模式进行对象构造
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		//创建日期对象
		Date d = new Date();
		//按照设定的格式格式化日期对象
		String format = sdf.format(d);
		System.out.println(format); //2017年10月07日 19:59
		
		
		//解析
		Date date = sdf.parse("2017年10月07日 19:59:22");
		System.out.println(date.toLocaleString());
	}

	private static void method() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat();
		//创建Date对象
		Date d = new Date();
		//将日期格式化
		String format = sdf.format(d);
		System.out.println(format);
	
		//解析  把字符串转换成日期对象
		Date date = sdf.parse("17-10-7 下午7:51");
		System.out.println(date.toLocaleString());
	}
}
