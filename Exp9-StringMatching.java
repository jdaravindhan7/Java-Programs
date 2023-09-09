import java.io.*;
import java.lang.*;
class dora
{
	String q,w;
	void input()throws Exception
	{
	DataInputStream d=new DataInputStream(System.in);
	System.out.println("enter the string and substring");
	q=(d.readLine());
	w=(d.readLine());
	}
	void logic()
	{
		int i,j,k,c=0;
		for(i=0;i<q.length();i++)
		{
			for(j=0,k=i;j<w.length()&&k<q.length();j++)
			{
				if(q.charAt(k)==w.charAt(j))
				{
					k++;
				}
				else
				break;
			}
			if(j==w.length())
			c=1;
		}
		if(c==1)
		System.out.println("string matching");
		else
		System.out.println("string not matching");
	}
}

public class Main {
	public static void main(String[] args)throws Exception{
		dora g=new dora();
		g.input();
		g.logic();
		
	}
}
