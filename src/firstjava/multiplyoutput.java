package firstjava;

import java.util.Scanner;

public class multiplyoutput {
	public static double outputs (double input1, double input2) {
		double result = input1 * input2;
		System.out.println(result);
		return result; 
	}
	public static void main (String[] args) {
		System.out.println("What's your first input ? ");
		Scanner solution = new Scanner (System.in);
		double input1 = solution.nextDouble();
		System.out.println("What's your second input ? ");
		double input2 = solution.nextDouble();
		
		double answer = outputs(input1, input2);
		
		System.out.println("Your result is: " + answer);
		
	
	}
}


