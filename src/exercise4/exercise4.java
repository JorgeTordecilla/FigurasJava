package exercise4;

import java.util.StringTokenizer;


public class exercise4 {

	public static void main(String[] args) {
		/*Clase String:
		 Un String en Java representa una cadena
		 de caracteres no modificable.*/
	  	String Name="Jorge Ariel Cristhell";
	  	/*La clase String Tokenizer permite a 
	  	 *una aplicación dividir una cadena en tokens*/
	  	StringTokenizer printName=new StringTokenizer(Name);
	  	System.out.println("Nombre: "+Name);  
	  	System.out.println("Nombre Separado: ");  
	  	/*hasMoreTokens() metodo usado  para verificar si hay mas tokens
	  	 * disponibles en el tokenizer's string.*/
	  	while(printName.hasMoreTokens()){
	  		System.out.println(printName.nextToken());    
	  	    }
	  	/*La clase String Tokenizer permite a 
	  	 *una aplicación dividir una cadena en tokens*/
	  	StringTokenizer SaveName=new StringTokenizer(Name);
	  	/*StringBuffer: clase que permite crear objetos
	  	 *que almacenan cadenas de caracteres que pueden ser modificadas*/
	  	StringBuffer RebiuldName = new StringBuffer();
	  	while(SaveName.hasMoreTokens()){
	  		RebiuldName.append((String)SaveName.nextToken());   
	  		RebiuldName.append(" "); 
	  	    }	
	  	/*Reverse para dar la vuetla a los strings*/
	  	RebiuldName.reverse();
	  	String RName = RebiuldName.toString();
	  	System.out.println("Nombre Reconstruido: " +RName);
	}
}
