import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code = "AppletFrame" width = 600 height = 600>
	</applet>*/
class MyFrame extends Frame{
	MyFrame(String s){
		super(s);
	}
}

public class AppletFrame extends Applet implements WindowListener{
	Frame f;
	public void init(){
		f = new MyFrame("A Frame Window");
		f.setVisible(true);
		f.setSize(300,300); //frame size 300 width and 300 height
		f.addWindowListener(this);
	}
	public void start(){
		f.setVisible(true);
	}
	public void stop(){
		f.setVisible(false);
	}
	public void windowClosing(WindowEvent we){
		f.setVisible(false);
	}
	public void windowActivated(WindowEvent we){ }
	public void windowClosed(WindowEvent we){ }
	public void windowDeactivated(WindowEvent we){ }
	public void windowDeiconified(WindowEvent we){
		f.setTitle("Maximizing");
	}
	public void windowIconified(WindowEvent we){
		f.setTitle("Minimizing");
	}
	public void windowOpened(WindowEvent we){ }
	public void paint(Graphics g){
		g.drawString("This is in applet window",10,20);
	}
}
	
