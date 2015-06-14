package com.example.tests1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestArithmetic {
	
	@Test
	public void testAdd()
	{
		ArithmeticClass obj= new ArithmeticClass(10, 20);
		assertEquals(30, obj.add());
	}
	
	@Test
	public void testSubtract()
	{
		ArithmeticClass obj= new ArithmeticClass(20,10);
		assertEquals(30, obj.subtract());
	}

}
