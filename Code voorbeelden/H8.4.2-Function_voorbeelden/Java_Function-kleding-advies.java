public class MyClass {  
	  
	public static void main(String args[]) {  
		int temperatuur = 19;  
		  
		kledingAdvies(temperatuur);  
	}  
	  
	public static void kledingAdvies(int temp) {  
		if (temp <= 10) {    
			System.out.println("Trek je winterkleren maar aan!");    
		}    
		else if (temp > 10 && temp <= 15) {    
			System.out.println("Een zomerjas is voldoende momenteel.");    
		}    
		else if (temp > 15 && temp <= 20) {    
			System.out.println("Zonder zomerjas is het goed te doen buiten!");    
		}    
		else if (temp > 20) {    
			System.out.println("Trek je zomerkleren maar aan!");    
		}    
		else {    
			System.out.println("Momenteel kunnen we u geen kledingadvies geven op basis van de temperatuur.");    
		}   
	}  
}