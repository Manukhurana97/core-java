import javax.swing.*;
public class menu
{
  JFrame f;
  menu()
	{
		 f= new JFrame();
		
		JButton b=new JButton("click");
		b.setBounds(100,80,100,40);
		f.add(b);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	
	}
	  public static void main(String[] args)
	  {
	  new menu();
	  }
}