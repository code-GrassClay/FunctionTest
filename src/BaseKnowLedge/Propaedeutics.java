package BaseKnowLedge;

public class Propaedeutics {
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}

	public static void test3() {
		// TODO Auto-generated method stub
		
	}

	public static void test2() {
		/*
		 * 标识符：标识符用于给包、类、方法及变量命名
		 * 标识符命名遵循以下规则：
		 * 	1、由数字、字母、下划线_、美元符$组成
		 * 	2、不能由数字开头
		 * 	3、不能是关键字
		 * 标识符的特性是：大小写敏感（大写Hello，跟小写hello是不同的两个标识符）
		 * 
		 */
		//字母开头
		int ab2c_$ = 0;
		int Ab2c_$ = 1;
		//下划线开头
		int _ab12 = 2;
		//$开头
		int $a1 = 5;
		//数字开头
		// int 2ac = 3; //编译报错
	}

	public static void test1() {
		System.out.println("测试注释");
		//注释
		//这是单行注释
		/*这是多行注释
		 * 第二行
		 后面这家伙是多行注释的结尾*/
		/**
		 * 
		 * @author codejie
		 * 这是文档注释，点星星开头，点星结尾
		 * 注释中包含一些说明性的文字及一些JavaDoc标签
		 * 后期写项目时，可以生成项目的API
		 * 
		 */
	}
	
}
