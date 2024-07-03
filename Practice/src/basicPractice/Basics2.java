package basicPractice;

public class Basics2 extends Basics {
	

public void demo() {
		
		System.out.println("cat");
	    super.demo();
 }
	
	
public void start() {
		
		System.out.println("mouse");
	}
	

public static void velocity() {
	
	System.out.println("Intellij");
}
	
	
	public static void main(String[] args) {
		
		
//		Basics2 x = new Basics2();
//		x.demo();
//		x.start();
		Basics2.velocity();
		Basics.velocity();
		
//		Basics y = new Basics2();
//		y.velocity();
		
		
	}

}
