class Human
{
	String str;
	Human(String str)
	{
		this.str=str;
	}
	public String toString()
	{
		return str;
	}
	public static void main(String args[])//Command Line Argument
	{
		Human h = new Human("india");  
		
		System.out.println(h);
		 
		
	}	
}