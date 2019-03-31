//ovverriding hwen child class and parent class have same methord
 class vehicle
{
	 void speed(String a)//methord
	{
		System.out.println("vehicle run at " + a + "km/h");
	}
	public static void main(String args[])
	{
		vehicle v = new vehicle();
		v.speed("56");
	}

}