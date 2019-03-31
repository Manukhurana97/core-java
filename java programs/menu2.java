import javax.swing.*;
import java.awt.event.*;
class menu2 extends ActionListener 
{
	JFrame f;
	JMenuBar m;
	JMenu file,edit,view,Setting;
	JMenuItem cut,copy,paste,selectAll;
	JTextArea t;
	menu2()
	{
		f=JFrame();
		cut=new JMenuItem("cut");
		copy=new JMenuItem("copy");
		paste=new JMenuItem("paste");
		
		selectAll=new JMenuItem("selectAll");
	    cut.addActionListener(this); 
	    copy.addActionListener(this); 
	    paste.addActionListener(this); 
	    selectAll.addActionListener(this);
        
		
		m=new JMenuBar();
		file=new JMenu("File");
		edit=new JMenu("Edit");
		view=new JMenu("view");
		setting=new JMenu("settings");
		
		
		m.add("file");
		m.add("edit");
		m.add("view");
		m.add("setting");
			
		edit.add("cut");
		edit.add("copy");
		edit.add("paste");
		edit.add("selectAll");
		
		 t=new JTextArea();
		 t.setBounds(20,20,300,200);
		 
		f.add(f);
		f.add(t);
		f.addMenuBar(mb);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==cut)
			t.cut();
		if(e.getSource()==copy)
			t.copy();
		if(e.getSource()==paste)
			t.paste();
		if(e.getSource()==selectAll)
			t.selectAll();
	}
	public static void main(String args)
	{
		new menu2();
	}
}