class demothread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{}
			System.out.println(i);
		}
		
	}
	public static void main(String args[])
	{
		demothread2 d = new demothread2();
		d.setPriority(Thread.MIN_PRIORITY); 
		d.start();
	}
	
}
