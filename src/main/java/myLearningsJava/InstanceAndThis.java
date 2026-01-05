package myLearningsJava;

public class InstanceAndThis {

	
	int c;
	int num() {
		return c=100;
	}
	
	public void learning(int a, int b )
	{
		int c ;
		
		System.out.println(a+b+this.num());
	}
	
	
	
	public static void main (String [] args) {
		InstanceAndThis it = new InstanceAndThis() ;
		it.learning(10,10);
		
		
	}
	
	

	
}
