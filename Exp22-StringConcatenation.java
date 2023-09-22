import java.io.*;
public class Main {
	public static void main(String[] args)throws Exception {
		String s,v;
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("enter the strings");
		s=d.readLine();
		v=d.readLine();
		System.out.println("concatinated string is: "+s.concat(v));
		
	}
}
