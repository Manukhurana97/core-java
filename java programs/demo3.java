//Exception handling
class demo3
{
	public static void main(String args[])
	{
		int age=10;
		if(age<=18)
			throw new NullPointerException("not valid");//throw keyword
		else
		{
			System.out.println("valid for vote");
		}
		
	}
}