package com.tt.java;

public class Class_2_SwitchCase {

	public static void main(String[] args) {

		int day = 7;

		switch (day) {

		case 1:

			System.out.println("Monday");

			break;

		case 2:
			System.out.println("Tuesday");
			break;

		/*
		 * How can you bring all seven cases after just type first two cases?
		 * 
		 */
		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;
		}
	}
}
