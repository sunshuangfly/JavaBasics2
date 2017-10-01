package com.sun.first;
/**
 * 测试工具类
 * 
 * @date 2017年10月1日
 */
public class MyArraysDemo {
	public static void main(String[] args) {
		//创建数组
		int[] arr = {2,3,4,5,6,7,11,9};
		int index = MyUtils.getIndex(arr, 5);
		System.out.println("3在该数组中的索引为:"+index);
		
		int max = MyUtils.getMax(arr);
		System.out.println("该数组最大元素为:"+max);
		
		int min = MyUtils.getMin(arr);
		System.out.println("该数组最小元素为:"+min);
	}
}
