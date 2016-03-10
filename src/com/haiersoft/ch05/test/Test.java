package com.haiersoft.ch05.test;

public class Test {

	public static int X;
	static {
		X = 300;
		System.out.println(X + "1");
		X = 200;
		System.out.println(X + "2");
	}

	public static void main(String args[]) {
		System.out.println(Test.X);
	}
	/*
	 * public static int X = 100; public final static int Y = 200;
	 * 
	 * public Test() { System.out.println("Test构造函数执行"); }
	 * 
	 * static { System.out.println("static语句块执行"); }
	 * 
	 * public static void display() { System.out.println("静态方法被执行"); }
	 * 
	 * public void display_1() { System.out.println("实例方法被执行"); }
	 * 
	 * public static void main(String args[]) { try {
	 * Class.forName("com.haiersoft.ch05.test.Test");
	 * Class.forName("com.haiersoft.ch05.test.Test"); } catch
	 * (ClassNotFoundException e) { e.printStackTrace(); }
	 * 
	 * }
	 */

}
