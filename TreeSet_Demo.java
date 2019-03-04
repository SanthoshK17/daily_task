package pack;
import java.util.*;

public class TreeSet_Demo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> tree= new TreeSet<Integer>();
		Scanner s;
		int num,opt=0;
		
		
		do
		{
			System.out.println("Select a option  1.add number in the set, 2. sort and print, 3.exit:");
			s=new Scanner(System.in);
			opt=s.nextInt();
			if(opt==1)
			{		
			System.out.println("Enter the number to added in the TreeSet:");
			s=new Scanner(System.in);
			num=s.nextInt();
			tree.add(num);
			}
			if(opt==2)
			{		
			System.out.println("Number in the TreeSet are: "+tree);
			}
			if(opt==3)
			{
				System.exit(0);
			}
			
		}while(opt<4);
	}

}
