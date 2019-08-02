/****************************************************************************** 
 *  Purpose: It is a utility class where the logics of all other programs
 *           are written. This is done so that most of the code can be reused.
 *
 *  @author  Om Prakash
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgeit.utility;

import java.util.Scanner;

public class Utility {

	/**
	 * Purpose: This method is used to add 2 integers
	 * 
	 * @param  firstNumber:  the first integer
	 * @param  secondNumber: the second integer
	 * @return result:       the addition of 2 integers
	 */
	public int additionOfNumbers(int firstNumber, int secondNumber) {
		int result;
		return result = firstNumber + secondNumber;
	}

	//Integer operational procedure program

	public void operation1(int num1, int num2, int num3) {
		
		

		int result1=num1+num2*num3;
		int result2=num1*num2+num3;
		int result3=num3+num1/num2;
		int result4=num1%num2+num3;
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
		
	}


//Double operational procedure program
public void Dopreational(double num1,double num2,double num3)
{
		double result1=num1+num2*num3;
		double result2=num1+num2*num3;
		double result3=num3+num1/num2;
		double result4=num1%num2+num3;
		
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);

}
//To find a it is leap year or not
public int leapyear(int year)
{
	if(year>=1582)
	if((year%400==0 &&year%100==0)||(year/4==0))
	
		System.out.println(year+"It is leap year");
	
	else 
	
		System.out.println(year+"It is not Leap year");
	
	else 
		System.out.println(year+"INVAILD YEAR");
	return year;
	
	
	
}
static Scanner scanner=new Scanner(System.in);
public static int IntegerInput()

{
	@SuppressWarnings("unused")
	int IntegerValue=scanner.nextInt();
	return IntegerInput();
}



//program for spring season
public int SpringS(int day,int month)
{
	if(month>3&&month<=6)
	{
	switch(month)
	{
	case 3://march
		int m3[]= {20,21,22,23,24,25,26,27,28,29,30,31};
			for(int i=0;i<=11;i++)
			{
			if(day==m3[i])
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("False");
			}}
			break;
	
	case 4://April
		int m4[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
			for(int i=1;i<30;i++)
			{
			if(day==m4[i])
			{
				System.out.println("true");
			}
			break;
			}
	case 5://May
		int m5[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
			for(int i=1;i<31;i++)
			{
		if( day==m5[i])
		{
			System.out.println("true");
		}
		break;
			}

	case 6://June
		int m6[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for(int i=1;i<20;i++)
		{
		if(day==m6[i])
		{
			System.out.println("true");
		}
		break;
		}
		}
	  }
	else
	{
		System.out.println("Invalid Day or month");
	}
		return 0;
	}
}

	

