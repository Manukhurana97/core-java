//thread
class multi extends demo5
{
	public void run()
	{
		Sysem.out.println("thread is running");
	}
	public static void main(String args[])
	{
		multi m= new multi();
	    m.start();
	}
}


	