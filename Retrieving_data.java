package pack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;


public class Retrieving_data {

	int option=0,a=0;
	@SuppressWarnings("resource")
	void Get_data(ArrayList<Integer> arr1)
	{
		System.out.println("Select a option");
		System.out.println("1. For-each");
		System.out.println("2. Iterartor");
		System.out.println("3. Cursor");
		System.out.println("4. List Iterator");
		Scanner k=new Scanner(System.in);
		option=k.nextInt();
		
		
		switch(option)
		{
		case(1):
		{
			for(int a: arr1) 
			{
				System.out.println(a);
			}
			System.exit(0);
		}
		case(2):
		{
			Iterator<Integer> it=arr1.iterator();
			 while (it.hasNext()) 
		            System.out.println(it.next()); 
			 System.exit(0);
		}
		case(3):
		{
			arr1.forEach (e -> System.out.println(e) );
			System.exit(0);
		}
		case(4):
		{
			Scanner j;
			int backforth;
			ListIterator<Integer> lit = arr1.listIterator();
			System.out.println("ListItertor supports traversing through both directions");
			System.out.println("Select a direction to fetch data 1. Forward 2. backward");
			j=new Scanner (System.in);
			backforth=j.nextInt();
			if(backforth==1)
			{
				System.out.println("In Forward direction:");
				while (lit.hasNext()) 
			    System.out.print(lit.next()+" ");
			}
			if(backforth==2)
			{
				System.out.println("In Backward direction:");
				while (lit.hasPrevious()) 
		        System.out.print(lit.previous()+" "); 
			}System.exit(0);
		}
		}
		
		}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Retrieving_data obj=new Retrieving_data();
			ArrayList<Integer> arr= new ArrayList<Integer>();
		int opt=0,num=0;
		Scanner s;
		
		do
		{
		System.out.println("Select a option 1. add element in the list 2. Fetch data menu 3. Exit");
		s=new Scanner(System.in);
		opt=s.nextInt();
		if(opt==1)
		{
			System.out.println("Enter the number to be added in the list:");
			s=new Scanner(System.in);
			num=s.nextInt();
			arr.add(num);
		}
		if(opt==2)
		{
			obj.Get_data(arr);
		}
		
		}while(opt<3);
	}
}

