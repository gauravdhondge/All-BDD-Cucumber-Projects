package basicPractice;

public class Constructor {
	
	String model;
	String colour;
	String brand;
	int year;
	
	
public	Constructor(){
	
	System.out.println("Default constructor");
		
	}

public	Constructor(String model,int year){
	
	System.out.println("parameterized constructor");

	
}

public static void demo() {
	
	System.out.println("overload");
}

public static void demo(int a) {
	
	System.out.println("overloading");
}



public static void main(String[] args) {
	
	Constructor x = new Constructor();
	Constructor.demo();
	Constructor.demo(1);

}






}
