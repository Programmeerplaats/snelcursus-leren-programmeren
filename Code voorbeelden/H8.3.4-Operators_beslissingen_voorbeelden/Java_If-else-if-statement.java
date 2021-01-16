public class MyClass {  
	public static void main(String args[]) {  
		  
		int temperatuur = 19;  
		  
		if (temperatuur <= 10) {  
			System.out.println("Trek je winterkleren maar aan!");  
		}  
		else if (temperatuur > 10 && temperatuur <= 15) {  
			System.out.println("Een zomerjas is voldoende momenteel.");  
		}  
		else if (temperatuur > 15 && temperatuur <= 20) {  
			System.out.println("Zonder zomerjas is het goed te doen buiten!");  
		}  
		else if (temperatuur > 20) {  
			System.out.println("Trek je zomerkleren maar aan!");  
		}  
		else {  
			System.out.println("Momenteel kunnen we u geen kledingadvies geven op basis van de temperatuur.");  
		}  
	}  
}