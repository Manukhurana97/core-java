package pack;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class DemoEvent implements ActionListener,FocusListener,KeyListener,MouseListener{
	JTextField tf1,tf2;
	JButton b1,b2;
	DemoEvent()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame f = new JFrame("this is my frame");
			
		JPanel p = new JPanel();
		f.add(p);
		p.setLayout(null);
		//p.setBackground(Color.cyan);
		// label
		
		// text field
		tf1= new JTextField(20);
		tf1.addFocusListener(this);
		tf1.addKeyListener(this);
		tf1.setText("Search");
		tf2= new JTextField(20);
		b1 = new JButton("Button 1");
		b1.addActionListener(this);
		b1.addMouseListener(this);
		b2 = new JButton("Button 2");
		b2.addActionListener(this);
		p.add(tf1);p.add(tf2);p.add(b1);p.add(b2);
		tf1.setBounds(40,50,150,20);
		tf2.setBounds(200,50,150,20);
		b1.setBounds(40,80,150,20);
		b2.setBounds(200,80,150,20);
		f.setLocation(100,100);
		f.setSize(800,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void mousePressed(MouseEvent me)
	{
		
	}
	public void mouseReleased(MouseEvent me)
	{
		
	}
	public void mouseClicked(MouseEvent me)
	{
		
	}
	public void mouseEntered(MouseEvent me)
	{
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.blue);
	}
	public void mouseExited(MouseEvent me)
	{
		b1.setBackground(Color.blue);
		b1.setForeground(Color.yellow);
	}
	public void keyPressed(KeyEvent ke)
	{
		
	}
	public void keyReleased(KeyEvent ke)
	{
		
	}
	public void keyTyped(KeyEvent ke)
	{
		tf2.setText(tf1.getText().toUpperCase());
	}
	public void focusGained(FocusEvent fe)
	{
		if(tf1.getText().equals("Search"))
		{
			tf1.setText("");
		}
	}
	public void focusLost(FocusEvent fe)
	{
		if(tf1.getText().equals(""))
		{
			tf1.setText("Search");
		}
	}
 public void actionPerformed(ActionEvent ae)
 {
	 if(ae.getSource()==b1)
	 {
		 tf1.setText("button 1 is clicked");
		 tf2.setText("");
		 //new Calci();
		 
	 }
	 else if(ae.getSource()==b2)
	 {
		 tf1.setText("");
		 tf2.setText("button 2 is clicked");
	 }
 }
public static void main(String[] args) {

	new DemoEvent();
	}
}