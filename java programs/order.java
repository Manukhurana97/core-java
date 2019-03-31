import javax.swing.*;
import java .awt.event.*;
class order
{
	JLabel l;
	JRadioButton r1,r2,r3;
	JButton b;
	
	order()
	{
		l=new JLabel("Menu");
		l.setBounds(50,10,100,30);
		
		r1=new JRadioButton("country special");
		r1.setBounds(20,40,100,20);
		r1=new JRadioButton("Farm house");
		r1.setBounds(20,60,100,20);
		r3=new JRadioButton("Margerita");
		r3.setBounds(20,80,100,20);
		b=new JButton("Order:");
		b.setBounds(60,100,100,30);
		b.addActionListener(this);
		add(l);
		add(r1);
		add(r2);
		add(r3);
		add(b);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		setdefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		float amount=0;
		String msg="";
		if(r1.isSelected())
		{
			amount+=460;
			msg="country special ";
		}
		if(r2.isSelected())
		{
			amount+=420;
			msg="country special ";
		}if(r3.isSelected())
		{
			amount+=450;
			msg="country special ";
		}
		msg+="_________________________________________\n";
		JOptionPane.showMessageDialog(this,mgs+"total"+amount);
		
	}
	public static void main(String args[])
	{
		new order();
	}
	
}
