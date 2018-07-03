
public class Minion {

	private String name;
	private int eyes;
	private String color;
	private String master;
	
	Minion(String name,int eyes, String color, String master){
		
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
		
		
	}
	
	int getEyes() {
	
		return eyes;
	
	}
	
	String getName() {
		
		return name;
	
	}
	
	String getColor() {
		
		return color;
	
	}
	
	void setMaster(String master) {
		
		this.master = master;
		
	}
	
	String getMaster() {
		
		return master;
		
	}
	
}