package com.sun.first;
/**
 * ���Թ�����
 * 
 * @date 2017��10��1��
 */
public class MyArraysDemo {
	public static void main(String[] args) {
		//��������
		int[] arr = {2,3,4,5,6,7,11,9};
		int index = MyUtils.getIndex(arr, 5);
		System.out.println("3�ڸ������е�����Ϊ:"+index);
		
		int max = MyUtils.getMax(arr);
		System.out.println("���������Ԫ��Ϊ:"+max);
		
		int min = MyUtils.getMin(arr);
		System.out.println("��������СԪ��Ϊ:"+min);
	}
}
