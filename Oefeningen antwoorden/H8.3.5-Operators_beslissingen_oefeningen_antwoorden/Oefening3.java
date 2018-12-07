public class MyClass {  
	public static void main(String args[]) {  
		  
		String bibliotheek = "biblioteek";  
		  
		switch(bibliotheek) {  
			case "bibliotheek":  
				System.out.println("Helemaal goed gespeld! Keurig!");  
				break;  
			case "biblioteek":  
				System.out.println("Bijna goed, kijk nog eens goed naar je spelling.");  
				break;  
			case "bibiotheek":  
				System.out.println("Bijna goed, kijk nog eens goed naar je spelling.");  
				break;  
			case "biblotheek":  
				System.out.println("Bijna goed, kijk nog eens goed naar je spelling.");  
				break;  
			default:  
				System.out.println("Deze spelling lijkt er niet echt op, probeer het nog eens.");  
		}  
	}  
}