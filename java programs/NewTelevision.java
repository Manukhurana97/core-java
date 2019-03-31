class NewTelevision extends Television
{
	final int a;
	NewTelevision(){
		
		super("sony"); 
		a=33;
		System.out.println("this is a portable television");
	}
	NewTelevision(int size){
		super();
		a=43;
		System.out.println("this is a "+size+" inches television");
	}
	void USB()
	{
		System.out.println("having USB slot");
	}
	 void display()
	 {
		 System.out.println("having colorful display");
	 }
	 void screen()
	 {
		 System.out.println("having LED screen");
	 }
	static  
	{
		System.out.println("this is another static block");
	}
	void volume()
	{
		
		System.out.println("Having volume with remote");
		 
	}
	public static void main(String arg[])
	{
		Television n = new NewTelevision();
		NewTelevision n1 = new NewTelevision(14);
		SetTopBox st = new SetTopBox();
		SetTopBox s1t = new SetTopBox("Tata Sky");
		st.sd();st.hd();
		n.volume();n1.USB();n1.wifi();
	}
	
 }