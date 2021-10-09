package com.tt.java;

public class Class_2_Loops {
	/* Initialization of variables */ ; /*Conditions to test*/ ; 
	/* Increment(s) or decrement(s) of variables */

		   
	public static void main(String[] args) {
		practiceForLoop();
		practicewhileLoop1();
		practiceNestetedForLoop();
	}
	public static void practiceForLoop(){ 
		       int i;
		       for (i = 1; i <= 10; i++) {
		             System.out.println("For Loop Number=" +i);
		       }
		    }
		 




public static void practicewhileLoop1(){ 

	
	       int i=1;
	       while (i <= 10)  {
	             System.out.println(" While Loop Number=" + i);
	             i ++;
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
