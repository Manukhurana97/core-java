import java.io.*;
class DemoInput
{
	FileInputStream filein;	
	FileOutputStream fileout;	
	void asdf()
	{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		try
		{
			System.out.println("Enter the file name to read ");
			filein= new FileInputStream(br.readLine());
			System.out.println("Enter the file name to write ");
			fileout= new FileOutputStream(br.readLine());
			int i;
			do
			{
				i=filein.read();
				if(i==-1)
				break;
				fileout.write(i);
			}while(i!=-1);
		}
		catch(FileNotFoundException f)
		{
			System.out.print(f);
		}
		finally
		{
			filein.close();
			fileout.close();
		}
	}		
	public static void main(String args[])throws IOException
	{
		new DemoInput().asdf();
	}	
}