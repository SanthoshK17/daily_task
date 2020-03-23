package Excercise;
import java.util.*;

/*class Mgmt
{
	ArrayList <String> Team = new ArrayList<String>();
	Scanner sc= new Scanner(System.in);
	String Tname;
	int opt1;
	
	void SetTeam()
	{
		System.out.println("Select a option 1. add team member 2. exit");
		opt1=sc.nextInt();
		if(opt1==1)
		{ 
			System.out.println("Enter the name of the Team members:");
			Tname=sc.next();
			Team.add(Tname);
		}
		System.out.println("Exiting...");
	}

	
	
}*/
public class Management {

	public static <K,V> K getKey(Map<K,V> map,V value)
	{
		for(Map.Entry<K, V> entry:map.entrySet())
		{
			if(value.equals(entry.getValue()))
			{
				System.out.println(entry.getKey());
			}
		}return null;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Map<String,String> mTree=new HashMap<String,String>();
		Map<String,String> repto=new HashMap<String,String>();
		//Mgmt m1=new Mgmt();
		String name;
		String rep;
		int opt;
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("Please select one option 1.Add new employee 2.View Supervisor 3.View Team:");
			opt=s.nextInt();
			if(opt==1)
			{
		System.out.println("Please enter the name of the person:");
		name=s.next();
		System.out.println("Enter the name of the immediate supervisor:");
		rep=s.next();
		mTree.put(name,rep);
			}
		if(opt==2)
		{
			System.out.println("Please enter the name of the person:");
			name=s.next();
			String sups=mTree.get(name);
			System.out.println(name+" reports to "+sups);
		}
		if(opt==3)
		{
			System.out.println("Please enter the name of the Supervisor:");
			rep=s.next();
			System.out.println("The following are the members reporting to the given Supervisor");
			getKey(mTree,rep);
		}
		
	}while(opt<4);

}
}



	