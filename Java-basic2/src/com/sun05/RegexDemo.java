package com.sun05;

/**
 * 校验qq号: 要求必须是5-15位 0不能开头 必须都是数字
 * 
 * 正则表达式:一套规范,可以用于匹配字符串,很多语言都使用
 * 
 * 	boolean matches(String regex) :判断当前字符串是否匹配指定的正则表达式,匹配返回true,否则返回false
 * @date 2017年10月8日
 */
public class RegexDemo {
	public static void main(String[] args) {
		String qq = "1234";
		boolean flag = checkQQ(qq);
		System.out.println(flag);
		
		//使用正则表达式
		boolean flag2 = qq.matches("[1-9][0-9]{4,14}");
		System.out.println(flag2);
	}

	public static boolean checkQQ(String qq) {
		int length = qq.length();
		// 要求必须是5-15位
		if (length < 5 || length > 15) {
			return false;
		}

		// 0不能开头
		if (qq.startsWith("0")) {
			return false;
		}

		// 必须都是数字
		for (int i = 0; i < length; i++) {
			// 得到每一个字符
			char chs = qq.charAt(i);
			// 对字符进行判断
			if (chs < '0' || chs > '9') {
				return false;
			}
		}

		return true;
	}
	
	
}
