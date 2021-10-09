package com.tt.java;

public abstract class Class_1_AccessModifiers_DataTypes_Variablejava {


		// Access Modifiers
public int age = 35;
private String car = "BMW";
protected boolean IsNice = true;
int sun = 50;

	// Non Access Modifiers
static String city = "NYC";
final String city2 = " Buffelo";
abstract void district ();

public static void myMethod(String color, int door) {
	int doorEstimate = door+2;
	System.out.println("car door : " + doorEstimate);
	System.out.println ("Car Color ; "+ color);
}
public static void main (String[]arges){
	myMethod("Green", 2);
	myMethod ("Blue", 4);
	myMethod ("Red",6);
	
	
	
	}

}
