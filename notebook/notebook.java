import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import javax.swing.undo.*;
import javax.swing.filechooser.*;
import java.lang.Integer;
import java.util.Vector;
import javax.swing.colorchooser.*;

public class notebook extends JFrame implements ActionListener
{
	JMenuBar mb;
	Dimension dd;
	JTextPane textPane;
	JFileChooser fc;
	File file;	
	FileReader in;
	JFrame f;
	JMenu m[];
	JMenuItem[] mi1,mi2,mi3,mi4,mi5,mi6;

	JTextPane textPane1;
	JTextArea t;
	JLabel fn,fs,fsi;
	JComboBox fonts, sizes, styles;
	JButton ok,_cancel;
	JPanel p;
        JDialog frame;
	JColorChooser tcc;
    	
	boolean sf;
	
	int index = 0;
	String fontchoice = "fontchoice";
	int stChoice;
    	String siChoice = "10";

	public void notebook1()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		f=new JFrame("Notebook");
		f.setSize(800,600);		
	
		textPane = new JTextPane();
		textPane.setBackground(Color.white);
        		textPane.setCaretPosition(0);
        		textPane.setMargin(new Insets(5,30,50,5));
		textPane.setFont (new Font ("Arial", Font.BOLD , 12));
		
		JScrollPane scrollPane = new JScrollPane(textPane);
	     	scrollPane.setPreferredSize(new Dimension(200, 200));
		fc = new JFileChooser();
		mb=new JMenuBar();
		
//-----------------------------------MENU------------------------		
		m=new JMenu[6];

		m[0]=new JMenu("File");
		m[1]=new JMenu("Edit");
		m[2]=new JMenu("Format");
		m[3]=new JMenu("View");
		m[4]=new JMenu("Help");
		m[5]=new JMenu("Java Tools");

		m[0].setMnemonic(KeyEvent.VK_F);
		m[1].setMnemonic(KeyEvent.VK_E);
		m[2].setMnemonic(KeyEvent.VK_O);
		m[3].setMnemonic(KeyEvent.VK_V);
		m[4].setMnemonic(KeyEvent.VK_H);
		m[5].setMnemonic(KeyEvent.VK_J);
		
//-------------------------------MENU ITEM-----------------------

//------------------------------FILE MENU ITEM-------------------
		mi1=new JMenuItem[7];

		mi1[0]=new JMenuItem("New      Ctrl+N",KeyEvent.VK_N);
		mi1[1]=new JMenuItem("Open...  Ctrl+O",KeyEvent.VK_O);
		mi1[2]=new JMenuItem("Save     Ctrl+S",KeyEvent.VK_S);
		mi1[3]=new JMenuItem("Save As...     ",KeyEvent.VK_A);
		mi1[4]=new JMenuItem("Page Setup...  ",KeyEvent.VK_U);
		mi1[5]=new JMenuItem("Print... Ctrl+P",KeyEvent.VK_P);
		mi1[6]=new JMenuItem("Exit           ",KeyEvent.VK_X);
//-----------------------------EDIT MENU ITEM-------------------
		mi2=new JMenuItem[11];

		mi2[0]=new JMenuItem("Undo             Ctrl+Z",KeyEvent.VK_U);
		mi2[1]=new JMenuItem("Cut                Ctrl+X",KeyEvent.VK_T);
		mi2[2]=new JMenuItem("Copy             Ctrl+C",KeyEvent.VK_C);
		mi2[3]=new JMenuItem("Paste            Ctrl+V",KeyEvent.VK_P);
		mi2[4]=new JMenuItem("Delete           Del   ",KeyEvent.VK_L);
		mi2[5]=new JMenuItem("Find                Ctrl+F",KeyEvent.VK_F);
		mi2[6]=new JMenuItem("Find Next       F3",KeyEvent.VK_N);
		mi2[7]=new JMenuItem("Replace         Ctrl+H",KeyEvent.VK_R);
		mi2[8]=new JMenuItem("Goto               Ctrl+G",KeyEvent.VK_G);
		mi2[9]=new JMenuItem("Select All      Ctrl+A",KeyEvent.VK_A);
		mi2[10]=new JMenuItem("Time/Date      F5",KeyEvent.VK_D);

//------------------------------FORMAT MENU ITEM-----------------

		mi3=new JMenuItem[2];
		mi3[0]=new JMenuItem("Word Wrap",KeyEvent.VK_W);
		mi3[1]=new JMenuItem("Font...",KeyEvent.VK_F);

//------------------------------ VIEW MENU ----------------------

		mi4=new JMenuItem[1];
		mi4[0]=new JMenuItem("Status Bar",KeyEvent.VK_S);

//------------------------------HELP MENU------------------------

