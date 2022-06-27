package practiceJAVA;

public class Method_OverLoading {
	
	public void demo() {
		
		System.out.println("hi");

	}

	public void demo(int a) {
		
		System.out.println("hello");

	}

	public void demo(char b) {
		
		System.out.println("by");

	}

	
	public static void main(String[] args) {
		
		Method_OverLoading x = new Method_OverLoading();
		x.demo();
		x.demo(1);
		x.demo('&');
		
	}
	
	
	
	
	
	
	
	
}
