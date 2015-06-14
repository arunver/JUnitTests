package com.example.tests1;

public class ArithmeticClass {
	
	private int x, y;
	
	public ArithmeticClass(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public int add()
	{
		System.out.println("sum is: "+(x+y));
		return x+y;
	}
	
	public int subtract()
	{
		System.out.println("difference is: "+(x-y));
		return (x-y);
	}
	
	

}
