import java.io.*;
public class Main {
	public static void main(String[] args)throws Exception {
		int i,j,n;
		DataInputStream d=new DataInputStream(System.in);
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		System.out.println("enter n");
		n=Integer.parseInt(d.readLine());
		for (i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=Integer.parseInt(d.readLine());
			}
		}
	    for (i=0;i<n;i++)
		 {
			for(j=0;j<n;j++)
			{
				b[i][j]=Integer.parseInt(d.readLine());
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("matrix multiplication is");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(c[i][j]);
				System.out.print("  ");
			}
			System.out.println("");
		}
		
		
	}
}
