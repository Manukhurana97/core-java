//constructor
class manu1
{
	manu1()
	{
		System.out.println(manu1.class);
	}
	manu1(String country)
	{
		System.out.println("i live in "+ country);
	}
	
	public static void main(String args[])
	{
		manu1 m = new manu1();
		System.out.println(m);
		System.out.println("india");		
	}
}
