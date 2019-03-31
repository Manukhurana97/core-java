//aggregation (Has-a relation) 
class television2 extends television
{
	void usb()
	{ 
	    System.out.println("This has 2 USB ports");
	}
	void hdmi()
	{
		System.out.println("This ha a hdmi port");
	}
	void mode(String type)
	{
		System.out.println("This has "+type);
	}
	public static void main(String args[])
	{
		television2 r = new television2();
		r.a("apple");
	    r.type("led");
		r.display(" 72 ");
		r.cost("120000");
		r.usb();
		r.hdmi();
		r.mode("fully automatic");
	}

	
 }
 

