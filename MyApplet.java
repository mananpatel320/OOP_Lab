import java.awt.*;
import java.applet.*;
/* 	<applet code = "MyApplet" width = 600 height = 500>
	</applet>
*/
public class MyApplet extends Applet{
	String msg;
	public void init(){
		setBackground(Color.green);
		setForeground(Color.green);
		msg = "Inside init() -- ";
	}
	public void start(){
		msg += "Inside start() -- ";
	}
	public void stop(){
		msg += "Inside stop() -- ";
	}
	public void destroy(){
		msg += "Inside destroy() -- ";
	}
	public void paint(Graphics g){
		msg += "Inside paint() -- ";
		g.drawString(msg, 10, 30);
		showStatus("This is shown in the status window.");
	}
}
 
