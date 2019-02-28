package pack;

import java.util.Arrays;
import java.util.List;

public class WidCard_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> List1=Arrays.asList(12,55,44,23);
		List<Double> List2=Arrays.asList(12.2 , 54.23 , 1.8 , 64.9 , 23.0);
		System.out.println("The sum of the first list is"+sum(List1));
		System.out.println("The sum of the second list is"+sum(List2));
		System.out.println("The sum of the both lists are"+(sum(List1)+sum(List2)));

	}

	private static double sum(List<? extends Number> list) {
		// TODO Auto-generated method stub
		 
		double sum = 0;
		for (Number i: list) 
	        { 
	            sum+=i.doubleValue(); 
	        } 
	  
	        return sum; 
	    } 
		
	}

