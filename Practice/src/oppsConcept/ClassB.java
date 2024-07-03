package oppsConcept;

public class ClassB extends ClassA  {

	
public void velocity() {
	
System.out.println("gaurav2");	

super.velocity();
	
}



 
public static void main(String[] args) {
	
	
	
	ClassB.demo();
	ClassB.demo(0);
	ClassB x = new ClassB();
	x.velocity();
	x.demo();
	x.demo('@');
	x.demo(1);
	
	
}
}
	
	
	











