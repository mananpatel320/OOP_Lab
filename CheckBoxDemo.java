import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*  <applet code = "CheckBoxDemo" width = 240 height = 200>
	</applet>
*/
public class CheckBoxDemo extends Applet implements ItemListener {
	String msg = "";
	Checkbox b, r;
	public void init(){
		b = new Checkbox("BLUE", true);
		r = new Checkbox("RED");
		add(b);
		add(r);
		b.addItemListener(this);
		r.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	public void paint(Graphics g){
		msg = "Current state: ";
		g.drawString(msg, 6, 80);
		msg = " BLUE: " + b.getState();
		g.drawString(msg, 6, 100);
		msg = " RED: " + r.getState();
		g.drawString(msg, 6, 120);
	}
}
