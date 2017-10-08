package com.sun05;

/**
 * У��qq��: Ҫ�������5-15λ 0���ܿ�ͷ ���붼������
 * 
 * ������ʽ:һ�׹淶,��������ƥ���ַ���,�ܶ����Զ�ʹ��
 * 
 * 	boolean matches(String regex) :�жϵ�ǰ�ַ����Ƿ�ƥ��ָ����������ʽ,ƥ�䷵��true,���򷵻�false
 * @date 2017��10��8��
 */
public class RegexDemo {
	public static void main(String[] args) {
		String qq = "1234";
		boolean flag = checkQQ(qq);
		System.out.println(flag);
		
		//ʹ��������ʽ
		boolean flag2 = qq.matches("[1-9][0-9]{4,14}");
		System.out.println(flag2);
	}

	public static boolean checkQQ(String qq) {
		int length = qq.length();
		// Ҫ�������5-15λ
		if (length < 5 || length > 15) {
			return false;
		}

		// 0���ܿ�ͷ
		if (qq.startsWith("0")) {
			return false;
		}

		// ���붼������
		for (int i = 0; i < length; i++) {
			// �õ�ÿһ���ַ�
			char chs = qq.charAt(i);
			// ���ַ������ж�
			if (chs < '0' || chs > '9') {
				return false;
			}
		}

		return true;
	}
	
	
}
