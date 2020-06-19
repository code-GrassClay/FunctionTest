package com.codejie.TestArray;

public class TestArry {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,9,5,6};//静态初始化
		printArry(arr1);
		int[] arr2 = new int[10];//动态初始化，先确定大小，再给值
		arr2[0] = 1;
		arr2[1] = 3;
		arr2[2] = 4;
		printArry(arr2);//1,3,4,0,0,0,0,0,0,0,
		/*
		 * 数组的默认初始化：
		 * 动态初始化指定数组大小后，数组中的元素已经按照数组类型初始化为默认值了
		 * 如int类默认值是0
		 * String类默认值是null
		 * 
		 */
		String[] arr3 = new String[5];
		printArry(arr3);//null,null,null,null,null,
		char[] arr4 = new char[5];
		printArry(arr4);
		/*
		 * 数组拷贝
		 * 使用System中的arraycopy方法
		 * arraycopy方法的参数：
		 * 		源数组、原数组复制起始位、目标数组、目标数组粘贴起始位、复制总长度
		 */
		int[] arr5 = {1,2,3,4,5,6,7,8,9};
		System.arraycopy(arr5,1, arr2,3,6);//把arr5从下标1开始复制到arr2从第3位开始，粘贴6位
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
