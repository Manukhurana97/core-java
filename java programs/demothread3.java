class demothread3 extends Thread
{
	public void run()
	{
	    for(int i=0;i<10;i++)
		{			    
			System.out.println(Thread.currentThread().getId() + " value of i:" +i);		
		}	
		for(int j=10;j>=0;j--)
		{
			System.out.print("value of j "+Thread.currentThread().getPriority());
			System.out.println(" value " + j);
		}
	}
	public static void main(String args[])
	{
		demothread3 d = new demothread3();
	   
		d.start();
	}
}
