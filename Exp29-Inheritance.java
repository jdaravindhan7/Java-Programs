import java.io.*;
class horse{
	int a,b;
	horse(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void fer()
	{
		//System.out.println("alright");
	}
	void logic()
	{
		System.out.println("multiplication of two numbers: "+(a*b));
	}
}
class grow extends horse
{
	int c;
	grow(int a,int b,int c)
	{
		super(a,b);
		this.c=c;
	}
	void logic()
	{
		super.logic();
		fer();
		System.out.println("square of the number: "+(c*c));
	}
}
public class Main {
	public static void main(String[] args)throws Exception {
		grow h=new grow(3,47,69);
		h.logic();
		
	}
}
