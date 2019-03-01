package pack;

import java.io.*;
import java.util.Scanner;

public class LinkedList_demo {

	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	public static void printList(LinkedList_demo list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
         
        while (currNode != null) { 
             
            System.out.print(currNode.data + " "); 
   
             
            currNode = currNode.next; 
        } 
    } 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s;
		int num=0,i=1,sum=0;
		int opt;
		
		LinkedList_demo list1 = new LinkedList_demo();
		
		do {
			System.out.println("Enter '1' to add a number in the list or '0' to exit: ");
			s=new Scanner(System.in);
			opt=s.nextInt();
			if(opt==1)
		{
		System.out.println("Enter number to be added in the list: ");
		s=new Scanner(System.in);
		num=s.nextInt();
		list1 = insert1(list1,num);
		}
		else
		{
			System.out.println("Exiting the listing ");
			i=0;
		}
		}while(i!=0);
		s.close();
		

	}



	private static LinkedList_demo insert1(LinkedList_demo list, int data) {
		// TODO Auto-generated method stub
		Node new_node = new Node(data); 
        new_node.next = null; 
		
        if (list.head == null) { 
            list.head = new_node; 
        }
        
        else
        {
        	  Node last = list.head; 
        while (last.next != null)
              { 
                  last = last.next; 
        }
        last.next = new_node;
        }
		return list;	
	}
		
		
		
	}


	

}
