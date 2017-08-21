package com.qisheng;

public class Test {
	
	
	int i = 10;
	
	public static int add(int x,int y) {
		
		return x + y;
		
	}
	


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}



	public int getI() {
		return i;
	}



	public void setI(int i) {
		this.i = i;
	}



	@Override
	public String toString() {
		return "Test [i=" + i + "]";
	}



	public static void main(String[] args) {
		
		add(4,2);
		
		System.out.println("hello world!");
		
	}

}
