package com.tt.java;

public class Class_2_If_ElseStatement_Operators {

	public static void main(String[] args) {

		// If Else Statement

		int age = 105;

		if (age < 13) {
			System.out.print("You are a Children");
		} else if (age > 13 && age < 18) {
			System.out.println("You are a Teenager");
		} else if (age > 60) {

			// Nested if else Statement

			if (age > 100) {
				System.out.println("You are a Hero");
			} else {
				System.out.println("You are a senior");
			}

		} else {
			System.out.println("You are an adult");
		}
	}
}
