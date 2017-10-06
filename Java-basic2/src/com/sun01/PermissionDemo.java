package com.sun01;
/**
 * 权限修饰符可以访问范围
 * 		public 		当前类 	相同包下不同的类 		不同包下的类
 * 		default		当前类 	相同包下不同的类
 * 		private		当前类 	(不可以访问)
 * 		protected 	当前类 	相同包下不同的类
 * 注意:
 * 		default:当前包下使用
 * 		protected 子类对象也可以使用
 * @date 2017年10月6日
 */
public class PermissionDemo {

	public void publicMethod() {
		System.out.println("publicMethod");
	}
	
	void defaultMethod() {
		System.out.println("defaultMethod");
	}
	
	private void privateMethod() {
		System.out.println("privateMethod");
	}
	
	protected void protectedMethod() {
		System.out.println("protectedMethod");
	}
	
	public static void main(String[] args) {
		PermissionDemo pd = new PermissionDemo();
		pd.publicMethod();
		pd.defaultMethod();
		pd.privateMethod();
		pd.protectedMethod();
	}
}
