package com.javalec.ex01;

public class MainClass {
	public static void main(String[] args) {
		Calculation calc = new Calculation();
		calc.setFirstNum(10);
		calc.setSecondNum(2);
		
		calc.add();
		calc.sub();
		calc.multi();
		calc.div();
	}
}
