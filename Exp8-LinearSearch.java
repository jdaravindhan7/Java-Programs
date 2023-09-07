import java.io.*;
class bell
{
int a[]=new int[10];
int n,se,c;
void input()throws Exception
{
int i;
DataInputStream d=new DataInputStream(System.in);
System.out.println("enter n");
n=Integer.parseInt(d.readLine());
System.out.println("enter the search element");
se=Integer.parseInt(d.readLine());
System.out.println("enter the array");
for(i=0;i<n;i++)
a[i]=Integer.parseInt(d.readLine());
}
void logic()
{
int i;
for(i=0;i<n;i++)
{
if(a[i]==se)
{
c++;
break;
}
}
}
void display()
{
if(c!=0)
System.out.println("element found");
else
System.out.println("element not found");
}
}
class tree
{
public static void main(String args[])throws Exception
{
bell h=new bell();
h.input();
h.logic();
h.display();
}
}