		mi5=new JMenuItem[2];
		mi5[0]=new JMenuItem("Help Topic",KeyEvent.VK_H);
		mi5[1]=new JMenuItem("About Notebook",KeyEvent.VK_A);
		
		mi6=new JMenuItem[2];
		mi6[0]=new JMenuItem("Compile",KeyEvent.VK_C);
		mi6[1]=new JMenuItem("Run",KeyEvent.VK_R);

//------------------------------ADD FILE ITEM--------------------	

		for(int i=0;i<mi1.length;i++)
		{
			if(i==4 || i==6)
				m[0].addSeparator();
			m[0].add(mi1[i]);
			mi1[i].addActionListener(this);
		}

//-----------------------------ADD EDIT MENU ITEM---------------------

		for(int i=0;i<mi2.length;i++)
		{
			if(i==1 || i==5 || i==9)
				m[1].addSeparator();
			m[1].add(mi2[i]);
			mi2[i].addActionListener(this);
		}	
//----------------------------ADD FORMAT MENU ITEM--------------------

		m[2].add(mi3[0]);
		m[2].add(mi3[1]);
		mi3[0].addActionListener(this);
		mi3[1].addActionListener(this);
	
//----------------------------ADD VIEW MENU ITEM----------------------

		m[3].add(mi4[0]);
		mi4[0].addActionListener(this);

//--------------------------- ADD HELP MENU ITEM---------------------

		m[4].add(mi5[0]);
		m[4].addSeparator();
		m[4].add(mi5[1]);
		mi5[0].addActionListener(this);
		mi5[1].addActionListener(this);
		
//-----------------------------Java Tools ---------------------------

		m[5].add(mi6[0]);
		m[5].add(mi6[1]);
		mi6[0].addActionListener(this);
		mi6[1].addActionListener(this);
		
//------------------------------ADD ALL MENU-------------------------		
		for(int i=0;i<m.length;i++)
			mb.add(m[i]);

//-----------------------------End of Menu --------------------------


		JDesktopPane dp=new JDesktopPane();		

		f.add(scrollPane);
		f.getContentPane().add(scrollPane);
		f.setJMenuBar(mb);

		
		f.setVisible(true); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public void savenotebook(int returnVal)
	{
		if (returnVal == JFileChooser.APPROVE_OPTION)
			{
                	 	file = fc.getSelectedFile();
				try
				{
        				FileWriter out = new FileWriter(file);
        				int i=0;
					char c;
					String st="";
					String fileinfo="";
					st=textPane.getText().toString();
					while(i<st.length())
					{
						c=(char)st.charAt(i);
           					out.write(c);
						i++;
					}
        				out.close();
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(new JFrame(),e);
				}
				f.setTitle(file.getName());

			}	

	}

	public void actionPerformed(ActionEvent event)
    	{
        	if(event.getSource() == mi1[0])
		{
		  textPane.setText("");
		  f.setTitle("Notebook");
		}

		else if (event.getSource() == mi1[1])
		{ 
			int returnVal = fc.showOpenDialog(notebook.this);

            		if (returnVal == JFileChooser.APPROVE_OPTION)
			{
                		file = fc.getSelectedFile();
			        try
				{
					in = new FileReader(file);
        				int c;
					String st="";
        				while ((c = in.read()) != -1)
					st+=(char)c;
        				in.close();
					textPane.setText(st);
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(new JFrame(),e);
				}
				
				f.setTitle(file.getName());
			}
		}
		else if (event.getSource() == mi1[2])
		{
			
			int re=0;
			if(f.getTitle()=="Notebook")		
				re = fc.showSaveDialog(notebook.this);
			else
				re=0;
			savenotebook(re);

		}	
		else if (event.getSource() == mi1[3])
		{
            		int re = fc.showSaveDialog(notebook.this);

			savenotebook(re);
		}
		else if(event.getSource()==mi1[4])
		{
			JOptionPane.showMessageDialog(new JFrame(),"PAGE SETUP OPTION IS UNDER PROCESS......");					
		}
		else if(event.getSource()==mi1[5])
		{
			JOptionPane.showMessageDialog(new JFrame(),"PRINT OPTION IS UNDER PROCESS........");					
		}
		else if(event.getSource()==mi1[6])
		{
			System.exit(0);
		}
		else if(event.getSource()==mi2[9])
		{
			JOptionPane.showMessageDialog(new JFrame(),textPane.getSelectedText());
			
		}
		else if(event.getSource()==mi3[1])
		{
			new fontclass(this);
			//textPane.setFont (new Font (fontchoice,Font.BOLD ,22));
			
		}
		else if(event.getSource()==mi3[0])
		{
			JOptionPane.showMessageDialog(new JFrame(),textPane.getText());
		}

	}
}

