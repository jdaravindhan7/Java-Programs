import java.io.*;
class write
{
	static int b;
	write(int b)
	{
		this.b=b;
	}
	static int a;
	static int c;
	static void maz()throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("enter a and b");
		a=Integer.parseInt(d.readLine());
		c=a+b;
	}
	void output()
	{
		System.out.println(c);
	}
	}

public class Main {
	public static void main(String[] args)throws Exception{
		int b;
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("enter b");
		b=Integer.parseInt(d.readLine());
		write z=new write(b);
		write k=new write(b);
		k.maz();
		z.maz();
		k.output();
		z.output();
		
	}
