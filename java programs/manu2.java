//variable
class manu2 
{
	int a=10;
	static int b=20;
	
	manu2()
	{//loacl variable
		int a=15,b=22,c;
		c=this.a+this.b;
		System.out.println(c);
		c=a+b;
		System.out.println(c);
	}
	
	public static void main(String args[])
	{
		manu2 m = new manu2();
		System.out.println(m.a);
	    System.out.println(b);//reference is not given in static variable
		System.out.println();
		manu2 m1 = new manu2();
		System.out.println(m.a);
		System.out.println(b);//reference is not given in static variable
	    System.out.println();
	}
}
		
			
		
	