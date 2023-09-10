import java.io.*;
public class Main {
	public static void main(String[] arg)throws Exception {
		int c=1,n,i;
		DataInputStream d=new DataInputStream(System.in);
		n=Integer.parseInt(d.readLine());
		for(i=1;i<=n;i++)
		c=c*i;
		System.out.println("factorial of "+n+" is "+c);
	}
}
