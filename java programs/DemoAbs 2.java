abstract class DemoAbs
{
	DemoAbs()
	{
		System.out.println("Abstract class");
	}
	abstract void area();
	abstract void volume();
	static void add()
	{
		int a=33,b=44,c;
		c=a+b;
		System.out.println("Sum : "+c);
	}
	public static void main(String arg[])
	{
		add();
	}
}