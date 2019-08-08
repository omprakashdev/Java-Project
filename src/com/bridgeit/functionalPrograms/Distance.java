package com.bridgeit.functionalPrograms;
import java.util.Scanner;

import com.bridgeit.utility.Utility;
public class Distance {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter source= ");
		int sour=sc.nextInt();
		System.out.println("Enter Destination= ");
		int des=sc.nextInt();
		int distanceOfCor=0;
		
		distanceOfCor=(int) Utility.distance(sour,des);
		System.out.println(distanceOfCor);
		sc.close();
	}

}
