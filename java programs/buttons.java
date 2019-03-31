import javax.swing.*;
class buttons
{
	public static void main(String args[])
	{
		JFrame f=new JFrame();
		JTextField t1,t2;
		
		t1=new JTextField("enter your name");
		t1.setBounds(100,100,150,20);//x,y,length,width
     	f.add(t1);
		
		t2=new JTextField("enter your name");	
		t2.setBounds(100,200,150,20);//x,y,length,width
      	f.add(t2);
		
		
		f.setSize(400,400);
		f.setLayout(null);
	    f.setVisible(true);
	}
}