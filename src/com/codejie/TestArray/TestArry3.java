package com.codejie.TestArray;

import java.util.Arrays;

/**
 * 
 * @author codejie
 * 测试数组工具类Arrays类
 *
 */
public class TestArry3 {
	public static void main(String[] args) {
		int[] arr = {9,49,6,35,0,26,5,79,35,1,23,14,16,18,32};
		System.out.println(Arrays.toString(arr));//打印输出数组
		
		Arrays.sort(arr);//数组从小到大排序
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 35));//数组中查找元素
		
		System.out.println(Arrays.toString(Arrays.copyOf(arr, 5)));//截取复制
		System.out.println(Arrays.toString(Arrays.copyOf(arr, 50)));//默认填充复制
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 1,9)));//指定区间复制[1,9)
	}
}
