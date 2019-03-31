//inheritance (IS-a relation)
class television
{
	
	void a(String company)
	{
		System.out.println("This is a "+ company +" company ");
	}
	
	void type(String category)
	{
		System.out.println("This is "+ category +" tv");
	}
	
	void display(String size)
	{
		System.out.println("This is "+ size+"inches");
		}
	void cost(String rate)
	{
		System.out.println("This is of " +rate);
	}
	
		public static void main(String args[])
	{
		television t = new television();
	    t.type("Black and white");
		t.display("40");
		t.a("samsung");
		t.cost("Rs 20000");
		System.out.println();
	    television t1 = new television();
	    t1.type("Black and white");
		t1.display("42");
		t1.a("sony");
		t1.cost("Rs 18500");
	
	}
}