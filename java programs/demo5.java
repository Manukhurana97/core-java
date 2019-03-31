//throw
import java.io.*;
class demo4
{
	void m()throws ArithmeticException 
	{
		int z=10/0;
	}
}	
public class demo5
{
	public static void main(String args[])
	{
	try
	{
		demo4 a = new demo4();
		a.m();
	}
	catch(Exception e)
	{
		System.out.println("exception handled");
	}
	System.out.println("normal flow");
	}
	
}


	  