package com.sun.first;
/**
 * 利用static关键字,自定义工具类
 * 
 * 
 * @date 2017年10月1日
 */
public class MyUtils {
	//将构造方法私有化,不允许创建对象
	private MyUtils(){}
	
	/**
	 * 返回数组中最大元素
	 */
	public static int getMax(int[] arr) {
		//定义参照物
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/**
	 * 返回数组中最小元素
	 */
	public static int getMin(int[] arr) {
		//定义参照物
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			//假设数组第一个元素为最小值,赋值给min
			min = arr[0];
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
	
	/**
	 * 返回数组中指定元素索引
	 */
	public static int getIndex(int[] arr,int element) {
		//遍历数组,判断元素是否在数组中
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				return i;
			}
		}
		//如果不存在,返回-1
		return -1;
	}
}
