package com.test.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		// capture input from the user
		Scanner sc = new Scanner(System.in);
		
		try {

			System.out.println("Enter first numbers: ");

			// capture input here
			double num1 = sc.nextDouble();
			System.out.println("Enter second number: ");
			double num2 = sc.nextDouble();

			System.out.println("Please enter the operation you want to perform (+, -, *, /)");

			char operation = sc.next().charAt(0);

			Calculator calc = new Calculator();
			double result = calc.performCalculation(num1, num2, operation);

			// print the final result
			System.out.println(num1 + " " + operation + " " + num2 + " = " + result);

		} catch (Exception e) {
			e.getMessage();
		} finally {
			if (sc != null)
				sc.close();
		}

	}
}
