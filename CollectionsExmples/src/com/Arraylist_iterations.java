package com;


import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Arraylist_iterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("iterating a arraylist in multiple ways");
		
		CopyOnWriteArrayList <String> arr_list = new CopyOnWriteArrayList<String>();
		
		arr_list.add("10");
		arr_list.add("210"); 
		arr_list.add("100"); 
		arr_list.add("44"); 
		arr_list.add("64");
		Iterator<String> iterator1 = arr_list.iterator();
		arr_list.add("4");
		
		
		System.out.println("Modifying the list while iterating with for loop");
		for (int i = 0; i < arr_list.size(); i++) {
			System.out.println(arr_list.get(i));
			if(arr_list.get(i).equalsIgnoreCase("44")) {
                arr_list.set(i, "Not 44 anymore");
            }
		}
		System.out.println("Iteration with advance for loop");
		for (String temp : arr_list) {
			System.out.println(temp);
		}
		
		System.out.println("Iteration with foreach loop");
		arr_list.forEach((temp) -> {
			System.out.println(temp);
			
		});
		
System.out.println("Iterator has a seperate list thus 'Not 44 anymore' is not reflecting");
		
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
	          

			}

		
		}
		
	}


