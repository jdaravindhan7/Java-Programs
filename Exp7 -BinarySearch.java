import java.io.*;
class hero
{
int a[]=new int[10];
int n,se,c;
void input()throws Exception
{
int i=0;
DataInputStream d=new DataInputStream(System.in);
System.out.println("enter n");
n=Integer.parseInt(d.readLine());
System.out.println("enter search element");
se=Integer.parseInt(d.readLine());
System.out.println("enter the array");
for(i=0;i<n;i++)
a[i]=Integer.parseInt(d.readLine());
}
void logic()
{
int i;
int mid,start=0,end=n-1;
for(i=0;i<n;i++)
{
mid=(start+end)/2;
if(se>a[mid])
start=mid+1;
else if(se<a[mid])
end=mid-1;
else if(se==a[mid])
{
c++;
break;
}
}
}
void display()
{
if(c>0)
System.out.println("number found");
else
System.out.println("number not found");
}
}
class bin
{
public static void main(String args[])throws Exception
{
hero h=new hero();
h.input();
h.logic();
h.display();
}
}
