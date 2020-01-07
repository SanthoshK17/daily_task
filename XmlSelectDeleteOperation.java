package com.sample.xmlconversion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class XmlSelectDeleteOperation {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException
	{
	int option;
	Scanner s =new Scanner(System.in);
	String xmlStr = new Scanner( new File("d:/CustomerOrder.xml") ).useDelimiter("\\Z").next();
	String postalCode=null;
	
	
	System.out.println("1. Print entire xml document, 2. print orders of a postal code, 3.delete orders of a single postal code");
	option=s.nextInt();

	if(option==1)
	{
		 System.out.println(xmlStr);
	} 
	if(option==2)
	{
		System.out.println("Enter the postal code to be selected");
		postalCode=s.next();
		selectOrder(postalCode,xmlStr);
		
	}
	if(option==3)
	{
		System.out.println("Enter the postal code to be deleted");
		postalCode=s.next();
		xmlStr=deleteOrder(postalCode,xmlStr);
		System.out.println(xmlStr);
		
	}
	if(option>=4)
	{
		System.out.println("Invalid option");
	}
	
	}

	private static void selectOrder(String postalCode,String xmlStr) {
		int  fromIndex =0;
		do
		{
		int ordersTagIndex=xmlStr.indexOf("<Orders>");
		int searchIndex=xmlStr.indexOf(postalCode,ordersTagIndex);
		int orderStartIndex=xmlStr.lastIndexOf("<Order>",searchIndex);
		int orderEndIndex=xmlStr.indexOf("<Order>",searchIndex);
		
		System.out.println(xmlStr.substring(orderStartIndex,orderEndIndex));
		
        fromIndex++;
		}while((fromIndex = xmlStr.indexOf(postalCode, fromIndex)) != -1 );
	}
	
	private static String deleteOrder(String postalCode,String xmlStr) {
		int count =0, fromIndex =0,ordersTagIndex=0;
		do
		{
		ordersTagIndex=xmlStr.indexOf("<Orders>");
		int searchIndex=xmlStr.indexOf(postalCode,ordersTagIndex);
		int orderStartIndex=xmlStr.lastIndexOf("<Order>",searchIndex);
		int orderEndIndex=xmlStr.indexOf("<Order>",searchIndex);
		
		if(orderEndIndex==(-1))
		{	
			orderEndIndex=xmlStr.indexOf("</Order>",searchIndex);
		}
		String stringToBeDeleted=xmlStr.substring(orderStartIndex,orderEndIndex);
		xmlStr=xmlStr.replace(stringToBeDeleted, "");
		
		}while((xmlStr.indexOf(postalCode,ordersTagIndex )) != -1 );
		
		return xmlStr;
	}

}
