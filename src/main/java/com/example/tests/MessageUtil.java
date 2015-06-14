package com.example.tests;

public class MessageUtil {
	private String message;
	
	public MessageUtil()
	{
		
	}
	
	public MessageUtil(String message)
	{
		this.message=message;
	}
	
	public String printMessage()
	{
		System.out.println(message);
		return message;
	}

}
