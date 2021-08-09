package exercise3;


import java.awt.Color;
import java.awt.Graphics;

public class triangle extends figuras {

	public void triangle() {
	
	}
	public void paint( Graphics g ){
		super.paint( g );
		g.setColor(Color.white);
        g.drawLine(figuras.x, figuras.y+figuras.height/2, figuras.x+figuras.Base, figuras.y+figuras.height/2);
        g.drawLine(figuras.x, figuras.y+figuras.height/2, figuras.x+figuras.Base/2, figuras.y);
        g.drawLine(figuras.x+figuras.Base, figuras.y+figuras.height/2,figuras.x+figuras.Base/2,figuras.y);

	}
	public void paintMove( Graphics g, int x ,int y){
		super.paint( g );
		g.setColor(Color.darkGray);
		g.drawLine(x, y+figuras.height/2, x+figuras.Base, y+figuras.height/2);
        g.drawLine(x, y+figuras.height/2, x+figuras.Base/2, y);
        g.drawLine(x+figuras.Base, y+figuras.height/2, x+figuras.Base/2,y);
	}
	
	public void CalculateArea() {
		figuras.AreaG = (figuras.Base*figuras.height)/2;
        figuras.area.setText("Area: "+ AreaG);
	}
}
