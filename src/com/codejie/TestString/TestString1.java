package com.codejie.TestString;
/**
 * 
 * @author codejie
 * String 类代表字符串。
 * Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。 
 * 字符串是常量；它们的值在创建之后不能更改。
 * 字符串缓冲区（StringBuffer和StringBuildder）支持可变的字符串。
 * 因为 String 对象是不可变的，所以可以共享
 */
public class TestString1 {
	static String str1 = "iLoveYou";
	static String str2 = "iHateYou";
	static String str3 = "iFuckYou";
	public static void main(String[] args) {
		System.out.println(str1.charAt(3));//返回指定索引处的字符char（index是从0开始数的）
		System.out.println(str1.concat("ever"));//将指定字符串连接到原字符串后面返回一个新的字符串
		System.out.println(str1.startsWith("iLove"));//判断当前字符串是否以指定的字符串前缀开头
		System.out.println(str1.endsWith("You"));//判断当前字符串是否以指定的字符串后缀结尾
		System.out.println("iLoveYou".equals(str1));//判断两个字符串是否相等，一般将确定的写在外面，不确定的作为equals的参数传入
		System.out.println("iLoveYou".equals(null));
		System.out.println("iLoveYou".equals(""));
		System.out.println("".equals("iLoveYou"));
		/*
		 * 如果将变量写在外面，用字符串变量调用equals()方法会有风险
		System.out.println(str1.equals("iLoveYou"));
		当变量的值需要外部传入时，就有可能是null等非字符串的值 
		System.out.println(null.equals("iLoveYou"));
		java.lang.Error: Unresolved compilation problem: 
		Cannot invoke equals(String) on the primitive type null
		*/
		
	}
}
