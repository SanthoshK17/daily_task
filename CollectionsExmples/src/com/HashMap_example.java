package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> idAndName = new HashMap<String,String>(); 
		Iterator<Map.Entry<String, String>> iterator1 = idAndName.entrySet().iterator(); 
		
		idAndName.put("A100","Adam");
		idAndName.put("A101","Bryan");
		idAndName.put("A102","Chou");
		idAndName.put("A103","Dyroth");
		idAndName.put("A104","Elise");
		
		System.out.println("using advance for loop for iteration over Map.entrySet()"); 
        for (Map.Entry<String,String> entry : idAndName.entrySet())  
            System.out.println("ID = " + entry.getKey() + ", Name = " + entry.getValue());  
		
        System.out.println("forEach(action) method to iterate map ");
        idAndName.forEach((k,v) -> System.out.println("ID = "+ k + ", Name = " + v));
        
        System.out.println("Iterating through the map using iterators ");
        while(iterator1.hasNext()) 
        { 
             Map.Entry<String, String> entry = iterator1.next(); 
             System.out.println("ID = " + entry.getKey() +", Name = " + entry.getValue()); 
        } 
        
        System.out.println("Iterating the map using keyset() and vaues()");
        for(String id:idAndName.keySet())
        	System.out.println("ID = "+id);
        
        for(String name:idAndName.values())
        	System.out.println("Name = "+name);
        
        System.out.println("Looping over keys and searching for values");
        
        for (String name : idAndName.keySet())  
        { 
            // search  for value 
            String url = idAndName.get(name); 
            System.out.println("Key = " + name + ", Value = " + url); 
        } 
	}

}
