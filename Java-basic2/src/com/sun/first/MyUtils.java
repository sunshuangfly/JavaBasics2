package com.sun.first;
/**
 * ����static�ؼ���,�Զ��幤����
 * 
 * 
 * @date 2017��10��1��
 */
public class MyUtils {
	//�����췽��˽�л�,������������
	private MyUtils(){}
	
	/**
	 * �������������Ԫ��
	 */
	public static int getMax(int[] arr) {
		//���������
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/**
	 * ������������СԪ��
	 */
	public static int getMin(int[] arr) {
		//���������
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			//���������һ��Ԫ��Ϊ��Сֵ,��ֵ��min
			min = arr[0];
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
	
	/**
	 * ����������ָ��Ԫ������
	 */
	public static int getIndex(int[] arr,int element) {
		//��������,�ж�Ԫ���Ƿ���������
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				return i;
			}
		}
		//���������,����-1
		return -1;
	}
}
