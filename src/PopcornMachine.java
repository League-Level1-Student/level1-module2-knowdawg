
public class PopcornMachine {

	
	public static void main(String[] args) {
		
		Microwave micro = new Microwave();
		Popcorn popy = new Popcorn("popcorny");
		micro.putInMicrowave(popy);
		micro.setTime(2);
		micro.startMicrowave();
		popy.eat();
			
		
		
		
		
	}
	
}
