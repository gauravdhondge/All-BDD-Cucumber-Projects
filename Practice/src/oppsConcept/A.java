package oppsConcept;

public class MethodOverload {
	
	public void demo() {
		
		System.out.println("gm");
		
	}

	
public void demo(int a) {
		
		System.out.println("hello");
		
	}


public void demo(char b) {
	
	System.out.println("hello");
	
}


public static void main(String[] args) {
	
	MethodOverload x = new MethodOverload();
	x.demo();
	x.demo(1);
	x.demo('$');
}









	
	
	
}
