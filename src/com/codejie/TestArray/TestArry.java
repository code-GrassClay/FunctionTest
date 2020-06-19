package com.codejie.TestArray;

public class TestArry {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,9,5,6};//��̬��ʼ��
		printArry(arr1);
		int[] arr2 = new int[10];//��̬��ʼ������ȷ����С���ٸ�ֵ
		arr2[0] = 1;
		arr2[1] = 3;
		arr2[2] = 4;
		printArry(arr2);//1,3,4,0,0,0,0,0,0,0,
		/*
		 * �����Ĭ�ϳ�ʼ����
		 * ��̬��ʼ��ָ�������С�������е�Ԫ���Ѿ������������ͳ�ʼ��ΪĬ��ֵ��
		 * ��int��Ĭ��ֵ��0
		 * String��Ĭ��ֵ��null
		 * 
		 */
		String[] arr3 = new String[5];
		printArry(arr3);//null,null,null,null,null,
		char[] arr4 = new char[5];
		printArry(arr4);
		/*
		 * ���鿽��
		 * ʹ��System�е�arraycopy����
		 * arraycopy�����Ĳ�����
		 * 		Դ���顢ԭ���鸴����ʼλ��Ŀ�����顢Ŀ������ճ����ʼλ�������ܳ���
		 */
		int[] arr5 = {1,2,3,4,5,6,7,8,9};
		System.arraycopy(arr5,1, arr2,3,6);//��arr5���±�1��ʼ���Ƶ�arr2�ӵ�3λ��ʼ��ճ��6λ
		System.out.print("arr2=");
		printArry(arr2);
	}
	
	public static void printArry(int[] arr) {
		for(int i : arr) {
			System.out.print(i+",");
		}
		System.out.println();
	}
	public static void printArry(String[] arr) {
		for(String i : arr) {
			System.out.print(i+",");
		}
		System.out.println();
	}
	public static void printArry(char[] arr) {
		for(char i : arr) {
			System.out.print(i+",");
		}
		System.out.println();
	}
}
