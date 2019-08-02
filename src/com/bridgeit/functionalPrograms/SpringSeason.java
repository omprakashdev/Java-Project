package com.bridgeit.functionalPrograms;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class SpringSeason {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Utility utility=new Utility();
			System.out.println("Enter day= ");
			int day=sc.nextInt();
			System.out.println("Enter month= ");
			int month=sc.nextInt();
			utility.SpringS(day, month);
			sc.close();
		}
}
