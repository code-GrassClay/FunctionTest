package com.codejie.TestString;
/**
 * 
 * @author codejie
 * String ������ַ�����
 * Java �����е������ַ�������ֵ���� "abc" ������Ϊ�����ʵ��ʵ�֡� 
 * �ַ����ǳ��������ǵ�ֵ�ڴ���֮���ܸ��ġ�
 * �ַ�����������StringBuffer��StringBuildder��֧�ֿɱ���ַ�����
 * ��Ϊ String �����ǲ��ɱ�ģ����Կ��Թ���
 */
public class TestString1 {
	static String str1 = "iLoveYou";
	static String str2 = "iHateYou";
	static String str3 = "iFuckYou";
	public static void main(String[] args) {
		System.out.println(str1.charAt(3));//����ָ�����������ַ�char��index�Ǵ�0��ʼ���ģ�
		System.out.println(str1.concat("ever"));//��ָ���ַ������ӵ�ԭ�ַ������淵��һ���µ��ַ���
		System.out.println(str1.startsWith("iLove"));//�жϵ�ǰ�ַ����Ƿ���ָ�����ַ���ǰ׺��ͷ
		System.out.println(str1.endsWith("You"));//�жϵ�ǰ�ַ����Ƿ���ָ�����ַ�����׺��β
		System.out.println("iLoveYou".equals(str1));//�ж������ַ����Ƿ���ȣ�һ�㽫ȷ����д�����棬��ȷ������Ϊequals�Ĳ�������
		System.out.println("iLoveYou".equals(null));
		System.out.println("iLoveYou".equals(""));
		System.out.println("".equals("iLoveYou"));
		/*
		 * ���������д�����棬���ַ�����������equals()�������з���
		System.out.println(str1.equals("iLoveYou"));
		��������ֵ��Ҫ�ⲿ����ʱ�����п�����null�ȷ��ַ�����ֵ 
		System.out.println(null.equals("iLoveYou"));
		java.lang.Error: Unresolved compilation problem: 
		Cannot invoke equals(String) on the primitive type null
		*/
		
	}
}
