package pack;

import java.util.Scanner;

public class Using_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range,i;
		
		System.out.println("Enter the a number to find it's factors");
		
		Scanner b= new Scanner(System.in);
		range=b.nextInt();
		
		System.out.println("Finding factors");
		
		for(i=1;i<=range;i++)
		{
			if(i==1) // 1 is a factor of all numbers
				continue;
			if(i==range)  // using continue to stop printing the actual number itself
				continue;
			if(range%i==0)
				System.out.println(i);
			
		}

	b.close();	
	}

}
