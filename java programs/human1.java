//return type when the value is used by other
class human1
{
	
	String play(String game)
	{
		return("I play a "+ game);
	}
	
	void sing(String song)
	{
		System.out.println("I sing a "+ song);
	}
	
	public static void main(String agrs[])
	{
		human1 h = new human1();
		h.play("football"); 
		h.sing("bhajan");
		System.out.println();
		
		human1 h1=new human1();
		h1.play("cricket"); 
		h1.sing("rock song");
	}
}
