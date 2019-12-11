package com;

public class Static_Variable {
		
	int numID;
	String name = new String();
	String contact= new String();	
	
	static Customer Obj1= new Customer(122,"Drake","0987");
	Customer Obj2=new Customer(100,"Drake","0987");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static values before changing");
		System.out.println("ID="+Obj1.numID);
		System.out.println("ID="+Obj1.name);
		System.out.println("ID="+Obj1.contact);
		
		
		Obj1.Change();
		
		System.out.println("Values after changing");
		System.out.println("ID="+Obj1.numID);
		System.out.println("ID="+Obj1.name);
		System.out.println("ID="+Obj1.contact);
		
Obj1.Change1();
		
		System.out.println("Values after changing");
		System.out.println("ID="+Obj1.numID);
		System.out.println("ID="+Obj1.name);
		System.out.println("ID="+Obj1.contact);
		
	}
	

}
class Customer
{
	int numID;
	String name = new String();
	String contact= new String();	
	
	Customer(int a, String b, String c)
	{
		this.numID=a;
		this.name=b;
		this.contact=c;
	}

	public void Change1() {
		// TODO Auto-generated method stub
		numID=numID+1;
		name="Vicky";
		contact="31";
	}

	public void Change() {
		// TODO Auto-generated method stub
		numID=numID+1;
		name="Santy";
		contact="1234";
	}
}
