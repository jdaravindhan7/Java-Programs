import java.io.*;
public class Main {
	public static void main(String[] args)throws Exception {
		int i,j,n;
		DataInputStream d=new DataInputStream(System.in);
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
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
				a[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("matrix addition is");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("  ");
			}
			System.out.println("");
		}
		
		
	}
}
