package firstjava;

public class multiplyoutput {
 public static void main (String[] args) {
	 
	 /*the user here is able to put any number they choose to get the 
	  * result for, however i inputed these numbers here just to 
	  * show an example of where the numbers can be put at.
	  */
	 
	 int userinput1  = 7 ;
	 int userinput2 = 9 ;
	 
	 /*these are my conditions, the conditions are set so that no matter
	  * what the user's input is, they will always get their answer like if using a calculator.
	  */
	 
	 
	 if (userinput1 <= userinput2 ) {
	 System.out.println(userinput1 * userinput2);
	 }  
	 
	 if (userinput2 <= userinput1) {
		 System.out.print(userinput1 * userinput2);
	 }
	
	 
 }
}


