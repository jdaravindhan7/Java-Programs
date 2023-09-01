import java.io.*;
class perro
{
 int i,n;
 void gem()throws Exception
 {
  System.out.println("enter the number");
  DataInputStream d=new DataInputStream(System.in);
  n=Integer.parseInt(d.readLine());
  if(n%2==0)
   System.out.println("it is a even number");
  else
   System.out.println("it is a odd number");
 }
}
class even
{
public static void main(String args[])throws Exception
{
perro g=new perro();
int i;
DataInputStream d=new DataInputStream(System.in);
do
{
 g.gem();
 System.out.println("do you want to continue 1:yes 2:no");
 i=Integer.parseInt(d.readLine());
}
while(i==1);
System.out.println("THANK YOU");
}
}
 
