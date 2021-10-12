package com.tt.java;

public class Class_2_Loops {
	
	/* Types of Loop
	 
	 1. For Loops
	 2. While Loop 
	 3. Do While Loop
	 4. Infinite Loop
	 */
	
	/* Initialization of variables */ ; /*Conditions to test*/ ; 
	/* Increment(s) or decrement(s) of variables */

		   
	public static void main(String[] args) {
		practiceForLoop();
		practicewhileLoop1();
		practicedowhileLoop1();
		practiceInfinteLoop();
		practiceNestetedForLoop();
	}

	public static void practiceForLoop() { 						// Example : Walking my garden 10 round
		int i; 													// Initialize variable
		for (i = 1; i <= 10; i++) { 							// Setting lower and Upper limit, Increment/ Decrement
			System.out.println("For Loop Number=" + i); 		// Conditional statement
		}
		    }
		 




public static void practicewhileLoop1(){  				//  When you don't know specific limit , Example: You walk around the garden 
										 				// as long as you get tired
									      
														// While Loop - Do again and again until until condition get filled
										
	
		   int i=1;
	       while (i <= 10)  {          					//  Setting the condition
	    	   
	             System.out.println(" While Loop Number=" + i); // Example: you keep walking around garden  until your wife call u.
	             i ++;
	       }
	    }


public static void practicedowhileLoop1(){                // Do action first then match the condition
														// Example: I am walking by the garden first then listen to wife.

	
    int i=1;
     do {
          System.out.println(" While Loop Number=" + i);
          i ++;
     } while (i<10);
    }



public static void  practiceInfinteLoop(){		// Infinite Loop - Loops which never ends
		int i = 1;
			for (i = 1; ; i++) { 
				System.out.println("Infinte Loop Number=" + i);
			}
}
public static void practiceNestetedForLoop(){ 
    int i;
    int j ;
    for (i = 1; i <= 10; i++) {
    	for (j = 1; j <= 10; j++) {
          System.out.println("Nested For Loop Number=" +i  + j);
    }
    	System.out.println("Increase value of i ->");
 }
}
}

