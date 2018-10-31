import java.applet.*;
import java.awt.*;

/*<applet code="Joker" width=300 height=300>
</applet>*/

public class Joker extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.yellow);
g.fillOval(100,100,100,100);
g.setColor(Color.white);
g.fillOval(125,125,20,20);
g.fillOval(155,125,20,20);
g.setColor(Color.red);
g.fillOval(140,140,20,20);
g.setColor(Color.black);
g.fillArc(125,150,50,40,180,180);
g.setColor(Color.red);
int x[]={125,150,175,125};
int y[]={107,57,107,107};
int n=x.length;
g.fillPolygon(x,y,n);

}
} 