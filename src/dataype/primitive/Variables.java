package dataype.primitive;

public class Variables {

	public static void main(String[] args) {
		
		//syntax: variableTyoe variableName = variableValue 
		
		//primitive variables
		//numbers
			//whole number
			byte b = 123; // 1 byte
			short s = 2345; // 2 bytes
			int x = 1234567890;// 4 bytes
			long l = 123451234567890L; // 8 bytes
			
			//variable declaration
			int i;
			//variable assignment
			i = 54; //we assign it after we declare the value
			// use descriptive names / camel case
			int ageOfTheDog = 25;
			
			//fractions
			float f = 1.234556F; // 4 bytes
			double d = 1.12345234567890; // 8 bytes
			
			//character
			char a1 = '1';// 2 bytes
			char a2 = '1';
			
			//boolean 
			boolean boo = true; // 1 bit (1/8 byte)
			
			
			
			
			System.out.println(ageOfTheDog);
			System.out.println(a1+a2);
			
			
			int n, k, p;
			
			
			
			//arithmetic operator: +, -, /, *, %, ++, --
			ageOfTheDog--;
			
			//assignment operator: =
			
			//comparison operators: < ,>, <=, >=, !=, ==
			System.out.println(10==9);
			
			
			//logical operators :&&, ||, !
			//java logic 
			System.out.println(10>9);
			
			String st = "my name is \"John\"";
			
			System.out.println("Hello \t World");
			
			//final variable : you cannot reassign a final variable 
			int age = 20;
			
			//age = 25; 
	}

}
