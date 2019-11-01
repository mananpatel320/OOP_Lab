import java.applet.*;
import java.awt.*;
/* <applet code = "fontApplet" width = 200 height = 100>
	</applet> */
public class fontApplet extends Applet{
	Font f,f1,f2,f3;
 	String msg;
 	public void init(){
 		f = new Font("Times New Roman", Font.BOLD, 12);
 		f1 = new Font("SansSerif", Font.PLAIN, 15);
 		f2 = new Font("Comic Sans MS", Font.ITALIC, 17);
 		f3 = new Font("Times New Roman", Font.ITALIC, 5);
 		msg = "Have a good day!";
 		setFont(f2);
 	}
 	public void paint(Graphics g) {
 		g.drawString(msg, 4, 20);
 	}
}
