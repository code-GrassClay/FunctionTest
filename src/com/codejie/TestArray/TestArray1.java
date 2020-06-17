package com.codejie.TestArray;

import java.util.Scanner;

import javax.naming.ldap.SortControl;

/**
 * 
 * @author codejie
 *
 */
public class TestArray1 {
	static int[] arr1 = {1,3,6,5,11,9,10,15,13,4,16,8,2,17,56,98,32,66,46,42,88,7,51,35,47,61,14,31,45,89,49,33,65,62,48,36};
	public static void main(String[] args) {
		System.out.println(System.nanoTime());
		/*
		 * ð�������һ�棬ÿһ�ֱȽ�length-1��
		 */
//		test1(arr1);
		/*
		 * ð������ڶ��棬ÿһ�ֱȽ���֮�����һλ���Ǳ��ֱȽϳ�������С��һλ������ÿѭ��һ�־Ϳ����ٱȽ�һ��
		 */
//		arr1 = sort(arr1);
		/*
		 * ���ַ�����
		 */
		System.out.print("\n");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ������");
		int num = scanner.nextInt();
		int index = search(arr1,num);
		if(index == -1) {
			System.out.println("û�鵽");
		}else {
			System.out.println("�������ڵ�"+index+"λ");
		}
		System.out.println("\n"+System.nanoTime());
	}
	/**
	 * 
	 * @param arr ���������
	 * @param num Ҫ���ҵ�����
	 * @return ����Ŀ���������ڵ��������������򷵻�-1
	 * 1���ȶ������������
	 */
	private static int search(int[] arr,int num) {
		sort(arr);
		for(int i:arr) {
			System.out.print(i+",");
		}
		int start = 0;
		int end = arr.length-1;
		System.out.println("�ܳ���"+arr.length);
		while(true) {
			if((end-start)>1) { //����м����ٻ���һλ����ȡ�м�ֵ�Ƚ�
				int middle = (end+start)/2;
				System.out.println("��"+middle+"λ��"+arr[middle]+"�ǲ��ǣ�");
				if(arr.length%2 == 0) {
					if(num == arr[middle]) {
						System.out.println("��������");
						return middle;
					}else if(num < arr[middle]) {
						System.out.println("����");
						end = middle;
					}else if(num > arr[middle]) {
						System.out.println("����");
						start = middle;
					}
				}
			}else { // ����м�һλ��û���ˣ���ȡ�����ͷ�ıȽ�
				if(num == arr[start]) {
					System.out.println("�ǵ�"+start+"λ��"+arr[start]);
					return start;
				}else if(num == arr[end]) {
					System.out.println("��"+end+"λ��"+arr[end]);
					return end;
				}else {
					System.out.println("�����ˣ�û�У���");
					return -1;
				}
			}
		}
	}

	private static int[] invertSort(int[] arr) {
		for(int j=0;j<arr.length-1;j++) { //ѭ��length-1�ֱȽ�
			for(int i=0;i<arr.length-j;i++) { //ÿһλ��ǰһλ�Ƚϣ�ÿһ���ٱȽ�1��
				if(i<arr.length-1) {
					if(arr[i]<arr[i+1]) {
						int t;
						t = arr[i+1];
						arr[i+1] = arr[i];
						arr[i] = t;
					}
				}
			}
		}
		return arr;
	}
	private static int[] sort(int[] arr) {
		for(int j=0;j<arr.length-1;j++) { //ѭ��length-1�ֱȽ�
			for(int i=0;i<arr.length-j;i++) { //ÿһλ��ǰһλ�Ƚϣ�ÿһ���ٱȽ�1��
				if(i<arr.length-1) {
					if(arr[i]>arr[i+1]) {
						int t;
						t = arr[i+1];
						arr[i+1] = arr[i];
						arr[i] = t;
					}
				}
			}
		}
		return arr1;
	}

	private static void test1() {
		for(int j=0;j<arr1.length-1;j++) { //ѭ��length-1�ֱȽ�
			for(int i=0;i<arr1.length;i++) { //ÿһλ��ǰһλ�Ƚϣ�ÿһ�ֱȽ�length-1��
				if(i<arr1.length-1) {
					if(arr1[i]<arr1[i+1]) {
						int t;
						t = arr1[i+1];
						arr1[i+1] = arr1[i];
						arr1[i] = t;
					}
				}
			}
		}
	}
}
