package pack;


import java.util.*;
import java.util.Map.Entry;



public class Hashmap_classes {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Details_1> rno=new HashMap<Integer,Details_1>();
		Details_1 d_1=new Details_1();
		Details_2 d_2=new Details_2();
		Scanner s=new Scanner(System.in);
		int roll,opt,key;
		
		do
		{
		System.out.println("Select a option 1.Add Student deatils, 2. Show deatils for:, 3.Show all, 4.Enter detail in the second class 5.Exit");
		s=new Scanner(System.in);
		opt=s.nextInt();
		
		if(opt==1)
		{
		System.out.println("Enter the Registration Number of the student: ");
		s=new Scanner(System.in);
		roll=s.nextInt();
		System.out.println("Entering the details of the student");
		rno.put(roll, d_1.set_Value());
		System.out.println(" The Name of the student is "+d_1.nme);
		
		}
		
		if(opt==2)
		{
			System.out.println("Enter the Registration Number of the student: ");
			s=new Scanner(System.in);
			key=s.nextInt();
			System.out.println("Fetching the details of the student: ");
			System.out.println("Name of the student is : "+Map.entry(key,d_1.name));
			System.out.println("Name of the student is : "+Map.entry(key,d_1.marks));
			System.out.println("Name of the student is : "+Map.entry(key,d_1.address));
		}
		
		if(opt==3)
		{
			System.out.println("Showing the details of all students");
			for(Entry<Integer, Details_1> mp : rno.entrySet())
			{
				System.out.println("Name of the student is : "+Map.entry(mp,d_1.name));
				System.out.println("Name of the student is : "+Map.entry(mp,d_1.marks));
				System.out.println("Name of the student is : "+Map.entry(mp,d_1.address));
			}
		}
		if(opt==4)
		{
			System.out.println("Entering details in the second class");
			d_2.set_Value();
		}
		}while(opt<5);
		System.out.println("Exiting the Map");		
		System.exit(0);
		}

	}

class Details_1
{
	Scanner a=new Scanner(System.in);
	String nme,addr;
	int m1;
	ArrayList <String> name=new ArrayList<String>();
	ArrayList<Integer> marks=new ArrayList<Integer>();
	ArrayList<String> address=new ArrayList<String>();
	
	Details_1 set_Value()
	{
		System.out.println("Enter the Name of the student: ");
		a=new Scanner(System.in);
		nme=a.next();
		name.add(nme);
		
		System.out.println("Enter the marks of the student: ");
		a=new Scanner(System.in);
		m1=a.nextInt();
		marks.add(m1);
		
		System.out.println("Enter the student address: ");
		a=new Scanner(System.in);
		addr=a.next();
		address.add(addr);
		
		System.out.println("Student details added");
		return null;
		
	}
}
class Details_2
{
	Scanner a=new Scanner(System.in);
	String nme,addr;
	int m1;
	ArrayList <String> name=new ArrayList<String>();
	ArrayList<Integer> marks=new ArrayList<Integer>();
	ArrayList<String> address=new ArrayList<String>();
	
	Details_2 set_Value()
	{
		System.out.println("Enter the Name of the student: ");
		a=new Scanner(System.in);
		nme=a.next();
		name.add(nme);
		
		System.out.println("Enter the marks of the student: ");
		a=new Scanner(System.in);
		m1=a.nextInt();
		marks.add(m1);
		
		System.out.println("Enter the student address: ");
		a=new Scanner(System.in);
		addr=a.next();
		address.add(addr);
		
		System.out.println("Student details added");
		return null;
		
	}
}
