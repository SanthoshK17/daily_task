package pack;

import java.util.Scanner;

public class using_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,i=0;
		System.out.println("Enter a number:");
		Scanner b= new Scanner(System.in);
		num1=b.nextInt();
		
		System.out.println("Enter a number:");
		Scanner c= new Scanner(System.in);
		num2=c.nextInt();
		
		System.out.println("Loop set for 5 times, if required break using the 'exit' option");
		
		while(i<5)
		{
			int opt,res;
			System.out.println("Enter a option: 1.add 2.subtract 3.multiply 4.exit");
			System.out.println("Enter a number:");
			b= new Scanner(System.in);
			opt=b.nextInt();
			
			if(opt==1)
			{
				res=num1+num2;
				System.out.println("Sum of the two numbers is "+res);
			}
			if(opt==2)
			{
				res=num1-num2;
				System.out.println("Difference between the two numbers is "+res);
			}
			if(opt==3)
			{
				res=num1*num2;
				System.out.println("product of the two numbers is "+res);
			}
			if(opt==4)
				break;
			
		}
		System.out.println("Exiting loop");
		b.close();c.close();	
	}

}
