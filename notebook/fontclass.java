import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.colorchooser.*;

import java.util.Vector;

public class fontclass extends notebook implements ItemListener, ActionListener,ChangeListener
{	
     notebook aa;	
	public fontclass(notebook bb)
     	{
     	aa=bb;
	//JFrame.setDefaultLookAndFeelDecorated(true);
	frame=new JDialog();
	frame.setSize(550,400);
	frame.setTitle("Font Option");

	p = new JPanel();
	p.setLayout(null);	
	textPane1 = new JTextPane();
	textPane1.setBackground(Color.LIGHT_GRAY);
        textPane1.setCaretPosition(0);
        textPane1.setMargin(new Insets(5,5,5,5));
	textPane1.setFont (new Font ("Arial", Font.BOLD , 12));		
	textPane1.setForeground(Color.black);
	textPane1.setEditable(false);

	JScrollPane scrollPane1 = new JScrollPane(textPane1);
        scrollPane1.setPreferredSize(new Dimension(200, 200));
	textPane1.setText("Sample");

//-------------------------------------------------------------------

	tcc = new JColorChooser(textPane1.getForeground());
        tcc.getSelectionModel().addChangeListener(this);
        tcc.setBorder(BorderFactory.createTitledBorder(
                                             "Choose Text Color"));

//-------------------------------------------------------------------
	fn=new JLabel("Font ");
	fs=new  JLabel("Font Style");
	fsi=new JLabel("Font Size");
	
	fn.setBounds(10,20,100,20);
	p.add(fn);
	
	fs.setBounds(240,20,100,20);
	p.add(fs);
	
	fsi.setBounds(360,20,100,20);
	p.add(fsi);

	GraphicsEnvironment gEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String envfonts[] = gEnv.getAvailableFontFamilyNames();
        Vector vector = new Vector();
        for ( int i = 1; i < envfonts.length; i++ ) 
	{
            vector.addElement(envfonts[i]);
        }
        fonts = new JComboBox( vector );
        fonts.setMaximumRowCount( 9 );
        fonts.addItemListener(this);
        fontchoice = envfonts[0];

	fonts.setBounds(10,40,200,20);
        p.add(fonts);

        sizes = new JComboBox( new Object[]{ "08","10", "12", "14", "16", "18","20","22","24","26","30","42","60","72"} );
        sizes.setMaximumRowCount( 9 );
        sizes.addItemListener(this);
	sizes.setBounds(360,40,50,20);
        p.add(sizes);

        styles = new JComboBox( new Object[]{
                                "PLAIN",
                                "BOLD",
                                "ITALIC",
                                "BOLD & ITALIC"} );
        styles.setMaximumRowCount( 9 );
        styles.addItemListener(this);
        sizes.setMaximumRowCount( 9 );
	styles.setBounds(240,40,100,20);
        p.add(styles);
	
	ok=new JButton("OK");
	ok.setBounds(450,25,75,20);
	p.add(ok);
	ok.addActionListener(this);
	_cancel=new JButton("Cancel");
	_cancel.setBounds(450,55,75,20);
	p.add(_cancel);
	_cancel.addActionListener(this);
	tcc.setBounds(10,65,400,300);
	p.add(tcc);

	//JLabel ll=new JLabel("Preview...");
	//ll.setBounds(10,240,100,20);
	//p.add(ll);
	scrollPane1.setBounds(420,85,115,280);
	p.add(scrollPane1);
	JDesktopPane dp=new JDesktopPane();
        frame.getContentPane().add(p);
	frame.setVisible(true);
	//textPane.setFont (new Font ("Arial", Font.BOLD ,22));
    }

	public void stateChanged(ChangeEvent e) 
	{
        	Color newColor = tcc.getColor();
	        textPane1.setForeground(newColor);
    	}


    public void itemStateChanged(ItemEvent e) {
        if ( e.getStateChange() != ItemEvent.SELECTED )
            return;

        Object list = e.getSource();

        
        if ( list == fonts ) {
            fontchoice = (String)fonts.getSelectedItem();
        } else if ( list == styles ) {
            index = styles.getSelectedIndex();
            stChoice = index;
		//JOptionPane.showMessageDialog(new JFrame(),index);
        } else {
            siChoice = (String)sizes.getSelectedItem();
        }
		
	if(stChoice==0)
	 	textPane1.setFont (new Font (fontchoice,Font.PLAIN, Integer.parseInt((String)sizes.getSelectedItem())));
	else if(stChoice==1)
		textPane1.setFont (new Font (fontchoice,Font.BOLD, Integer.parseInt((String)sizes.getSelectedItem())));
	else if(stChoice==2)
		textPane1.setFont (new Font (fontchoice,Font.ITALIC, Integer.parseInt((String)sizes.getSelectedItem())));
	else if(stChoice==3)
		textPane1.setFont (new Font (fontchoice,Font.BOLD | Font.ITALIC, Integer.parseInt((String)sizes.getSelectedItem())));
	else
		textPane1.setFont (new Font (fontchoice,Font.PLAIN, Integer.parseInt((String)sizes.getSelectedItem())));

      }  
	public void actionPerformed(ActionEvent event)
    	{
        	try
		{
		  if(event.getSource() == ok)
		  {
			//aa.textPane.setFont (new Font (fontchoice,Font.PLAIN, Integer.parseInt((String)sizes.getSelectedItem())));		
			  aa.textPane.setFont(textPane1.getFont());
			  aa.textPane.setForeground(textPane1.getForeground());
                        frame.dispose();
		  }
                  else if(event.getSource() == _cancel)
		  {
			//bb.textPane.setFont (new Font (fontchoice,Font.PLAIN, Integer.parseInt((String)sizes.getSelectedItem())));		
                      frame.dispose();
		  }
                }
		catch(Exception e)
		{
		  JOptionPane.showMessageDialog(new JFrame(),e); 
		}
		//textPane.setFont (new Font ("Arial", Font.BOLD ,22));
	}
}
