package oppsConcept;

public  class concrete extends Incomplete {

	@Override
	public void demo() {
		
		System.out.println("gaurav");
		
	}

	public static void main(String[] args) {
		
		concrete x = new concrete();
		x.demo();
		
		concrete.hello();
		
		
		
		
	}
}
