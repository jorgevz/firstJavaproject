package firstjava;

import java.util.Scanner;

public class unitcoversion {
	 public static void conversion (double inch) {
		 double meter = 0.0254;
		 double solution = inch * meter;
		 System.out.println(solution);
	 }
	public static void main (String[] args) {
		System.out.println("How many inches would you like to convert? ");
		Scanner convert  = new Scanner(System.in);
		double inch = convert.nextDouble();
		
		conversion(inch); 
		
		
		
		
}
}