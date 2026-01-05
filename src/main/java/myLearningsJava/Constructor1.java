package myLearningsJava;

public class Constructor1 {
	
	
int x;
String s;
	


	public Constructor1() {
		this.x=100;
		this.s="hello im learning java ";
	}

	public void learner(int x) {
		System.out.println(x);
		
	}

	public void learner(String s) {
		System.out.println(s);

	}
	
	public static void main(String[] args) {
        Constructor1 test1 = new Constructor1(); // Calls constructor with int
        Constructor1 test2 = new Constructor1(); // Calls constructor with String
        test1.learner(test1.x);
        test2.learner(test2.s);
				
	}
	
	
}
