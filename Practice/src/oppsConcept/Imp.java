package oppsConcept;

public class Imp implements Velo {

	@Override
	public void jayu() {
		
		System.out.println("gaurav");
		
	}
	
	public void gau() {
		
		System.out.println("hello HIIII");
	}

	public static void main(String[] args) {
		
		Imp i = new Imp();
		i.jayu();
		
		System.out.println(Imp.a);
		
		i.gau();
		
		
		int b = 20;
		double c;
		
		c=b;
		
		System.out.println(c);
		
	double ab = 34.66677;
	
	
	 int f = (int) ab;
	
		System.out.println(f);
		
		
	}

}
