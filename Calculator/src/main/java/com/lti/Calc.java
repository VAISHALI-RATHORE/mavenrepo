package com.lti;

public class Calc {
	
	public static int add(int num1,int num2) {
	return num1+num2;
	}
	public static int subs(int num1,int num2) {
	return num1-num2;
	}
	public static int prod(int num1,int num2) {
		return num1*num2;
		}
	public static int div(int num1,int num2) {
		return num1/num2;
		}
	public static void main(String args[]) {
		System.out.println("addition  "+ add(10,20));
		System.out.println("product  "+ prod(70,20));
		System.out.println("substraction  "+ subs(70,20));
		System.out.println("division  "+ div(70,20));
	}

}
