import java.util.Scanner;

import com.sun.org.apache.bcel.internal.classfile.Method;
/**
 * Andrew Howard
 * 
 * Basketball stats program
 *
 */
public class integration {

	public Scanner scan; {
	/**
	 * @param args
	 */
	}
	
	public static void main(String[] args) {
		
		demoMethods();   //This is a call, what's inside the parenthesis of a call is an argument.
		
		dataDemo();	// Calling my data type demo
		
	}
	
	public static void dataDemo() {
		
		dataTypes dataTypesObject = new dataTypes();
		dataTypesObject.numbers();
		
		
	}
	
	public static int add(int a , int b) {
		
		/*A method to add 2 numbers together, "int a" and "int b" are parameters
		for when the method is called.*/
		
		int sum = a + b;
		return sum;
	}
	
	public static void demoMethods() {
		
		int num1 = 10;
		int num2 = 6;
		double result = (double) num1 / num2;
				
		System.out.println("Hello World! " + result ); 
		
		/*demo of main calling a method, adding numbers 
		concating strings, and printing.*/
		
		int n1n2 = add( num1 , num2); //n1n2 is num1 + num2
		
		/*This calls the previously mentioned "add" Method. "num1" and "num2" are arguments
		that will fit into the "int a" and "int b" parameters of add(int a, int b)*/
		
		System.out.println( "Adding 10 and 6 gives you " + n1n2 );
	
	}
	
}
 