package com.bridgeit.functionalPrograms;


import com.bridgeit.utility.Utility;

public class LeapYear {
	public static void main(String[]args)
	{
		Utility utility=new Utility();
		System.out.println("Enter the Year");
		int year=Utility.IntegerInput();
		utility.leapyear(year);
		
		System.out.println(year);
			
	}
}
