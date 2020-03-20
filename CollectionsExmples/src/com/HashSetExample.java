package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int init=10;
	//Setting the initial count of the hashset to 10;
		HashSet<String> games=new HashSet<String>(init);
		
		games.add("Hockey");
		games.add("Cricket");
		games.add("Football");
		games.add("Baseball");
		games.add("Softball");
		games.add("Fencing");
		
		System.out.println("Iterating over hashSet:"); 
        Iterator<String> i = games.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
        
        Set<String> sortedGames=new TreeSet<>(games);
 
        System.out.println("Iterating over TreeSet:"); 
        Iterator<String> j = sortedGames.iterator(); 
        while (j.hasNext()) 
            System.out.println(j.next()); 
    } 
		

	}

