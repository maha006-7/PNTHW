package classobjectconstructor;

public class House {

	//variables
	int address;
	String houseName;
	private char unit;
	
	//constructor is implicitly involved
	//built constructors
	House(String houseName){
		this.houseName  = houseName;
	}
	public House(String houseName, int address){
		this.houseName = houseName;
		this.address = address;
	}
	
	public House(){//default constructor provided by java
		
	}
	
	//methods are explicitly involved
	void kitchen() {
		System.out.println("miam miam eat the whole day");
	}
	
	private void room() {
		System.out.println("sleep zzzzzz");
	}
	
	void bathroom() {
		System.out.println("shower shower lalalala");
	}
}
