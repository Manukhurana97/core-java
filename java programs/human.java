class human
{
	human()
	{
		System.out.println(human.class);
	}
	void play(String game)
	{
		System.out.println("I play a "+ game);
	}
	
	void sing(String song)
	{
		System.out.println("I sing a "+ song);
	}
	
	public static void main(String agrs[])
	{
		human h = new human();
		h.play("football"); 
		h.sing("bhajan");
		System.out.println();
		
		human h1=new human();
		h1.play("cricket"); 
		h1.sing("rock song");
	}
}
