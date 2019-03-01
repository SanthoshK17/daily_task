package pack;
import java.util.*;

public class Arraylist_dem {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s;
		int num=0,i=1,sum=0;
		int opt;
		ArrayList <Integer> Arr_list = new ArrayList<Integer>();
		
		do {
			System.out.println("Enter '1' to add a number in the list or '0' to exit: ");
			s=new Scanner(System.in);
			opt=s.nextInt();
			if(opt==1)
		{
		System.out.println("Enter number to be added in the list: ");
		s=new Scanner(System.in);
		num=s.nextInt();
		Arr_list.add(num);
		}
		else
		{
			System.out.println("Exiting the listing ");
			i=0;
		}
		}while(i!=0);
		s.close();
		
		Iterator<Integer> Itr = Arr_list.iterator();
		System.out.println("Displaying the numbers in the list");
		
		while(Itr.hasNext())
		System.out.println(Itr.next());
		
		
		
		
		for (Integer j: Arr_list) 
        { 
            sum=sum+j;
        } 
		System.out.println("Sum of the numbers in the list:" +sum);
       
    } 
		
		
	}

