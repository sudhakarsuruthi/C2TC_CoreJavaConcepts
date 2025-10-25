package day11.v1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		try (Scanner var = new Scanner(System.in)) { 
		int startIndex, endIndex;
		String message,str;
		System.out.println("Enter the message: ");
		message=var.nextLine();
		System.out.println("Enter the start index and end index: ");
		startIndex=var.nextInt();
		endIndex=var.nextInt();
		str=message.substring(startIndex, endIndex);
		System.out.println("The extracted message is: "+ str);
	
	}catch(StringIndexOutOfBoundsException ae) {
		System.err.println("Error! Invalid index ");
	
	}catch(InputMismatchException ae) {
		System.err.println("Error! Invalid input ");
	}
		
	}

}