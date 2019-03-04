package pack;


import java.util.*;
import java.util.Map.Entry;

class Details
{
	Scanner a=new Scanner(System.in);
	String nme,addr;
	int m1;
	Vector<String> name=new Vector<String>();
	Vector<Integer> marks=new Vector<Integer>();
	Vector<String> address=new Vector<String>();
	
	Details set_Value()
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
public class Vector_HashMap {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Details> rno=new HashMap<Integer,Details>();
		Details d1=new Details();
		Scanner s=new Scanner(System.in);;
		int roll,opt,key;
		
		do
		{
		System.out.println("Select a option 1.Add Student deatils, 2. Show deatils for:, 3.Show all, 4.Exit");
		s=new Scanner(System.in);
		opt=s.nextInt();
		
		if(opt==1)
		{
		System.out.println("Enter the Registration Number of the student: ");
		s=new Scanner(System.in);
		roll=s.nextInt();
		System.out.println("Entering the details of the student");
		rno.put(roll, d1.set_Value());
		System.out.println(" The Name of the student is "+d1.nme);
		
		}
		
		if(opt==2)
		{
			System.out.println("Enter the Registration Number of the student: ");
			s=new Scanner(System.in);
			key=s.nextInt();
			System.out.println("Fetching the details of the student: ");
			System.out.println("Name of the student is : "+Map.entry(key,d1.name));
			System.out.println("Name of the student is : "+Map.entry(key,d1.marks));
			System.out.println("Name of the student is : "+Map.entry(key,d1.address));
		}
		
		if(opt==3)
		{
			System.out.println("Showing the details of all students");
			for(Entry<Integer, Details> mp : rno.entrySet())
			{
				System.out.println("Name of the student is : "+Map.entry(mp,d1.name));
				System.out.println("Name of the student is : "+Map.entry(mp,d1.marks));
				System.out.println("Name of the student is : "+Map.entry(mp,d1.address));
			}
		}
		}while(opt<4);
		System.out.println("Exiting the Map");		
		System.exit(0);
		}

}