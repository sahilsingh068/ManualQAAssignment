package com.calculator;

import java.util.Scanner;

public class OperatorCalculator {
	public static double calculator(double num1, char operator, double num2) {
        double result = 0.0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    // Division by zero
                    result = 0;
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        return result;
    }

	public static void main(String[] args) {
		// scanner is used to take input
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = calculator(num1, operator, num2);
        System.out.println("Result: " + result);

        scanner.close();
	}

}
