package conditions;

import java.util.Scanner;

public class ifStatement {

	public static void main(String[] args) {
		
		//capture use input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int x = sc.nextInt();
		
		
		if (x > 0) {
			System.out.println("this number is positive");
		} else if (x < 0 ) {
			System.out.println("this number is negative");

		} else {
			System.out.println("this number equals to 0");
		}

	}
	
	//if(condition){body}
	
	//if(condition){body} else if (condition) {body}...
	
	//if(condition){body} else {body}

}
