import java.io.*;
class gea
{
	int a,b,c;
	gea()
	{
		a=10;
		b=20;
	}
	gea(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	gea(gea z)
	{
		a=z.a;
		b=z.b;
	}
	void output()
	{
		System.out.println("output is");
		c=a+b;
		System.out.println(a+b);
	}
}
public class Main {
	public static void main(String[] args)throws Exception {
		int a,b;
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("enter the inputs");
		a=Integer.parseInt(d.readLine());
		b=Integer.parseInt(d.readLine());
		gea x=new gea();
		x.output();
		gea y=new gea(a,b);
		y.output();
		gea z=new gea(y);
		z.output();
		
		
	}
}
