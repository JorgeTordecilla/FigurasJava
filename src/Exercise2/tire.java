package Exercise2;
import java.util.*;

public class tire{
	//attributes
	float radius;
	
		//methods
	public void CalculateRadius() {
		Scanner intp = new Scanner(System.in);
		System.out.println("Ingrese el radio: ");
		radius  = intp.nextFloat();
		radius*=2; //d = r * 2
		System.out.println(this.radius);	
	
	}
	

}
