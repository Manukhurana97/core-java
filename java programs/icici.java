class icici extends sbi
{
	void interest(String rate)
	{
		System.out.println("The interest rate sbi is " + rate+"% per year");
	}
	public static void main(String args[])
	{
		icici i = new icici();
		i.interest("8.35");
	}
}