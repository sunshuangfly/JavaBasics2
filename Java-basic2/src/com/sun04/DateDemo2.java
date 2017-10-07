package com.sun04;

import java.util.Date;

/**
 * Date常用方法
 * 		long getTime() :返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
 * 
 * 		void setTime(long time) :设置此 Date 对象，以表示 1970 年 1 月 1 日 00:00:00 GMT 以后 time 毫秒的时间点。
 * 
 * @date 2017年10月7日
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
