import java.io.*;
class rumbo
{
 int a[]=new int[5]; 
 int front,rear;
 rumbo()
 {
  front=0;
  rear=0;
 }
 DataInputStream d=new DataInputStream(System.in);
 void push()throws Exception
 {
  int s;
  if(rear==4)
   System.out.println("queue is full");
  else
  { 
   System.out.println("enter the element to add");
   s=Integer.parseInt(d.readLine());
   a[rear]=s;
   rear++;
   System.out.println(rear);
 }
}
void pop()
{
 if(front==rear)
  System.out.println("queue is empty");
 else
 {
  System.out.println("deleted element"+a[front]);
 front++;
 }
} 
void output()
{
if(front==rear)
 System.out.println("queue is empty");
else
{
 for(int i=front;i<rear;i++)
 {
  System.out.println(a[i]);
 }
} 
} 
}
class hero
{
 public static void main(String args[])throws Exception
 {
int h,ch;
  rumbo g=new rumbo();
  DataInputStream d=new DataInputStream(System.in);
  do
  {
    System.out.println("1:insert 2:pop 3:display");
    ch=Integer.parseInt(d.readLine());
    if(ch==1)
     g.push();
    else if(ch==2)
     g.pop();
    else if(ch==3)
     g.output();
    else
     System.out.println("your choice is not valid");
    System.out.println("do you want to continue 1:yes 2:no");
    h=Integer.parseInt(d.readLine());
   
  }
 while(h==1);
}
}
 
  
 
 
