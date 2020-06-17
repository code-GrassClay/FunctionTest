package com.codejie.TestArray;

import java.util.Scanner;

/**
 * 
 * @author codejie
 * 
 *
 */
public class TestArry2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr1 = {12,13,14,15,16,17,18,19,9,2,4,3,1,6,5,8,7,26,21,23,25,29,24,28,27};
		sort(arr1);
		printArry(arr1);
		int[] arr2 = {};
		System.out.println("请输入要查询的数字：");
		int find = scanner.nextInt();
		System.out.println(search(arr1, find));
	}
	public static int search(int[] arr,int num) {
		if(arr.length == 0) {
			return -1;
		}
		int start = 0;
		int end = arr.length-1;
		while(true) {
			int middle = (start+end)/2;
			System.out.println("第"+middle+"位的"+arr[middle]);
			System.out.println(start+"--"+end);
			if((end-start)<=1) {
				System.out.println("来啦老弟");
				if(arr[start]==num) {
					return start;
				}else if(arr[end]==num) {
					return end;
				}else {
					return -1;
				}
			}else {
				if(num>arr[middle]) {
					start = middle;
				}else if(num<arr[middle]) {
					end = middle;
				}else{
					return middle;
				}
			}
		}
	}
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void printArry(int[] arr) {
		for(int i:arr) {
			System.out.print(i+",");
		}
		System.out.println("");
	}
}
