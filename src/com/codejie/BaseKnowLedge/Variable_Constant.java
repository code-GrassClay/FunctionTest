package com.codejie.BaseKnowLedge;

import com.codejie.TestArray.TestArray1;

/**
 * 
 * @author codejie
 * ����
 * 		�����ı�����һ�����ɲ����Ĵ洢�ռ䡱
 * 		ÿ��������������
 * 		���������Ϳ����ǻ����������ͣ�Ҳ������������������
 * 		����������
 * 			�ֲ�����
 * 			��Ա����
 * 			��̬����
 * ����������ͨ��ָ�̶���ֵ
 * 		����������ͨ����final����
 *  	����������ͨ���ô�д��ĸ���»������
 */
public class Variable_Constant {
	int a;//��Ա�����������ڶ��󣻳�Ա�����ᱻ�Զ���ʼ��
	static int size;//��̬��������������
	public static void main(String[] args) {
		int age;//�ֲ������������ڷ���
		age = 18;
		//����
		Test1();
		Test2();
		//����
		Test3();
	}

	private static void Test1() {
		//��������
		int i;
//		int j = i+1;//���뱨������i��δ����ʼ��
		i = 10;
		int j = i+1;//������ȷ
	}

	private static void Test2() {
		boolean flag = true;
		char c1,c2;
		c1 = '\u0041';
		c2 = 'b';
		int x;
		x = 9;
		int y = x;
		float f = 3.14f;//����float������Ϊ�丳ֵ
		double d = 3.1415926;
	}

	private static void Test3() {
		final double PI = 3.1415926;
//		PI = 3.15;//��������������ܱ���ֵ
		double r = 4;
		double area = PI*r*r;
		double circle = 2*PI*r;
		System.out.println("area="+area);
		System.out.println("circle="+circle);
	}

}
