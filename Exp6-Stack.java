import java.io.*;
class demon
{
int a[]=new int[10];
int n,top=0;
void input()
{
int i;
System.out.println("enter n");
DataInputStream d=new DataInputStream(System.in);
n=Integer.parseInt(d.readLine());
for(i=0;i<n;i++)
a[i]=Integer.parseInt(d.readLine());
}
void add()
{
if(top==4)
System.out.println("stack is full");
else
{
int v;
System.out.println("enter an number");
v=Integer.parseInt(d.readLine());
a[top++]=v;
}
}
void delete()
{
if(top==0)
System.out.println("stack is empty");
else
{
top--;
}
}
void display()
{
int i;
for(i=0;i<top;i++)
{

