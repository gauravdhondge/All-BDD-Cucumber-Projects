package oppsConcept;

public class Imp implements Int {

	@Override
	public void demon() {
		
		System.out.println("hi");
		
	}

	@Override
	public void demos() {
		
		System.out.println("by");
		
	}
	
	 public  void delayed() {
	
		System.out.println("jay");
		
	}

	public static void main(String[] args) {
		
	Imp x = new Imp();
	x.delayed();
	x.demon();
	x.demos();
	
	System.out.println(x.a);
		
		
		
		
		
	}
	
	
	
	
}
