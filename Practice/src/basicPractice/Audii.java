package basicPractice;

public class Audii implements Car {

	@Override
	public void chintamani() {
		
		System.out.println("mumbai");
	}


	
	@Override
	public void speed() {
		
		System.out.println("seed");
	}



	public static void main(String[] args) {
		
		Audii x = new Audii();
		x.speed();
		x.chintamani();
		System.out.println(Audii.a);
		
		
	}
	
	
}
