package com.sun01;

public class PermissionDemo2 {
	public static void main(String[] args) {
		PermissionDemo pd = new PermissionDemo();
		pd.publicMethod();
		pd.defaultMethod();
		//pd.privateMethod();
		pd.protectedMethod();
	}
}
