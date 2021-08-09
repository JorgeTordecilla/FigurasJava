package exercise3;

import java.awt.Color;
import java.awt.Graphics;

public class rectangle extends figuras {

		public void rectangle() {
		
		}
		public void paint( Graphics g ){
			super.paint( g );
			g.setColor(Color.white);
	        g.drawRect(figuras.x, figuras.y, figuras.Base, figuras.height);
		}
		public void paintMove( Graphics g, int x ,int y){
			super.paint( g );
			g.setColor(Color.darkGray);
			g.drawRect(x,y, figuras.Base, figuras.height);
		}
		
		public void CalculateArea() {
			figuras.AreaG = (figuras.Base*figuras.height);
	        figuras.area.setText("Area: "+ AreaG);
		}
	}
