package com.codejie.TestArray;

import java.util.Arrays;

/**
 * 
 * @author codejie
 * �������鹤����Arrays��
 *
 */
public class TestArry3 {
	public static void main(String[] args) {
		int[] arr = {9,49,6,35,0,26,5,79,35,1,23,14,16,18,32};
		System.out.println(Arrays.toString(arr));//��ӡ�������
		
		Arrays.sort(arr);//�����С��������
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 35));//�����в���Ԫ��
		
		System.out.println(Arrays.toString(Arrays.copyOf(arr, 5)));//��ȡ����
		System.out.println(Arrays.toString(Arrays.copyOf(arr, 50)));//Ĭ����临��
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 1,9)));//ָ�����临��[1,9)
	}
}
