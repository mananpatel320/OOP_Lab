import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="MouseEvents" width=300 height=100>
	</applet>
*/
public class MouseEvents extends Applet implements MouseMotionListener{
	String msg = "";
	int mouseX,mouseY;
	public void init(){
		addMouseMotionListener(this);
	}
	//Handle mouse dragged
	public void mouseDragged(MouseEvent me){
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Manan";
		showStatus("Dragging mouse at "+ mouseX +", "+ mouseY);
		repaint();
	}
	//Handle mouse moved
	public void mouseMoved(MouseEvent me){
		showStatus("Moving mouse at "+me.getX() + ", "+ me.getY());
	}
	//Display msg in applet window at current X,Y location
	public void paint(Graphics g){
		g.drawString(msg,mouseX,mouseY);
	}
}
