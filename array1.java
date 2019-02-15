package pack;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]=new int[3][3];
		
		int arr2[][],opt;
		arr2=new int[3][3];
		
		int resarray[][]=new int[3][3];
		
		System.out.println("Choose operation 1.Addition 2.Subtraction");
		Scanner a= new Scanner(System.in);
		opt=a.nextInt();

		System.out.println("Entering values in the first array");
		
		Scanner b,c;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter the number in position " +i+"|"+j);
				b= new Scanner(System.in);
				arr1[i][j]=b.nextInt();
			}
		System.out.println("Entering values in the second array");
		
		
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter the number in position " +i+"|"+j);
				c= new Scanner(System.in);
				arr2[i][j]=c.nextInt();
			}	
		if(opt==1)
		{
			for(int i=0;i<3;i++)
				for(int j=0;j<3;j++)
				{
					resarray[i][j]=arr1[i][j]+arr2[i][j];
				}
		}
		
		if(opt==2)
		{
			for(int i=0;i<3;i++)
				for(int j=0;j<3;j++)
				{
					resarray[i][j]=arr1[i][j]-arr2[i][j];
				}
		}
		
		System.out.println("Printing the resultant array");
		
		for(int i=0;i<3;i++)
			{
			for(int j=0;j<3;j++)
			
			{
				System.out.print(resarray[i][j]+" ");
			}
			System.out.println("");
			}
		a.close();
	
	}

}
