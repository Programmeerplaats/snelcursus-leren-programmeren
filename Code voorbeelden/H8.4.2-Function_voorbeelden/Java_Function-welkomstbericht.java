public class MyClass {  
	static String voornaam = "Henk";  
	  
	public static void main(String args[]) {  
		  
		welkomstbericht(voornaam);  
	}  
	  
	public static void welkomstbericht(String voornaamGebruiker) {  
		System.out.println("Welkom " + voornaamGebruiker + ", leuk dat je er bent!");  
	}  
}