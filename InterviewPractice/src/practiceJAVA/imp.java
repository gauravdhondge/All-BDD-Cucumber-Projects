package practiceJAVA;

public class imp implements Python {

	
	public void demos() {
	
	System.out.println("jayesh");	
		
	}

	
	public void demonstrate() {
		
		System.out.println("gaurav");
		
	}
	
	public void gaurav() {
		
		System.out.println("madhuri");
	}
	
	
	public static void main(String[] args) {
		
		imp a = new imp();
		a.demonstrate();
		a.demos();
		a.gaurav();
		
		System.out.println(imp.a);
		
		
	}
	
	
	
	
	
	

}
