import java.io.*;
class dream
{
 int a[]=new int[10];
 int n;
 void input()throws Exception
 {
  DataInputStream d=new DataInputStream(System.in);
  System.out.println("enter n");
  n=Integer.parseInt(d.readLine());
  for(int i=0;i<n;i++)
   a[i]=Integer.parseInt(d.readLine());
 }
 void logic()
 {
  int i,j,min,c;
  for(i=0;i<n;i++)
  {
   min=i;
   for(j=i+1;j<n;j++)
   {
    if(a[min]>a[j])
     min=j;
   }
   if(min!=j)
   {
    c=a[i];
    a[i]=a[min];
    a[min]=c;
  }
 }
}
void output()
{ 
 System.out.println("sorted array");
 for(int i=0;i<n;i++)
 System.out.println(a[i]);
}
}
class dell
{
 public static void main(String args[])throws Exception
 {
  dream f=new dream();
  f.input();
  f.logic();
  f.output();
 }
} 
