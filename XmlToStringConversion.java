package com.xmlexcercise;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class XmlToStringConversion {
static ListOfOrders listoforders=new ListOfOrders();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Order> OrderList=new ArrayList<Order>();
		
		Iterator<Order> iterator1 = OrderList.iterator();
		
		final List<String> tagValues1=null; 
		
		try
		{
			int option;
			File file = new File("d:/CustomerOrder.xml");
			
			System.out.println("Select an option 1. Print entire xml document, 2. print all orders, 3.print orders excluding a single city");
			Scanner s =new Scanner(System.in);
			option=s.nextInt();
			String xmlStr = null;
			String docname=null;
			String excludeCode=null;
			if(option==1)
			{	
			
			
			System.out.println("Please enter the name of the XML File");
			
			docname=s.next();
			
			xmlStr = new Scanner( new File("d:/"+docname+".xml") ).useDelimiter("\\Z").next();
			
			 System.out.println(xmlStr);
			}
			if(option==2)
			{
				System.out.println("Please enter the name of the XML File");
				
				docname=s.next();
				
				xmlStr = new Scanner( new File("d:/"+docname+".xml") ).useDelimiter("\\Z").next();
				
				System.out.println(Arrays.toString(getCustomerIDValues(xmlStr).toArray()));
				System.out.println();
				System.out.println(Arrays.toString(getShipPostalValues(xmlStr).toArray())); 
				System.out.println();
				//System.out.println(Arrays.toString(getShippedDateValues(xmlStr).toArray())); 		
			}
			if(option==3)
			{
				System.out.println("Please enter the name of the XML File");
				
				docname=s.next();
				xmlStr = new Scanner( new File("d:/"+docname+".xml") ).useDelimiter("\\Z").next();
				
				System.out.println("Enter thr postal code to excluded");
				excludeCode=s.next();
				ArrayList<String> CustIDs  = (ArrayList<String>) getCustomerIDValues(xmlStr);
				ArrayList<String> ShipCode =(ArrayList<String>) getShipPostalValues(xmlStr);
				
				Iterator<String> iterator2 = CustIDs.iterator();
				Iterator<String> iterator3 = ShipCode.iterator();
				
				while(iterator2.hasNext())
				{
				while(iterator3.hasNext())
				{
					if(iterator3.next().equals(excludeCode))
					{
						System.out.println("Code excluded");
					}
					else
					{
						
						String a=iterator2.next();
						String b=iterator3.next();
						Order order=new Order(a,b);
						
						OrderList.add(order);
						System.out.println("Object added");
					}
				}
				}
				
				
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		for (Order temp : OrderList) 
		{
			System.out.println("Customer ID :"+temp.CustomerID+" Ship Postal Code :"+temp.ShipPostalCode);
		}
		
	}
	private static final Pattern TAG_REGEX1 = Pattern.compile("<CustomerID>(.+?)</CustomerID>", Pattern.DOTALL);
	private static final Pattern TAG_REGEX = Pattern.compile("<ShipPostalCode>(.+?)</ShipPostalCode>", Pattern.DOTALL);
	//private static final Pattern TAG_REGEX2 = Pattern.compile("<ShippedDate>(\"^\\\\d{4}-\\\\d{2}-\\\\d{2}$\")</ShippedDate>", Pattern.DOTALL);
	
	private static List<String> getCustomerIDValues(String xmlStr) {
		// TODO Auto-generated method stub 
		 final List<String> tagValues1 = new ArrayList<String>();
		    final Matcher matcher = TAG_REGEX1.matcher(xmlStr);
		    
		    while (matcher.find()) {
		        tagValues1.add(matcher.group(1));
		    }
		
		return tagValues1;
	}
	
	private static List<String> getShipPostalValues(String xmlStr) {
		// TODO Auto-generated method stub 
		 final List<String> tagValues = new ArrayList<String>();
		    final Matcher matcher = TAG_REGEX.matcher(xmlStr);
		    
		    while (matcher.find()) {
		        tagValues.add(matcher.group(1));
		    }
		
		return tagValues;
	}
	
//	private static List<String> getShippedDateValues(String xmlStr) {
//		// TODO Auto-generated method stub 
//		
//		 final List<String> tagValues2 = new ArrayList<String>();
//		    final Matcher matcher = TAG_REGEX2.matcher(xmlStr);
//		    
//		    while (matcher.find()) {
//		        tagValues2.add(matcher.group());
//		    }
//		
//		return tagValues2;
//	}

	static class Order
	{
		private String CustomerID;
		private String ShipPostalCode;
		//private Date ShippedDate;
		
		public Order(String customerID, String shipPostalCode) {
			super();
			CustomerID = customerID;
			ShipPostalCode = shipPostalCode;
			//ShippedDate = shippedDate;
		}
		
		public String getCustomerID() {
			return CustomerID;
		}
		public void setCustomerID(String customerID) {
			CustomerID = customerID;
		}
		public String getShipPostalCode() {
			return ShipPostalCode;
		}
		public void setShipPostalCode(String shipPostalCode) {
			ShipPostalCode = shipPostalCode;
		}
//		public Date getShippedDate() {
//			return ShippedDate;
//		}
//		public void setShippedDate(Date shippedDate) {
//			ShippedDate = shippedDate;
//		}
				
		
	}
}
