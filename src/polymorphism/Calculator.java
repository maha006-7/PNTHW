package polymorphism;

public class Calculator {

	public int add(int x, int y) {
		int total = x + y;
		return total;
	}
	
	//method overloading : use the same method name with different parameters
	public int sub(int x, int y) {
		int total = x - y;
		return total;
	}
	
	public int add(int x, int y, int z) {
		int total = x + y + z;
		return total;
	}
	
	
	}

