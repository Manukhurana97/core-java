package pack.abc;
public class Parent
{
	public Parent()
	{
		System.out.println("parent class");
	}
	private  void show()
	{
		System.out.println("this is a private method");
	}
	void show1()
	{
		show();
		System.out.println("this is a default method");
	}
	protected  void show2()
	{
		System.out.println("this is a protected method");
	}
	public void show3()
	{
		System.out.println("this is a public method");
	}
	public static void main(String arg[])
	{
		Parent p = new Parent();
		p.show();p.show1();p.show2();p.show3();
	}
}