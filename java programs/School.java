class School
{
	public void getCity(String city)throws CityException
	{
		if(city.equals("delhi") || city.equals("noida"))
		{
			System.out.println("you are successfully regitered");
		}
		else
		{
			throw new CityException(city);
		}
	}
	public static void main(String arg[])
	{
		
		
		try{
			String city=arg[0];
		School s = new School();
		
			s.getCity(city);
		}
		catch(CityException c)
		{
			System.out.println(c);
		}
	}
}