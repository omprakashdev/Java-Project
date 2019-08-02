/****************************************************************************** 
 *  Purpose: Addition of 2 integers
 *
 *  @author  Om Prakash
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgeit.functionalPrograms;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class AddNumbers {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		int firstNumber, secondNumber, resultOfSum;
		System.out.println("We need to add 2 numbers");
		
		System.out.println("Enter your first number");
		firstNumber = scanner.nextInt();
		
		System.out.println("Enter your second number");
		secondNumber = scanner.nextInt();
		
		resultOfSum = utility.additionOfNumbers(firstNumber, secondNumber);
		System.out.println("Addition of the 2 numbers are: " + resultOfSum);

		scanner.close();
	}
}


