import javax.swing.*;
class menu1
{
	JFrame f;
	menu1()
	{
		f=new JFrame();
		
		
		JButton b = new JButton("click here");
		b.setBounds(50,100,95,30);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public static void main(String[] args)
	  {
	  new menu1();
	  }
}