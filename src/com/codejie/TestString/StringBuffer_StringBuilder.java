package com.codejie.TestString;
/**
 * 
 * @author tenma
 * StringBuffer		线程安全		访问慢
 * StringBuilder	线程不安全		访问快速
 * 
 * 如果需要对字符串进行频繁的操作，使用String会使得内存中产生大量的字符串副本，严重影响程序性能
 * 此时使用StringBuffer或者StringBuilder可以提高程序性能
 */
public class StringBuffer_StringBuilder {
	public static void main(String[] args) {
//		testStringBuffer("天马工厂");
		testStringBuddler("天马工场");
	}

	private static void testStringBuddler(String str) {
		//无参构造，默认大小16
		StringBuilder sbu1 = new StringBuilder();
		System.out.println(sbu1.capacity());
		//指定大小构造
		StringBuilder sbu2 = new StringBuilder(8);
		System.out.println(sbu2.capacity());
		//传入字符串构造
		StringBuilder sBuilder = new StringBuilder(str);
		System.out.println(sBuilder.capacity());
		sBuilder.append('w');
		sBuilder.append(3);
		sBuilder.append("tianma");
		sBuilder.append("gongchang");
		sBuilder.append("123456789012345678901");
		System.out.println(sBuilder);
		sBuilder.delete(3, 8);//[3,8)
		System.out.println(sBuilder);
		System.out.println(sBuilder.capacity());
	}

	public static void testStringBuffer(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.append("www");
		sb.append(".360");
		sb.append("tianma.com");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		sb.delete(3,8);
		System.out.println(sb);
		sb.insert(2, 2333);
		System.out.println(sb);
		sb.replace(2, 6, "ahhhh");//[2,6)
		System.out.println(sb);
	}
}
