package Excercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class emp
{
	Set<String> EName = new HashSet<String>();
	List <String> Desgn=new ArrayList<String>();
	List <String> Repto=new ArrayList<String>();
	Scanner s=new Scanner(System.in);
	String temp;
	Iterator<String> Itr=EName.iterator();
	
	void new_emp()
	{
		System.out.println("Enter the name of the employee:");
		temp=s.next();
		EName.add(temp);
		
		System.out.println("Enter the Designation of the employee:");
		temp=s.next();
		Desgn.add(temp);
		
		System.out.println("Enter the immediate supervisor of the employee:");
		temp=s.next();
		Repto.add(temp);
	}
	
	void get_empdetails()
	{ 
		System.out.println("Enter the name of the employee:");
		temp=s.next();
		while(Itr.hasNext())
		{
			if(Itr.next()==temp)
			{
				
			}
		}
		
		
	}
	
}

public class Mgmt_set_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}

}
