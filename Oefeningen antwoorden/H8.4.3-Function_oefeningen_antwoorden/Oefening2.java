public class MyClass {  
	public static void main(String args[]) {  
		  
		int lengte = 178;  
		lengteCheck(lengte);  
	}  
	  
	static boolean lengteCheck(int lengteBezoeker) {  
		boolean check;  
		int minimaleLengte = 150;  
		if (lengteBezoeker > minimaleLengte) {  
			check = true;  
		}  
		else {  
			check = false;  
		}  
		System.out.println(check);  
		return check;  
	}  
}