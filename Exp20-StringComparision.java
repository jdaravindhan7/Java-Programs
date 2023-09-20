import java.io.*;
public class Main {
	public static void main(String[] args)throws Exception {
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("enter the strings");		String s=d.readLine();
		String v=d.readLine();
		if(s.equals(v))
		System.out.println("strings are equal");
		else
		System.out.println("strings are not equal");	
		System.out.println(s.equals(v));	
		System.out.println(s.compareTo(v));
	}
	
}
