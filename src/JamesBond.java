
public class JamesBond {

	int findCode(Vault vault) {
		
		for (int i = 0; i < 10000000; i++) {
			boolean isOpen;
			isOpen = vault.tryCode(i);
			
			//System.out.println(i);
			
			if(isOpen) {
			
			System.out.println(i);
			return(i);
			
			
			}
			
		} 
		
		System.out.println("YOU KILLED JAMES BOND!");
		return(-1);
		
		
	}
	
	
	
	
}
