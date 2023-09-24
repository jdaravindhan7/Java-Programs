import java.io.*;
public class Main {
	public static void main(String[] args)throws Exception {
		DataInputStream d=new DataInputStream(System.in);
		int g=0;
		int h=Integer.parseInt(d.readLine());
		while(h!=0)
		{
			int b=h%10;
			g= g*10+b;
			h=h/10;
		}
	
		System.out.println("reverse: "+g);
		
	}
