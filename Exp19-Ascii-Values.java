import java.io.*;
public class Main {
	public static void main(String[] args)throws Exception {
		DataInputStream d=new DataInputStream(System.in);
	System.out.println("enter a string");
	String s=d.readLine();
	for(int i=0;i<s.length();i++)
	{
		int k=s.charAt(i);
		System.out.println("ascii value of "+(char) k+" is "+k);
	}
	}
