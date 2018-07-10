
public class Vault {

	
	private int secretCode;
	
	Vault(int code){
		
		this.secretCode = code;
		
	}
	
	


	
	boolean tryCode(int test) {
		
		
		
		if(test == secretCode) {

			return(true);
			
		} else {
			

			return(false);
			
		}
		
	}
	
	
	
}
