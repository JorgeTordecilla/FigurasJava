package exercise3;

import javax.swing.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.event.*;

public class figuras extends JFrame implements ChangeListener, ActionListener{
	
	//attributes
	static int x;
	static int y;
	static int radius,height, Base;
	static double AreaG;
	int option =0;
	static int press = 0;
	//j
    private JRadioButton Fcircle, FTriangle, Frectangle, FDiamond;
    private ButtonGroup bg, moveBg;
    protected static JLabel text, area;
    private JTextField Radius, TBase, Theight,Rheight,RBase, Diag1, Diag2, Dx , Dy;
    private JButton Submit, up, down, left, right;
    static JPanel panel=new JPanel(); 
    static Graphics g ; 
    //fig
    private static Circle n ;
    private static triangle t ;
    private static rectangle r;
    private static diamond di;
    //Constructor
    public  figuras() {
    	
    }
    //GraphicInterface
    public void GraphicInterface() {
    	
    	//WINDOWS LABEL
        text=new JLabel("Graficar Figuras");
        text.setBounds(280,3,300,20);
        add(text);
        
        /******   radio Buttons     ********/
        //circle
        bg=new ButtonGroup();
        Fcircle=new JRadioButton("Circulo");
        Fcircle.setBounds(1,30,100,30);
        Fcircle.addChangeListener(this);
        add(Fcircle);
        bg.add(Fcircle);  
        //Radius
        text=new JLabel("Radio");
        text.setBounds(5,60,80,20);
        add(text);
        Radius = new JTextField(5);
        Radius .setBounds(45,60,80,20);
        add(Radius ); 
        
        //triangle
        FTriangle=new JRadioButton("Tirangulo");
        FTriangle.setBounds(170,30,100,30);
        FTriangle.addChangeListener(this);
        add(FTriangle);
        bg.add(FTriangle); 
        //Base
        text=new JLabel("Base");
        text.setBounds(175,60,80,20);
        add(text);
        TBase= new JTextField(5);
        TBase.setBounds(210,60,80,20);
        add(TBase); 
        //height
        text=new JLabel("Altura");
        text.setBounds(175,90,80,20);
        add(text);
        Theight = new JTextField(5);
        Theight.setBounds(210,90,80,20);
        add(Theight); 
        
        //rectangle
        Frectangle=new JRadioButton("Rectangulo");
        Frectangle.setBounds(335,30,100,30);
        Frectangle.addChangeListener(this);
        add(Frectangle);
        bg.add(Frectangle); 
        //Base
        text=new JLabel("Base");
        text.setBounds(340,60,80,20);
        add(text);
        RBase = new JTextField(5);
        RBase.setBounds(375,60,80,20);
        add(RBase); 
        //height
        text=new JLabel("Altura");
        text.setBounds(340,90,80,20);
        add(text);
        Rheight = new JTextField(5);
        Rheight.setBounds(375,90,80,20);
        add(Rheight);
        
        //Diamond
        FDiamond=new JRadioButton("Rombo");
        FDiamond.setBounds(500,30,100,30);
        FDiamond.addChangeListener(this);
        add(FDiamond);
        bg.add(FDiamond); 
        //diagonal1
        text=new JLabel("Diagonal1");
        text.setBounds(505,60,80,20);
        add(text);
        Diag1 = new JTextField(5);
        Diag1.setBounds(565,60,80,20);
        add( Diag1); 
        //diagonal2
        text=new JLabel("Diagonal2");
        text.setBounds(505,90,80,20);
        add(text);
        Diag2 = new JTextField(5);
        Diag2.setBounds(565,90,80,20);
        add( Diag2);
        
        //coordinates
        up = new JButton("↑");
        up.setBounds(275,115,40,20);
        up.addActionListener(this);
        add(up);
        down= new JButton("↓");
        down.setBounds(275,140,40,20);
        down.addActionListener(this);
        add(down);
        left= new JButton("←");
        left.setBounds(225,128,45,20);
        left.addActionListener(this);
        add(left);
        right= new JButton("→");
        right.setBounds(320,128,45,20);
        right.addActionListener(this);
        add(right);

        //submit
        Submit = new JButton("Calcular");
        Submit.setBounds(230,170,80,20);
        Submit.addActionListener(this);
        add(Submit);
        
        //Area
        area=new JLabel("Area: 0");
        area.setBounds(320,170,80,20);
        add(area);
        
        //jpanel
        panel.setBounds(70,210, 500,240);    
        panel.setBackground(Color.DARK_GRAY); 
        add(panel);
        text=new JLabel("0");
        text.setBounds(65,195,80,20);
        add(text);
        text=new JLabel("100");
        text.setBounds(60,445,80,20);
        add(text);
        text=new JLabel("100");
        text.setBounds(560,193,80,20);
        add(text);
    	//jframe
    	setBounds(0,0,680,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setVisible(true);
    }
    
    //area
    public void CalculateArea() {

    }

    //Radio button Select
    public void stateChanged(ChangeEvent e) {
    	if (Fcircle.isSelected() ) {
    		option = 1;
        }
    	else if(FTriangle.isSelected() ){
    		option = 2;
    	}
    	else if(Frectangle.isSelected() ){
    		option = 3;
    	}
    	else if(FDiamond.isSelected() ){
    		option = 4;
    	}
    	else {
    		option = 0;
    	}
    }
    //submit button
    public void actionPerformed(ActionEvent d) {
    	//figures movements
       	if (d.getSource()== down) {
       		if(option == 1 & y < 478-radius) {
        		y+=3;
        		n.paintMove(getGraphics(), x, y-3);
        		n.paint(getGraphics());
       		}
       		if(option == 2 & y < 472 - height/2) {
       			y+=3;
        		t.paintMove(getGraphics(), x, y-3);
        		t.paint(getGraphics());
       		}
       		if(option == 3 & y < 472 - height) {
       			y+=3;
        		r.paintMove(getGraphics(), x, y-3);
        		r.paint(getGraphics());
       		}
       		if(option == 4 & y < 472 - height) {
       			y+=3;
        		di.paintMove(getGraphics(), x, y-3);
        		di.paint(getGraphics());
       		}
    	}
       	if (d.getSource()== right) {
       		if(option == 1& x < 574-radius) {
       			x+=3;
        		n.paintMove(getGraphics(), x-3, y);
        		n.paint(getGraphics());
        		//System.out.println(x);
       		}
       		if(option == 2 & x < 574-Base) {
       			x+=3;
        		t.paintMove(getGraphics(), x-3, y);
        		t.paint(getGraphics());
       		}
       		if(option == 3 & x < 574-Base) {
       			x+=3;
        		r.paintMove(getGraphics(), x-3, y);
        		r.paint(getGraphics());
       		}
       		if(option == 4 & x < 574 - Base) {
       			x+=3;
        		di.paintMove(getGraphics(), x-3, y);
        		di.paint(getGraphics());
       		}
    	}
       	//whithout comprobation extra
       	if (d.getSource()== up & y > 243) {
       		if(option == 1) {
       			y-=3;
        		n.paintMove(getGraphics(), x, y+3);
        		n.paint(getGraphics());
       		}
       		if(option == 2) {
       			y-=3;
        		t.paintMove(getGraphics(), x, y+3);
        		t.paint(getGraphics());
       		}
       		if(option == 3) {
       			y-=3;
        		r.paintMove(getGraphics(), x, y+3);
        		r.paint(getGraphics());
       		}
       		if(option == 4 ) {
       			y-=3;
        		di.paintMove(getGraphics(), x, y+3);
        		di.paint(getGraphics());
       		}
    	}
       	if (d.getSource()== left& x > 78) {
       		if(option == 1) {
       			x-=3;
        		n.paintMove(getGraphics(), x+3, y);
        		n.paint(getGraphics());
       		}
       		if(option == 2) {
       			x-=3;
        		t.paintMove(getGraphics(), x+3, y);
        		t.paint(getGraphics());
       		}
       		if(option == 3) {
       			x-=3;
        		r.paintMove(getGraphics(), x+3, y);
        		r.paint(getGraphics());
       		}
       		if(option == 4 ) {
       			x-=3;
        		di.paintMove(getGraphics(), x+3, y);
        		di.paint(getGraphics());
       		}
       	}
       	
       	//Calculate
    	if (d.getSource()==Submit & option != 0) {	
        	//Circle
    		n.paintMove(getGraphics(), x, y);
    		t.paintMove(getGraphics(), x, y);
    		r.paintMove(getGraphics(), x, y);
    		di.paintMove(getGraphics(), x, y);
        	if(option == 1) {
            	//Validate radius != 0
            	if(Radius .getText().length() == 0) {
            		radius = 100;
            		Radius .setText(""+radius);

            	}
            	else {
            		String data= Radius .getText();
    	    		radius =Integer.parseInt(data); 
    	    		if(radius > 200) {
    	    			radius = 200;
    	    			Radius .setText(""+radius);
    	    		}
            	}
        			y = 243;
        			x = 78;
	    			n.paint(getGraphics());
	    			n.CalculateArea();  
        	}
        	//Triangle
        	if(option == 2) {
            	//Validate base != 0
            	if(TBase.getText().length() == 0) {
            		Base = 100;
            		TBase.setText(""+Base);
            	}
            	else {
            		String data= TBase.getText();
    	    		Base =Integer.parseInt(data); 
    	    		if(Base > 495) {
    	    			Base= 495;
    	    			TBase.setText(""+Base);
    	    		}
            	}
            	//Validate base != 0
            	if(Theight.getText().length() == 0) {
            		height = 100;
            		Theight.setText(""+height);
            	}
            	else {
            		String data= Theight.getText();
            		height =Integer.parseInt(data); 
    	    		if(height > 300) {
    	    			height= 300;
    	    			Theight.setText(""+height);
    	    		}
            	}
            		y = 243;
            		x = 78;
	    			t.paint(getGraphics());
	    			t.CalculateArea();    
        	}

        	//rectangle
        	if(option == 3) {
            	//Validate radius != 0
            	if(RBase.getText().length() == 0) {
            		Base = 100;
            		RBase.setText(""+Base);
            	}
            	else {
            		String data= RBase.getText();
    	    		Base =Integer.parseInt(data); 
    	    		if(Base > 495) {
    	    			Base= 495;
    	    			RBase.setText(""+Base);
    	    		}
            	}
            	if(Rheight.getText().length() == 0) {
            		height = 100;
            		Rheight.setText(""+height);
            	}
            	else {
            		String data= Rheight.getText();
            		height =Integer.parseInt(data); 
    	    		if(height > 230) {
    	    			height= 230;
    	    			Rheight.setText(""+height);
    	    		}
            	}
    				y = 243;
    				x = 78;
	    			r.paint(getGraphics());
	    			r.CalculateArea();    
        	}
        	
        	
        	//diamond
        	if(option == 4) {
            	//Validate diag1 != 0
            	if(Diag1.getText().length() == 0) {
            		Base = 100;
            		Diag1.setText(""+Base);
            	}
            	else {
            		String data= Diag1.getText();
    	    		Base =Integer.parseInt(data); 
    	    		if(Base > 495) {
    	    			Base= 495;
    	    			Diag1.setText(""+Base);
    	    		}
            	}
            	//Validate diag1 != 0
            	if(Diag2.getText().length() == 0) {
            		height = 100;
            		Diag2.setText(""+height);
            	}
            	else {
            		String data= Diag2.getText();
            		height =Integer.parseInt(data); 
    	    		if(height > 230) {
    	    			height= 230;
    	    			Diag2.setText(""+height);
    	    		}
            	}
            		y = 243;
            		x = 78;
	    			di.paint(getGraphics());
	    			di.CalculateArea();    
        		}
        	

        }
 
    }

	
    public static void main(String[] ar) {
    	figuras f = new figuras(); 
    	f.GraphicInterface();
    	n = new Circle();
    	t = new triangle();
    	r = new rectangle();
    	di = new diamond();
    }

}