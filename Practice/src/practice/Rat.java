package practice;

public class Rat implements Cat {

	@Override
	public void demo() {
		System.out.println("demo");
		
	}

	@Override
	public void test() {
		
		System.out.println("test");

	}

	
	 public void tested() {
		
		System.out.println("implement");
	}
	
	
	public static void main(String[] args) {
		
		Cat x = new Rat();
		x.demo();
		x.test();
		x.tested();
		
		
		
	}
}
