
class star3 
{
	public static void main(String args[])
	{
		int i,j,k,l,m,a=0;
		{
			for(i=0;i<=10;i++)
			{
				for(j=10;j>=i;j--)//first star pattern
				{
					System.out.print("*");
				}
								
				for(k=0;k<=a;k++)// for spacing
				{
				    System.out.print(" ");
				}
				
				for(l=10;l>=i;l--)//second star pattern
				{
					System.out.print("*");
				}
				
				System.out.println();
				a=a+2;
			}
			
			for(i=0;i<=10;i++)
			{
				for(j=0;j<=i;j++)//first star pattern
				{
					System.out.print("*");
				}
				
				for(k=2;k<=a;k++)// for spacing
				{
				    System.out.print(" ");
				}
				
				for(l=0;l<=i;l++)//second star pattern
				{
					System.out.print("*");
				}
				
				System.out.println();
				a=a-2;
			}
		}
	}
}