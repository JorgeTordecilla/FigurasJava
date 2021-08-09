package Exercise1;
//para usar la funcion Scanner
import java.util.Scanner;

public class Exercise1 {
	
	static  int ExponenteRecursivo(int Expo, int Result, int Base) {
		 if(Expo == 0) 
			 return Result; 
		 else 
			 Expo-=1;
			 Result*=Base;
			 return ExponenteRecursivo(Expo,Result,Base);
	}

	public static void main(String[] args) {
		//Para ingresar datos por pantalla objeto Scanner
		Scanner LEER = new Scanner(System.in);
		//Variables 
		int Base = 0, Exponente = 0, Resultado = 1;
		
		//Impresiones por pantalla
		System.out.println("Ingrese la Base: ");
		Base = LEER.nextInt();

		do {
		System.out.println("Ingrese el exponente Mayor a 1: ");
		Exponente = LEER.nextInt();
		//Comprobar si exponente es mayor o igual a 0
		}while(Exponente<1);
		//Llamado a la funcion recursiva
		Resultado = ExponenteRecursivo(Exponente,Resultado, Base); 
		
		System.out.println("El resultado de "+ Base + " elevado a "+ Exponente + " es: " + Resultado);
	}

}