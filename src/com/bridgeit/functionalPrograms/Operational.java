package com.bridgeit.functionalPrograms;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Operational {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Utility utility = new Utility();
		System.out.println("Enter the 1st Number = ");
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd Number=  ");
		int num2=sc.nextInt();
		System.out.println("Enter the 3rd Number= ");
		int num3=sc.nextInt();
		
		
		utility.operation1(num1,num2,num3);
		
		
		sc.close();

	}

}
