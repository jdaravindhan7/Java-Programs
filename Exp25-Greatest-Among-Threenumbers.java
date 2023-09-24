import java.io.*;
public class Main {
	public static void main(String[] args)throws Exception{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("enter three numbers");
		int a=Integer.parseInt(d.readLine());
		int b=Integer.parseInt(d.readLine());
		int c=Integer.parseInt(d.readLine());
		if((a>=b)&&(a>=c))
		System.out.println("a is greater");
		else if((b>=a)&&(b>=c))
		System.out.println("b is greater");
		else
		System.out.println("c is greater");
		
	}
}
