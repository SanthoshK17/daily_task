package com;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ConcurrentHashMap map=new ConcurrentHashMap();
		
		try
		{
		map.put(101,"San");
		map.put(102,"Dam");
		map.put(103,"Ada");
		map.put(null,"mick");
		
		System.out.println(map);
		
		
		}
		catch(NullPointerException e)
		{
			System.out.println("Unlike regular hashmap, null is not allowed in ConcurrentHashMap");
		}
		
		
	}

}
