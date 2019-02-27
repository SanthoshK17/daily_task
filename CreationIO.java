package pack;

import java.io.File;
import java.io.IOException;;

public class CreationIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			File file=new File("C:\\Users\\santhoshkumar.sundar\\Downloads\\txtfile.txt");
			 boolean fvar = file.createNewFile();
		     if (fvar){
		          System.out.println("File has been created successfully");
		     }
		     else{
		          System.out.println("File already present at the specified location");
		     }
	    	} catch (IOException e) {
	    		System.out.println("Exception Occurred:");
		        e.printStackTrace();
		  }

	}

}
