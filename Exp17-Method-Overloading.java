import java.io.*;
class fire
{
	void ad()
	{
		System.out.println("default constructor");
	}
	void ad(int a,int b)
	{
		System.out.println("addition: "+(a+b));
	}
	void ad(int a,int b,int c)
	{
		System.out.println("multiplication:  "+(a*b*c));
	}
}


public class Main {
	public static void main(String[] args)throws Exception {
		int a,b,c;
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("enter inputs");
		a=Integer.parseInt(d.readLine());
		b=Integer.parseInt(d.readLine());
		c=Integer.parseInt(d.readLine());
		fire t=new fire();
		t.ad();
		t.ad(a,b);
		t.ad(a,b,c);
		
	}
}
