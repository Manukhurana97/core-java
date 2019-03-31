import javax.swing.*; //for form
import java.awt.event.*;

class pwd
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("password:");
		
		
		//name & text field
		JTextField f1 =	new JTextField();
		f1.setBounds(100,20,110,30);
		JLabel l1=new JLabel("username");
		l1.setBounds(10,20,110,30);
		
		
		//password & password field
		JPasswordField p=new JPasswordField(); 
		p.setBounds(100,70,110,30);
		JLabel l=new JLabel("Password");
		l.setBounds(10,70,110,30);

        
        //checkbox
		JCheckBox c= new JCheckBox("Male:");
		c.setBounds(20,100,70,30);
		JCheckBox c1= new JCheckBox("Female");
		c1.setBounds(100,100,70,30);
		
		
		//Radio
		JRadioButton r=new JRadioButton("male");
		r.setBounds(20,140,80,30);
		JRadioButton r1=new JRadioButton("female");
		r1.setBounds(200,140,100,30);
		
		
		//combo box
		String Country[]={"India","America","Africa","France","Colombia","London","China","Germany","Dubai","Finland","Russia","Canada","Honkong","Australia","England","Neitherland"};
		JComboBox cb=new JComboBox(Country);
		cb.setBounds(30,170,100,30);
        JLabel l2=new JLabel("Select country");

		
		//table
		String column[]={"ID","name","salary"};
		String data[][]={{"1210","Manu","100000/m"},
		                {"1211","abc","80000/m"}};
		JTable jt=new JTable();
		jt.setBounds(20,200,200,300);
		JScrollPane sp=new JScrollPane(jt);
		
		//button
		JButton b=new JButton("order");
		b.setBounds(100,400,70,20);
		
		
		//f.addWindowListener();
		// f.addDefaultCloseOperation(JFrame.DO_NOTHING_NO_CLOSE);
		// int a=JOptionPane.ShowConfirmDialog(f,"Are you Sure?");
		// if(a==JOptionPane.YES_OPTION)
		// {
			// f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
        
		//add the value 
		f.add(p);//password field
		f.add(l);//password label
		f.add(f1);//name field
		f.add(l1);//name label
		f.add(b);//button
		f.add(c);//checkbox 1
		f.add(c1);//checkbox 2
		f.add(r);//radio 1
		f.add(r1);//radio 2
		f.add(cb);//combobox
		f.add(l2);//select country
		f.add(sp);//table
		
		//to declare the size,layout of form  
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
}