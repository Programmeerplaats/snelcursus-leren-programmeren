public class MyClass {  
	public static void main(String args[]) {  
		  
		int cijferNederlands = 8;  
		  
		switch (cijferNederlands)  
		{  
			case 1:  
				System.out.println("Je hebt er niet veel van gebakken, dit kan echt beter!");  
				break;  
			case 2:  
				System.out.println("Dit is absoluut te laag, je kan veel beter!");  
				break;  
			case 3:  
				System.out.println("Je had maar enkele vragen goed, heb je misschien bijles nodig?");  
				break;  
			case 4:  
				System.out.println("Dit is niet goed, maar met wat meer inzet kan je zeker volgende keer een voldoende halen.");  
				break;  
			case 5:  
				System.out.println("Je hebt maar net een onvoldoende gehaald, met iets meer inzet zit je aan een voldoende.");  
				break;  
			case 6:  
				System.out.println("Je hebt een voldoende! Probeer de volgende keer wel wat meer te oefenen om zo een hoger cijfer te halen.");  
				break;  
			case 7:  
				System.out.println("Keurig! Je hebt het goed gedaan. Misschien volgende keer voor een nog hoger cijfer gaan?");  
				break;  
			case 8:  
				System.out.println("Heel goed! Je snapt de stof goed zo te zien.");  
				break;  
			case 9:  
				System.out.println("Woow! Dit is supergoed! Je hebt alles goed onder de knie op enkele foutjes na.");  
				break;  
			case 10:  
				System.out.println("Wauw!! Je snapt alles helemaal goed! Misschien kan je andere klasgenoten helpen met jouw kennis?");  
				break;  
			default:  
				System.out.println("Er is iets misgegaan bij de invoer van het cijfer, we kunnen geen boodschap meegeven.");  
		}  
	}  
}