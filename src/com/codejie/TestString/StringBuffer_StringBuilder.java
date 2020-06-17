package com.codejie.TestString;
/**
 * 
 * @author tenma
 * StringBuffer		�̰߳�ȫ		������
 * StringBuilder	�̲߳���ȫ		���ʿ���
 * 
 * �����Ҫ���ַ�������Ƶ���Ĳ�����ʹ��String��ʹ���ڴ��в����������ַ�������������Ӱ���������
 * ��ʱʹ��StringBuffer����StringBuilder������߳�������
 */
public class StringBuffer_StringBuilder {
	public static void main(String[] args) {
//		testStringBuffer("������");
		testStringBuddler("������");
	}

	private static void testStringBuddler(String str) {
		//�޲ι��죬Ĭ�ϴ�С16
		StringBuilder sbu1 = new StringBuilder();
		System.out.println(sbu1.capacity());
		//ָ����С����
		StringBuilder sbu2 = new StringBuilder(8);
		System.out.println(sbu2.capacity());
		//�����ַ�������
		StringBuilder sBuilder = new StringBuilder(str);
		System.out.println(sBuilder.capacity());
		sBuilder.append('w');
		sBuilder.append(3);
		sBuilder.append("tianma");
		sBuilder.append("gongchang");
		sBuilder.append("123456789012345678901");
		System.out.println(sBuilder);
		sBuilder.delete(3, 8);//[3,8)
		System.out.println(sBuilder);
		System.out.println(sBuilder.capacity());
	}

	public static void testStringBuffer(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.append("www");
		sb.append(".360");
		sb.append("tianma.com");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		sb.delete(3,8);
		System.out.println(sb);
		sb.insert(2, 2333);
		System.out.println(sb);
		sb.replace(2, 6, "ahhhh");//[2,6)
		System.out.println(sb);
	}
}
