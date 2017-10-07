package com.sun04;

import java.util.Date;

/**
 * Date:表示特定的瞬间,精确到毫秒,可以通过方法设定自己所表示的时间,
 * 
 * 构造方法:
 * 		Date()	:创建的是一个表示当前系统时间的Date对象
 * 		Date(long date) :根据'指定时间'创建Date对象,根据你提供的long进行加法运算计算时间
 * @date 2017年10月7日
 */
public class DateDemo {
	public static void main(String[] args) {
		//创建对象
		Date d = new Date();
		System.out.println(d);
		
		System.out.println(d.toLocaleString());
		
		Date d2 = new Date(0);
		System.out.println(d2);
		System.out.println(d2.toLocaleString());
	}
}
