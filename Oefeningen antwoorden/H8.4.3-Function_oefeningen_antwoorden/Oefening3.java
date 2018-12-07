public class MyClass {  
	public static void main(String args[]) {  
		String voornaam = "Jan";  
		String achternaam = "Broek";  
		int leeftijd = 29;  
  
		checkFormulier(voornaam, achternaam, leeftijd);  
	}  
	  
	static void checkFormulier(String voornaamGebruiker, String achternaamGebruiker, int leeftijdGebruiker) {  
		if(voornaamGebruiker == "" || achternaamGebruiker == "" || leeftijdGebruiker == 0) {  
			System.out.println("Je hebt niet alle velden ingevuld in het formulier, vul aub alle velden in.");  
		}  
		else {  
			System.out.println("Het formulier is succesvol verzonden!");  
		}  
	}  
}