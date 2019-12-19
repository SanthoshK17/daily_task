package com;

import java.util.Scanner;

public class ThrowsAndThrowExample {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Throwable
	{
		System.out.println("To throw a error using throw");
		
		int id;
		String name;
		String contact=new String();
		int contactLength;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the ID number(do not exceed 100):");
		id=s.nextInt();
		if(id>100)
		{
			throw new Exception("ID exceeds the limit of 100");
		}
		
		try {
			System.out.println("Enter the name of the student:");
			name=s.next();
			System.out.println("Enter contact details(Character limit 10):");
			contact=s.next();
			contactLength=contact.length();
			if(contactLength>10)
			{
				throw new Exception("Contact length exceeded");
			}
			System.out.println("ID: "+id+"Name: "+name+"Contact: "+contact);
		}
		catch(Exception e)
		{
			System.out.println("Invalid Data given");
			throw e;
		} 
		finally
		{
			s.close();
		}
		
	}
	
	
	

}
