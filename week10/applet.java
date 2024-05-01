import java.applet.Applet;
import java.awt.Graphics;

/*
	<applet code = "Main.class" width="500" height="300"> </applet>
 */
public class Main extends Applet{
	public void paint(Graphics g){
		g.drawString("Hello world", 50, 50);
	}
}
