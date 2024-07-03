package practice;

public interface Cat {
	
	 void demo();
	
	void test();
	
	
	public static void QA() {
		
		System.out.println("testing");
	}
	
	
	int a = 10;
	
	public default void tested() {
		
		System.out.println("interface");
	}
	
	public static void main(String[] args) {
		
		Cat.QA();
		System.out.println(Cat.a);
		
	}
	
	
	
}
