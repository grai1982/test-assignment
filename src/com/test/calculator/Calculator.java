package com.test.calculator;

public class Calculator {

	public double performCalculation(double num1, double num2, char operation) {

		double res = 0;

		switch (operation) {
		case '+': {
			res = num1 + num2;
			break;
		}
		case '-': {
			res = num1 - num2;
			break;
		}
		case '*': {
			res = num1 * num2;
			break;
		}
		case '/': {
			res = num1 / num2;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operation);
		}

		return res;
	}
}
