package classobjectmethod;

import classobjectconstructor.House;

public class UseCalculator {

	public static void main(String[] args) {
		
		//object: is an instance of a class
		//syntax: className objectName = new ClassName();
		
		Calculator cal =new Calculator();
		
		int myTotal = cal.addition();
		System.out.println(myTotal);
		
		double mySurface = cal.surface(25.5,36.0);
		System.out.println(mySurface);
		
		int myTemp = cal.cToF(23);
		System.out.println(myTemp);
		
		//String myName = cal.myName();
		//System.out.println("Hi " + myName + ", welcome to java class");
		
		//String myName2 = cal.myName();
		//System.out.println("Hi " + myName2 + ", welcome to java class");
		
		//String myName3 = cal.myName();
		//System.out.println("Hi " + myName3 + ", welcome to java class");
		
		cal.subtraction();
		
		cal.addition(25,25);
		cal.addition(7,2);
		cal.addition(25,25);
	
		House myHouse = new House();
		
		House house1 = new House("new House");

	}

}
