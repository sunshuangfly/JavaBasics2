package com.sun05;
/**
 * 需求:判断一个数是否符合int类的范围
 * 由于基本数据类型只能做一些简单的操作运算,所以java为我们封装了基本数据类型,为每种基本数据类型提供了包装类
 * 包装类就是封装了基本数据类型的类,为我们提供更了更多复杂的方法和一些变量
 * 
 * byte		Byte
 * short	Short
 * char		Character
 * int 		Integer
 * long		Long
 * float	Float
 * double	Double
 * boolean	Boolean
 * 
 * Integer:
 * 		String ---int	字符串转int
 * 			方式一:static int parseInt(String s)
 * 			方式二:intValue()
 * 		
 * 		int --- String	int转字符串
 * 			方式一:+ ""
 * 			方式二:String toString()
 * 			方式三:static String toString(int i)
 * 
 * @date 2017年10月8日
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//Integer(String s)
		Integer i = new Integer("10");
		System.out.println(i);
		
		//int intValue()
		int a = i.intValue();
		System.out.println(a+i);
		
		//字符串转int
		int b = Integer.parseInt("25");
		System.out.println(b);
		
		//int转字符串 
		Integer i2 = new Integer(20);
		String s = i2.toString();
		System.out.println(s);
		
		//String toString(int i)
		String s2 = Integer.toString(40);
		System.out.println(s2);
	}
}
