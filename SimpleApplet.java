import java.awt.*; //abstract window toolkit
import java.applet.*;

public class SimpleApplet extends Applet{
	public void paint(Graphics g){
		g.drawString("A Simple Applet.", 20, 20);
		g.drawString("A Simple Applet.", 40, 40);
		g.drawString("A Simple Applet", 60, 60);
		 //pixels
	}
}
