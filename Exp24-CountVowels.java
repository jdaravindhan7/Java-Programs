import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args)throws Exception {
		DataInputStream d=new DataInputStream(System.in);
		String v=d.readLine();
		int c=0,co=0,i;
		for(i=0;i<v.length();i++)
		{
			if(v.charAt(i)=='a'||v.charAt(i)=='e'||v.charAt(i)=='i'||v.charAt(i)=='o'||v.charAt(i)=='u')
			c++;
			else
			co++;
		}
		System.out.println("number of vowels present is: "+c);
		System.out.println("number of consonents present is: "+co);
		
	}
}
