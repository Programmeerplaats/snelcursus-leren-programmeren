public class MyClass {  
	public static void main(String args[]) {  
		  
		String voornaam = "Tim";  
		String achternaam = "Boer";  
		int leeftijd = 29;  
		String woonplaats = "Rotterdam";  
		  
		if (voornaam != null && achternaam != null && leeftijd >= 18 && woonplaats != null) {  
			if(woonplaats == "Rotterdam") {  
				System.out.println("De drank wordt dezelfde dag nog bij je bezorgd!");  
			}  
			else {  
				System.out.println("De drank wordt de volgende dag bezorgd!");  
			}  
		}  
		else if(voornaam == null || achternaam == null || woonplaats == null) {  
			System.out.println("Vul alle velden in om door te gaan met je bestelling.");  
		}  
		else if (leeftijd < 18) {  
			System.out.println("Je bent helaas nog te jong om drank te bestellen, vanaf 18 jaar kan dit pas.");  
		}  
		else {  
			System.out.println("Er is helaas iets misgegaan met de bestelling, probeer het opnieuw.");  
		}  
	}  
}