package com.codejie.BaseKnowLedge;

import com.codejie.TestArray.TestArray1;

/**
 * 
 * @author codejie
 * 变量
 * 		变量的本质是一个“可操作的存储空间”
 * 		每个变量都有类型
 * 		变量的类型可以是基本数据类型，也可以是引用数据类型
 * 		变量的类型
 * 			局部变量
 * 			成员变量
 * 			静态变量
 * 常量：常量通常指固定的值
 * 		常量的申明通常用final修饰
 *  	常量的命名通常用大写字母和下划线组成
 */
public class Variable_Constant {
	int a;//成员变量，从属于对象；成员变量会被自动初始化
	static int size;//静态变量，从属于类
	public static void main(String[] args) {
		int age;//局部变量，从属于方法
		age = 18;
		//变量
		Test1();
		Test2();
		//常量
		Test3();
	}

	private static void Test1() {
		//申明变量
		int i;
//		int j = i+1;//编译报错，变量i还未被初始化
		i = 10;
		int j = i+1;//编译正确
	}

	private static void Test2() {
		boolean flag = true;
		char c1,c2;
		c1 = '\u0041';
		c2 = 'b';
		int x;
		x = 9;
		int y = x;
		float f = 3.14f;//申明float变量并为其赋值
		double d = 3.1415926;
	}

	private static void Test3() {
		final double PI = 3.1415926;
//		PI = 3.15;//编译出错，常量不能被赋值
		double r = 4;
		double area = PI*r*r;
		double circle = 2*PI*r;
		System.out.println("area="+area);
		System.out.println("circle="+circle);
	}

}
