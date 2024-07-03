package basicPractice;

public class Concrete extends Abstract {

	@Override
	public void demo() {
		
		System.out.println("class");
		
	}

	@Override
	void bike() {
		
		System.out.println("motocycle");
		
		
	}

	public static void main(String[] args) {
		
		Abstract x = new Concrete();
		x.demo();
		x.bike();
		x.car();
		x.honda();
		x.hole();
		
	}
	
}
