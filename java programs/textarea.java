import javax.swing.*;
class textarea
{
	public static void main(String args[])
		{//text area
		JFrame f=new JFrame();
		JTextArea a=new JTextArea("text area with buttons");
		a.setBounds(100,400,200,300);
		f.add(a);
		f.setSize(300,300);
		f.setVisible(true);
		f.setLayout(null);
		
		
		//button
		JButton b=new JButton("click me");
		b.setBounds(400,400,100,30);//x,y,length -,width |
		f.add(b);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	
}