package methodsConcepts;

public class StaticVariable {

	
	int x = 0;
	static int c = 0;
	
	
	public void example() {
		x++;
		c++;
	
		
		System.out.println("non static ="+ x);
		System.out.println("Static ="+ c);
	}
	
	public static void main(String[] args) {
		StaticVariable sv = new StaticVariable();
		sv.example();
		StaticVariable sv1 = new StaticVariable();
		sv1.example();
		
		
		
	}
	
	
}
