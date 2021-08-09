/*Ejercicio 2: Clases, Objetos, Mensajes, this
Con el objetivo de aplicar el conocimiento adquirido en clase 
y la elaboración de diferentes clases relacionadas realizaremos un 
ejercicio práctico, pero en diferentes clases.
1. Elaborar una clase llamada llanta, esta clase no debe tener 
main dado que será llamada desde la clase carro.
2. Como un carro tiene llantas entonces existe una relación 
entre la clase llanta y la clase carro.
3. En la clase llanta se deben crear atributos y 
un método llamado calcular Diámetro que recibe como parámetro
un entero u un flotante (del tipo que usted prefiera) ese parámetro 
se llamará radio, en este método como su nombre lo indica se debe calcular 
el valor del radio de la llanta, este un proceso se realizará con la variable 
de tipo local y se debe mostrar el valor del diámetro, y con la variable de 
instancia (usando el this), también mostrar el valor 
del diámetro en este caso.
*/
package Exercise2;

public class car  {

	public static void main(String[] args) {
		tire tire1 = new tire();
		tire1.CalculateRadius();
		
	}

}


