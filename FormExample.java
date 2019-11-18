import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code = "FormExample" width = 240 height = 200>
</applet>
*/
public class FormExample extends JApplet {
	JLabel JLabel_firstName, JLabel_lastName, JLabel_DOB, JLabel_displayInfo;
	public void init(){
		try{
			SwingUtilities.invokeAndWait(
				new Runnable(){
					public void run(){
						makeGUI();
					}
				}
			);
		}catch( Exception e ){
			System.out.println(e);
		}
	}
	private void makeGUI(){
		setLayout(new FlowLayout());
		JLabel_firstName = new JLabel("First Name:");
		add(JLabel_firstName);
		JTextField JTextField_firstName = new JTextField(20);
		add(JTextField_firstName);
		JLabel_lastName = new JLabel("Last Name:");
		add(JLabel_lastName);
		JTextField JTextField_lastName = new JTextField(20);
		add(JTextField_lastName);
		JLabel_DOB = new JLabel("Date of Birth:");
		add(JLabel_DOB);
		String s1[] = { "1", "2" , "3", "4", "5", "6", "7", "8", "9", "10"};
		JComboBox JCombobox_date = new JComboBox(s1);
		add(JCombobox_date);
		String s2[] = { "January", "February", "March"};
		JComboBox JCombobox_month = new JComboBox(s2);
		add(JCombobox_month);
		String s3[] = { "2000", "2001", "2002" };
		JComboBox JCombobox_year = new JComboBox(s3);
		add(JCombobox_year);
	}
}
