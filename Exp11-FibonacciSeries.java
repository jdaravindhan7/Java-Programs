import java.io.*;
class hero
{
	void input()throws Exception
	{
		int a=0,b=1,c=0,n,i;
		DataInputStream d=new DataInputStream(System.in);
		n=Integer.parseInt(d.readLine());
		for(i=0;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println("fibonocci series of"+n+" is "+c);
	}
}
public class Main {
	public static void main(String[] args)throws Exception {
		hero h=new hero();
		h.input();
		
	}
}
