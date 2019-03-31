abstract class Television
 {
	 
	Television(){
		
		System.out.println("this is a television");
	}
	Television(String company){
		System.out.println("this is a "+company+" television");
	}	
	abstract  void screen();
	abstract void display();
	abstract void volume();
	void wifi()
	{
		System.out.println("Having wifi");
	}
	
	 
	
 }