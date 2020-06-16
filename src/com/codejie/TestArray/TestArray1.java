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
		 * 冒泡排序第一版，每一轮比较length-1次
		 */
//		test1(arr1);
		/*
		 * 冒泡排序第二版，每一轮比较完之后，最后一位都是本轮比较出来的最小的一位，所以每循环一轮就可以少比较一次
		 */
//		arr1 = sort(arr1);
		/*
		 * 二分法查找
		 */
		System.out.print("\n");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要查询的数字");
		int num = scanner.nextInt();
		int index = search(arr1,num);
		if(index == -1) {
			System.out.println("没查到");
		}else {
			System.out.println("该数字在第"+index+"位");
		}
		System.out.println("\n"+System.nanoTime());
	}
	/**
	 * 
	 * @param arr 传入的数组
	 * @param num 要查找的数字
	 * @return 返回目标数字所在的索引，不存在则返回-1
	 * 1、先对数组进行排序
	 */
	private static int search(int[] arr,int num) {
		sort(arr);
		for(int i:arr) {
			System.out.print(i+",");
		}
		int start = 0;
		int end = arr.length-1;
		System.out.println("总长度"+arr.length);
		while((end-start)>1) {
			int middle = (end+start)/2+1;
			System.out.println("第"+middle+"位的"+arr[middle]);
			if(arr.length%2 == 0) {
				if(num == arr[middle]) {
					return middle;
				}else if(num < arr[middle]) {
					end = middle;
				}else if(num > arr[middle]) {
					start = middle;
				}
			}else {
				
			}
		}
		return -1;
	}

	private static int[] invertSort(int[] arr) {
		for(int j=0;j<arr.length-1;j++) { //循环length-1轮比较
			for(int i=0;i<arr.length-j;i++) { //每一位与前一位比较，每一轮少比较1次
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
		for(int j=0;j<arr.length-1;j++) { //循环length-1轮比较
			for(int i=0;i<arr.length-j;i++) { //每一位与前一位比较，每一轮少比较1次
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
		for(int j=0;j<arr1.length-1;j++) { //循环length-1轮比较
			for(int i=0;i<arr1.length;i++) { //每一位与前一位比较，每一轮比较length-1次
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
