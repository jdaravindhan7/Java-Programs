import java.io.*;
class demo
{
 int n;
 void input()throws Exception
 {
  DataInputStream d=new DataInputStream(System.in);
  System.out.println("enter n");
  n=Integer.parseInt(d.readLine());
 }
 void logic()
 {
  int c;
  for(int i=1;i<n;i++)
  {
    c=0;
   for(int j=2;j<i;j++)
   {
    if(i%j==0)
     c++;
   }
  if(i==1)
  System.out.println("1 is a prime");
  else if(c!=0)
   System.out.println(i+" is not a prime");
  else
   System.out.println(i+" is a prime");
 }
}
}
class veer
{
 public static void main(String args[])throws Exception
 {
  demo f=new demo();
  f.input();
  f.logic();
}
}

  


