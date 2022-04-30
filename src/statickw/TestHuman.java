package statickw;

public class TestHuman {

	public static void main(String[] args) {
		
		//access non static attributes: use the object
		Human human = new Human ();
		human.person1();
		
		//access static attribute: use the class name only
		Human.person2(); //to access a static method you need to use name of the class. the method, not the object
		
		

	}

}
