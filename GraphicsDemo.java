import java.awt.*;
import java.applet.*;
/*	<applet code = "GraphicsDemo" width=350 height=700>
	</applet>
*/
public class GraphicsDemo extends Applet{
	public void paint(Graphics g){
		//Draw Lines
		g.setColor(Color.gray);
		g.drawLine(0, 90, 100, 10);
		g.drawLine(40, 25, 250, 80);
		//Draw Rectangles
		g.setColor(Color.blue);
		g.drawRect(10, 150, 60, 50);
		g.fillRect(100, 150, 60, 50);
		g.drawRoundRect(190, 150, 60, 50, 15, 15);
		g.fillRoundRect(280, 150, 60, 50, 30, 40);
		//Draw Ellipses and Circle
		g.setColor(Color.yellow);
		g.drawOval(10, 250, 50, 50);
		g.fillOval(90, 250, 75, 50);
		g.drawOval(190, 260, 100, 40);
		//Draw Arcs
		g.setColor(Color.orange);
		g.drawArc(10, 350, 70, 70, 0, 180);
		g.fillArc(60, 350, 70, 70, 0, 75);
		//Draw Polygon
		int xpoints[] = {10, 200, 10, 200, 10};
		int ypoints[] = {450, 450, 650, 650, 450};
		int num = 5; //4
		g.setColor(Color.green);
		g.fillPolygon(xpoints, ypoints, num); //drawPolygon
		Color c1 = new Color(255, 100, 100);
		Color c2 = new Color(100, 255, 100);
		Color c3 = new Color(100, 100, 255);
		g.setColor(c1);
		g.drawLine(0, 100, 100, 0);
		g.setColor(c2);
		g.drawLine(40, 25, 250, 180);
		g.setColor(Color.red);
		g.drawOval(10, 10, 50, 50);
		g.fillOval(70, 90, 140, 100);
	}
}
