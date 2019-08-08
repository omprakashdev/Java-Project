package com.bridgeit.functionalPrograms;
import java.util.Scanner;
import com.bridgeit.utility.Utility;
import com.bridgeit.utility.Utility.utility;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
			
		System.out.println("Enter the date");
		int day=scanner.nextInt();
		System.out.println("Enter the month");
		int month=scanner.nextInt();
		System.out.println("Enter the Year");
		int year=scanner.nextInt();
		//int x,year1,month1,
		
		int day1 = Utility.DOW(day,month,year);
		System.out.println(Utility.DOW(day,month,year));
		if(day1==0)
		{
			System.out.println("The Day is Sunday");
			
		}else if(day1==1)
		{
			System.out.println("The Day is Monday");
			
		}else if(day1==2)
		{
			System.out.println("The Day is Tuesday");
			
		}else if(day1==3)
		{
			System.out.println("The Day is Wednesday");
			
		}else if(day1==4)
		{
			System.out.println("The Day is Thrusday");
			
		}else if(day1==5)
		{
			System.out.println("The Day is Friday");
			
		}else if(day1==6)
		{
			System.out.println("The Day is Saturday");
			
		}
			
					
			//Utility.DOW(day,month,year);					
			scanner.close();

	}

}
