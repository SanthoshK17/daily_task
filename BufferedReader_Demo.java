package pack;


import java.io.*;
public class BufferedReader_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			String statement=new String();
			System.out.println("Enter the text to be updated in the txt file");
			BufferedReader br = new BufferedReader(new
					InputStreamReader(System.in));
			statement=br.readLine();
			FileWriter fw = new FileWriter("C:\\Users\\santhoshkumar.sundar\\Downloads\\txtfile.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(statement);
            bw.flush();
            bw.close();
            br.close();
            System.out.println("Operation completed");
		}
		catch(Throwable e)
		{
			System.out.println("Error occurred");
			e.printStackTrace();
		}

	}

}
