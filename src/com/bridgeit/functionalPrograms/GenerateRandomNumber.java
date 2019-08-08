package com.bridgeit.functionalPrograms;
import java.util.Random;

import com.bridgeit.utility.Utility;

public class GenerateRandomNumber {
	public static void main(String[]args)
	{
		Utility utility=new Utility();
		
		
		int RandomNumber1=0;
		int RandomNumber2=0;
		int SumOfRandomNumber=0;
		
				 		
		SumOfRandomNumber=Utility.RanNum(RandomNumber1,RandomNumber2, SumOfRandomNumber);
		System.out.println("Sum of Random Number= "+SumOfRandomNumber);
		
		
		
		
	}
}
