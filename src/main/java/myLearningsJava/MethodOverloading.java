package myLearningsJava;

public class MethodOverloading {

	
	public static void main (String [] args) {
		
		
		MethodOverloading mo = new MethodOverloading();
		mo.exampleOverloading("any name ");
		mo.exampleOverloading(10);
		
	}
	
	
	
	private void exampleOverloading(String name) {
		System.out.println("Printing name " + name);
		
	}
	
	private void exampleOverloading(int number) {
		
		System.out.println("Printing number " + number);
		
		 
	}
	
	
	
}
