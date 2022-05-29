package com.javalec.ex01;

public class Calculator {
	public void add(int first, int second) {
		System.out.println("add");
		int result = first + second;
		System.out.println(result);
	}
	public void sub(int first, int second) {
		System.out.println("sub");
		int result = first - second;
		System.out.println(result);
	}
	public void mul(int first, int second) {
		System.out.println("mul");
		int result = first * second;
		System.out.println(result);
	}
	public void div(int first, int second) {
		System.out.println("div");
		int result = first / second;
		System.out.println(result);
	}
}
