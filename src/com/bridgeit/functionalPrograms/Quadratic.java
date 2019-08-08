package com.bridgeit.functionalPrograms;
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number= ");
		int num1=sc.nextInt();
		System.out.println("Enter the second number= ");
		int num2=sc.nextInt();
		System.out.println("Enter the third number= ");
		int num3=sc.nextInt();
		int delta = 0,root1 = 0,root2 = 0;
		Utility utility=new Utility();
		System.out.println(delta);
		System.out.println(root1);
		System.out.println(root2);
		utility.Quad(delta,root1,root2);
		
		sc.close();

	}

}
