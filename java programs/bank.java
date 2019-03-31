class bank extends icici
{
	void getinterestrate()
	{
		System.out.println("interest rate of leading banks are given as follow");

	}
	public static void main(String args[])
	{
		bank b = new bank();
        b.getinterestrate();
		
		sbi s = new sbi();
		s.interest("8.25");
		
		
		icici i = new icici();
		i.interest("8.35");
	}
}
	