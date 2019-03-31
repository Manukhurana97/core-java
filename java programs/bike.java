abstract class bike extends vehicle
{
	abstract void speed(String b)//methord
	{
		System.out.println("the bike run at "+ b +"km/h");
	}
	public static void main(String args[])
	{
		vehicle v = new vehicle();
		bike b = new bike();
		b.speed("70");
		b.speed("90");
		
	}
}
