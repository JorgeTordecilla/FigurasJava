package exercise3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.*;

public class diamond extends figuras  {
	public void diamond() {
		 }
	public void paint( Graphics g ){
		super.paint(g);
		g.setColor(Color.white);		
		g.drawLine(figuras.x, figuras.y+figuras.height/2, figuras.x+figuras.Base/2, figuras.y);
        g.drawLine(figuras.x+figuras.Base, figuras.y+figuras.height/2,figuras.x+figuras.Base/2,figuras.y);
        g.drawLine(figuras.x+figuras.Base, figuras.y+figuras.height/2,figuras.x+figuras.Base/2,figuras.y+figuras.height);
        g.drawLine(figuras.x, figuras.y+figuras.height/2, figuras.x+figuras.Base/2, figuras.y+figuras.height);

	}
	public void paintMove( Graphics g, int x ,int y){
		super.paint(g);
		g.setColor(Color.darkGray);		
		g.drawLine(x, y+figuras.height/2, x+figuras.Base/2, y);
        g.drawLine(x+figuras.Base, y+figuras.height/2,x+figuras.Base/2,y);
        g.drawLine(x+figuras.Base, y+figuras.height/2,x+figuras.Base/2,y+figuras.height);
        g.drawLine(x, y+figuras.height/2, x+figuras.Base/2, y+figuras.height);
	}
	
	public void CalculateArea() {
		figuras.AreaG = (figuras.Base*figuras.height)/2;
        figuras.area.setText("Area: "+ AreaG);
	}
}
