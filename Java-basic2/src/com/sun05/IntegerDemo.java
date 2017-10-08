package com.sun05;
/**
 * ����:�ж�һ�����Ƿ����int��ķ�Χ
 * ���ڻ�����������ֻ����һЩ�򵥵Ĳ�������,����javaΪ���Ƿ�װ�˻�����������,Ϊÿ�ֻ������������ṩ�˰�װ��
 * ��װ����Ƿ�װ�˻����������͵���,Ϊ�����ṩ���˸��ิ�ӵķ�����һЩ����
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
 * 		String ---int	�ַ���תint
 * 			��ʽһ:static int parseInt(String s)
 * 			��ʽ��:intValue()
 * 		
 * 		int --- String	intת�ַ���
 * 			��ʽһ:+ ""
 * 			��ʽ��:String toString()
 * 			��ʽ��:static String toString(int i)
 * 
 * @date 2017��10��8��
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//Integer(String s)
		Integer i = new Integer("10");
		System.out.println(i);
		
		//int intValue()
		int a = i.intValue();
		System.out.println(a+i);
		
		//�ַ���תint
		int b = Integer.parseInt("25");
		System.out.println(b);
		
		//intת�ַ��� 
		Integer i2 = new Integer(20);
		String s = i2.toString();
		System.out.println(s);
		
		//String toString(int i)
		String s2 = Integer.toString(40);
		System.out.println(s2);
	}
}
