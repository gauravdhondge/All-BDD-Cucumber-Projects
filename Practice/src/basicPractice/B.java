package basicPractice;

public class B extends A {
	
public void one () {
		
		System.out.println("onetwo");
		super.one();
		
	}
	

public void two () {
		
		System.out.println("twothree");
	}


public static void demo() {
	
	System.out.println("B");
}


public static void main(String[] args) {
	
	A.demo();
//	A x = new B();
//	x.one();
//	x.two();
	
}




}
