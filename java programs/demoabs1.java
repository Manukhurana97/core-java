//sub or child class
class demoabs1 extends demoabs
{
	void run()
	{
        System.out.println("Drive safely");
        System.out.println("Happy journey");
		
	}
	
    void vehicle()
	{
		System.out.println("he reaches mumbai on time");
	}
	public static void main(String args[])
	{
		demoabs1 b =new demoabs1();
		b.run();
		b.vehicle();
	}
}
	