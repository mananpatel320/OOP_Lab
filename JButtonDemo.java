import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code = "JButtonDemo" width = 500 height = 750>
</applet>
*/
public class JButtonDemo extends JApplet {
	JLabel jlab;
	public void init(){
		try{
			SwingUtilities.invokeAndWait( //invokeLater()
				new Runnable() { // anonymous inner class
					public void run() {
						makeGUI();
					}
				}
			);
		}catch(Exception exc){
			System.out.println("Can't create because of " + exc);
		}
	}
	private void makeGUI(){
		//change to flow layout
		setLayout(new FlowLayout()); // default for swing is border layout
		JButton jb = new JButton("NORTH");
		add(jb);
		jb.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){	
				jlab.setText("You selected " + ae.getActionCommand());
			}
		});
		jb = new JButton("SOUTH");
		add(jb);
		jb.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){ // Anonymous inner class
				jlab.setText("You selected " + ae.getActionCommand());
			}
		});
		jb = new JButton("EAST");
		add(jb);
		jb.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				jlab.setText("You selected " + ae.getActionCommand());
			}
		});
		jb = new JButton("WEST");
		add(jb);
		jb.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				jlab.setText("You selected " + ae.getActionCommand());
			}
		});
		jlab = new JLabel("Choose a direction");
		add(jlab);
	}
}
