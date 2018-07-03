
public class TeaRunner {

	public static void main(String[] args) {
		
		TeaBag tea = new TeaBag("mint");
		Kettle weez = new Kettle();
		Cup cup = new Cup();
		weez.boil();
		
		cup.makeTea(tea, weez.getWater());
		
	}
	
	
	
}
