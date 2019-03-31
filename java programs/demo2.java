// exception handling
class demo2
{
	public static void main(String args[])
	{
		 try //(Nested try)
		{	
		    try
			{
		        int i=30/0;			
			}	
		    catch(ArithmeticException e)//Multiple catch block	
		    {	
                System.out.println(" First catch 1 try is executed");	
		    }
		    catch(ArrayIndexOutOfBoundsException e)	//Multiple catch block	
	     	{	
	            System.out.println("second catch executed");	
	    	}
			catch(NullPointerException e)	//Multiple catch block	
		    {	
	            System.out.println(" third catch executed");	
		    }
   	
		    try
		    {
			    int a=10%0;
		    }
		    catch(ArithmeticException e)	//Multiple catch block	
		    {	
	            System.out.println(" first catch 2 try is executed");	
		    }
			catch(ArrayIndexOutOfBoundsException e)	//Multiple catch block	
	     	{	
	            System.out.println("second catch executed");	
	    	}
			catch(NullPointerException e)	//Multiple catch block	
		    {	
	            System.out.println(" third catch executed");	
		    }
		}
		catch(Exception e)	//commom catch block
		{	
	        System.out.println(" comman catch executed");	
        }
		
		finally // Final always executed in any condition
		{
			System.out.println(" final block is executed");
		}	}
}