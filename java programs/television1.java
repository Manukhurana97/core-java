class television1 extends television
{
	
		public static void main(String args[])
	{
		television t = new television();
	    t.type("lcd");
		t.display("52");
		t.a("bravia");
		t.cost("Rs 42000");
		
		System.out.println();
	    
		television t1 = new television();
	    t1.type("led");
		t1.display("46");
		t1.a("apple");
		t1.cost("48000");
	
	}
}

		