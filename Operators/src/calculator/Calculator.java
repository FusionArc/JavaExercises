package calculator;

public class Calculator {

	public static void main(String[] args) {
		
		int add = addition(10, 25);
		int multiply = multiplication(10, 25);
		int subtract = subtraction(100,25);
		double divide = division(100, 25);

		
		System.out.println(add);
		System.out.println(multiply);
		System.out.println(subtract);
		System.out.println(divide);
	}
	
	public static int addition(int i, int j) {
		return i + j;
	}
	
	public static int subtraction(int i, int j) {
		return i - j;
	}
	
	public static int multiplication(int i, int j) {
		return i * j;
	}
	
	public static Double division(int i, int j) {
		return (double) i / j;
	}
}


//Calculator
//Create a method that accepts two integers as input, then returns an integer that is the sum of these two parameters. (Addition)
//Create the following additional three methods that each take two parameters:
//Multiplication - which takes two numbers and returns the product.
//Subtraction - which takes two numbers, then returns the result of the subtraction.
//Division - which takes two numbers, then returns the result of the division.
//Your division method may have returned the wrong result; 
//This is called a rounding error and is quite common in most languages.
//this is because we were using ints rather than doubles.
//Modify the division method so that it takes Double parameters and then return a Double, if not already.

