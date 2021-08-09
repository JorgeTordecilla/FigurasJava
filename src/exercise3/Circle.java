package exercise3;

import java.awt.Color;
import java.awt.Graphics;


public class Circle extends figuras {
	public void Circle() {
		
	}
	public void paint( Graphics g ){
		super.paint( g );
		g.setColor(Color.white);
		g.drawOval(figuras.x, figuras.y, figuras.radius, figuras.radius);

	}
	public void paintMove( Graphics g, int x ,int y){
		super.paint( g );
		g.setColor(Color.darkGray);
		g.drawOval(x,y, figuras.radius, figuras.radius);
	}
	
	public void CalculateArea() {
		double pi = 3.1416;
		figuras.AreaG = (figuras.radius*figuras.radius)*pi;
        figuras.area.setText("Area: "+ AreaG);
	}
}
