package com.sidhesh;

public class Calculator {

	private int a;
	private int b;
	private int result;

	public Calculator(int a,int b){
		System.out.println( "Hello this was printed from Sidhesh's Jar" );
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + "]";
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int a,int b){
		return a-b;
	}
	
	public int multiply(int a,int b){
		return a*b;
	}

	public int divide(int a,int b){
		return a/b;
	}
}

