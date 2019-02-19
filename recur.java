package pack;

import java.util.Scanner;

public class recur {

	static int factorial(int a)
	{
		if(a==1)
			return 1;
		else
		return (a*factorial(a-1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		recur re=new recur();
		int x,z;
		System.out.println("Enter a number:");
		Scanner b= new Scanner(System.in);
		x=b.nextInt();
		
		z=re.factorial(x);
		System.out.println("Factorial of the given number is "+z);
		b.close();
		
	
	}

}
