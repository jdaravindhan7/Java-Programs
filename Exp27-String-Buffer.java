import java.lang.*;
import java.io.*;
public class Main {
	public static void main(String[] args)throws Exception {
		DataInputStream d=new DataInputStream(System.in);
		String s1=d.readLine();
		StringBuffer s=new StringBuffer(s1);
		s.append(" ortan");
		System.out.println(s);
		s.insert(0,'b');
		System.out.println(s);
		s.delete(5,6);
		System.out.println(s);
		s.ensureCapacity(10);
		System.out.println(s.capacity());
		
	}
}
