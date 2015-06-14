package com.example.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMessage {
	
	String message="Hello world";
	
	MessageUtil obj= new MessageUtil(message);
	
	@Test
	public void testPrintMessage()
	{
		assertEquals("Hello worlds", obj.printMessage());
	}

}
