/*Ejercicio 2: Clases, Objetos, Mensajes, this
Con el objetivo de aplicar el conocimiento adquirido en clase 
y la elaboraci�n de diferentes clases relacionadas realizaremos un 
ejercicio pr�ctico, pero en diferentes clases.
1. Elaborar una clase llamada llanta, esta clase no debe tener 
main dado que ser� llamada desde la clase carro.
2. Como un carro tiene llantas entonces existe una relaci�n 
entre la clase llanta y la clase carro.
3. En la clase llanta se deben crear atributos y 
un m�todo llamado calcular Di�metro que recibe como par�metro
un entero u un flotante (del tipo que usted prefiera) ese par�metro 
se llamar� radio, en este m�todo como su nombre lo indica se debe calcular 
el valor del radio de la llanta, este un proceso se realizar� con la variable 
de tipo local y se debe mostrar el valor del di�metro, y con la variable de 
instancia (usando el this), tambi�n mostrar el valor 
del di�metro en este caso.
*/
package Exercise2;

public class car  {

	public static void main(String[] args) {
		tire tire1 = new tire();
		tire1.CalculateRadius();
		
	}

}


