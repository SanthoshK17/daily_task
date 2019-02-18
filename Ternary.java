package pack;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter a number:");
		Scanner a= new Scanner(System.in);
		num=a.nextInt();
		System.out.println(num>0?"Number is positive integer":"Number is negative negative integer");
		a.close();
}
}