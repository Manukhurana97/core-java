// example overriding
class sbi
{
	void interest(String rate)
	{
		System.out.println("The interest rate SBI is " + rate + "%  per year");
	}
	public static void main(String args[])
	{
		sbi s = new sbi();
		s.interest("8.25");
	}
}
