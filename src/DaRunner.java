import java.util.Random;

import javax.swing.JOptionPane;

public class DaRunner {

	Random randy = new Random();
	
	
	
	JamesBond james = new JamesBond();
	Vault vaulty = new Vault(randy.nextInt(10000000));
	
	
	
	public static void main(String[] args) {
		
		
		
		DaRunner runner = new DaRunner();
		
		runner.setUp();
		
		
	}
	
	void setUp() {
		
		james.findCode(vaulty);
		
	}
	
}
