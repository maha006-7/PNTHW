package abstraction;

public class Toyota implements Car, Motor {
	
	public void start() {
		System.out.println("turn the key to start");
	}
	
	public void stop() {
		System.out.println("brake and stop");
	}
	
	public void engine() {
		System.out.println("v6");
		
	}
	
	public void fuel() {
		System.out.println("diesel");
	}
	

}
