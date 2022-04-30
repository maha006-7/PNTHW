package classobjectconstructor;

public class UseHouse {

	public static void main(String[] args) {
		
		House myHouse = new House("white house", 123);
		
		myHouse.room();
		
		House yourHouse = new House("the mellenium");
		yourHouse.bathroom();
		
		House theHouse = new House();
		theHouse.bathroom();

	}

}
