package pack;

import java.util.Scanner;

public class adv_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[10];
		
		Scanner b=new Scanner(System.in);
		
		for(int num1=0;num1<10;num1++)
		{
				System.out.println("Enter a number:");
				b= new Scanner(System.in);
				arr[num1]=b.nextInt();
		}
		
			System.out.println("Printing the numbers in the array using for-each loop:");

			for(int num:arr)
			{
					System.out.println(arr[num]);
			}
			b.close();
	}

}
