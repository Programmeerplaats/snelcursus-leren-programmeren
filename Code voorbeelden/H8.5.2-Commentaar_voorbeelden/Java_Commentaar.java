/**  
* Dit programma in Java geeft kleding advies 
* op basis van de temperatuur 
*/  
public class MyClass {    
	public static void main(String args[]) {    
			
		// Variabele initialiseren    
		int temperatuur = 19;    
			
		/* If-else statement waarin check wordt gedaan of gebruiker  
		zomerkleren kan aandoen */    
		if (temperatuur > 20) {    
			System.out.println("Trek je zomerkleren maar aan!");    
		}    
		else {    
			System.out.println("Wacht nog even met het aantrekken van je zomerkleren");    
		}    
	}    
}