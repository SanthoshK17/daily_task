package pack;


import java.io.*;

public class UpdationIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			FileWriter fw = new FileWriter("C:\\Users\\santhoshkumar.sundar\\Downloads\\txtfile.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Lets hope this is present in the file");
            bw.flush();
            bw.close();
		}
		catch(Throwable e)
		{
			System.out.println("Error occurred");
			e.printStackTrace();
		}
		
	}

}
