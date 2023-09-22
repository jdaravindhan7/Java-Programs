import java.io.*;
public class Main {
	public static void main(String[] args)throws Exception {
		DataInputStream d=new DataInputStream(System.in);
		String ca=d.readLine();
		int c=0,i;
		for(i=0;i<ca.length();i++)
		{
			c++;
		}
		System.out.println("number of characters present: "+c);
		
	}
}
