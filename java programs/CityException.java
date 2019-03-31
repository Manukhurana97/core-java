class CityException extends Exception
{
	String city;
	CityException(String city)
	{
		this .city=city;
	}
	public String toString()
	{
		return "java.CityException: plz enter delhi or NCR Student's and its: "+city;
	}
}