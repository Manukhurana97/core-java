import javax .swing.*;
class combobox
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("cpmbobox");
		String country[]={"India","Usa","England","Australia","Uae"};
		JComboBox cb=new JCheckBox(country);
		cb.setBounds(50,50,90,20);
		f.add(cb);
		f.setLayout(null);
		f.setVisible(true);
	}
}