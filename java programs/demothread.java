class demothread extends Thread
{
	public void run()
	{
		for(int i=20;i>=1;i--)
		{
			
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{}
			
			finally
			{
			    System.out.println( Thread.currentThread().getId() +" value "+i);
		    }
		}
	}
	public static void main(String args[])
	{
		demothread d = new demothread();
		d.start();
		
		demothread d1 = new demothread();
		d1.start();
		
	}
}