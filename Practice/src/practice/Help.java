package practice;

public class Help {
	
	
	static int a = 20;
	static int b = 30;
	int c = 34;
	int d = 28;
	
	
	
	
	
public static final void demo(int a) {
		
		System.out.println("jayeshgaurav");
		
}

public final void demo(char b) {
	
	System.out.println("gaurav");
}	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(Help.a);
		System.out.println(Help.b);
		
		Help x = new Help();
		System.out.println(x.c);
		System.out.println(x.d);
		
		Help.demo(1);
		
		
		x.demo('&');
		
		
	}
	
	public static void main(int a) {
		
		Help.demo(a);
		
		System.out.println(Help.a);
		System.out.println(Help.b);
		
	}
	
	
	
	
	

}
