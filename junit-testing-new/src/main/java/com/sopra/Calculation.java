package com.sopra;

public class Calculation {
	
	public int sum(int num1, int num2) {
		return num1+num2;
	}
	
//	public int mult(int num1, int num2) {
//		return num1*num2;
//	}
//	
//	public int div(int num1, int num2) {
//		return num1/num2;
//	}
	
	public int divide(int x, int y) {
		if(x>=1000) {
			throw new IllegalArgumentException("X should be less than 1000");
		}
		return x/y;
	}

}
