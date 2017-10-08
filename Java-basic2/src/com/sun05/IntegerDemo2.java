package com.sun05;
/**
 * 自动装箱和拆箱
 * 
 * 	装箱:基本数据类型转换成包装类
 * 	拆箱:包装类转换成基本数据类型
 * 
 * @date 2017年10月8日
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		//自动装箱
		//相当于:Integer i = new Integer(10);
		Integer i = 10;
		
		//自动拆箱
		//相当于int a = i2.intValue();
		Integer i2 = 10;
		int a = i2;
		
		Integer i3 = 10;
		Integer i4 = 20;
		Integer i5 = i3+i4;
		/**
		 * 以上步骤为:
		 * Integer i3 = new Integer(i3.intValue() +i4.intValue());
		 */
		
	}
}
