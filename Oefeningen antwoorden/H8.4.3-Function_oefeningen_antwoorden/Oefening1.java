public class MyClass {  
	public static void main(String args[]) {  
		int getal1 = 25;  
		int getal2 = 10;  
		double getal3 = 5.5;  
  
		rekenmachine(getal1, getal2, getal3);  
	}  
	  
	static void rekenmachine(int getal1, int getal2, double getal3) {  
		double berekening = getal1 - getal2 + getal3;  
		System.out.println(berekening);  
	}  
}