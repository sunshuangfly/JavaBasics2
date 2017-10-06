package com.sun01;
/**
 * Ȩ�����η����Է��ʷ�Χ
 * 		public 		��ǰ�� 	��ͬ���²�ͬ���� 		��ͬ���µ���
 * 		default		��ǰ�� 	��ͬ���²�ͬ����
 * 		private		��ǰ�� 	(�����Է���)
 * 		protected 	��ǰ�� 	��ͬ���²�ͬ����
 * ע��:
 * 		default:��ǰ����ʹ��
 * 		protected �������Ҳ����ʹ��
 * @date 2017��10��6��
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
