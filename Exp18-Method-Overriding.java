import java.io.*;
class day
{
	void ad(int a,int b)
	{
		System.out.println("addition:  "+(a+b))
	}
}
class dream
{
	void ad(int a,int b)
	{
		System.out.println("multiplication:  "+(a*b));
	}
}


public class Main {
	public static void main(String[] args)throws Exception {
		int a,b;
		DataInputStream d=new DataInputStream(System.in);
		a=Integer.parseInt(d.readLine());
		b=Integer.parseInt(d.readLine());
		day g=new day();
		g.ad(a,b);
		dream h=new dream();
		h.ad(a,b);
	}
}
