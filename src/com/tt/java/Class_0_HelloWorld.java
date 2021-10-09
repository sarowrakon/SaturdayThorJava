package com.tt.java;

public class Class_0_HelloWorld {
	public static void main(String arges[]) {
		System.out.println("Hello World");
	}

public static int income = 120000;
private static String city = "Austin";
protected static boolean isNy = false;

static Class_0_HelloWorld myObj = new Class_0_HelloWorld();


public static void akon(){
	income = 135000;
	city = "Saint Luis";
	isNy = false;
	System.out.println("Akon income is : "+ income +", He lives in : "+ city +", NY State : "+isNy);
}

public void rubbayah(){
	income = 120000;
	city = "Farmingville";
	isNy = true;
	System.out.println("Rubbayah income is : "+ income +", He lives in : "+ city +", NY State : "+isNy);
}

public static String safi(){
	income = 135000;
	city = "Prospect Park";
	isNy = false;
	System.out.println("Safi income is : "+ income +", He lives in : "+ city +", NY State : "+isNy);
	return "I am a SDET";
}


}

