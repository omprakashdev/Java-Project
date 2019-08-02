package com.bridgeit.functionalPrograms;
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class DoubleOpt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Utility utility=new Utility();
		System.out.println("Enter the 1st number= ");
		double num1=sc.nextDouble();
		System.out.println("Enter the second number= ");
		double num2=sc.nextDouble();
		System.out.println("Enter the third number= ");
		double num3=sc.nextDouble();
		utility.Dopreational(num1, num2, num3);
		sc.close();
	}

}
