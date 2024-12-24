package com.creatio.crm.language.basics;

import java.util.logging.logger;
public class HelloWorld {

	public static void main(String[] args) {
		//Print the data and ends with new line
		System.out.println("Hello World");
		
		//Print the data and stay on same line
		System.out.print("Hello");
		System.out.print("Wold");
		
		System.out.print("India");
		System.out.println();
		
		//Print statements to print with specific format
		System.out.printf("My name is %s and My age is %d and having visa status is %b.%n","Priyanka",29, true);
		
	//Print statements to print explicit format of digits
		System.out.format("Pi value is approx %.2f",3.14159);
		System.out.println();
		
		//Print the char based on ASCII
		System.out.write(65);
		System.out.println();
		
		//Print the error message
		System.err.println("Error while converting ASCII to normal char");
		
		//Print informational message along with time stamp
		Logger.getlogger("Mylogger").info("Error while converting ASCII to normal char");
	}

}
