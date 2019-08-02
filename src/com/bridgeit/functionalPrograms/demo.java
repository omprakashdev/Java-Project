package com.bridgeit.functionalPrograms;
import java.util.Scanner;

public class demo {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day= ");
		int day=sc.nextInt();
		System.out.println("Enter month= ");
		int month=sc.nextInt();
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
		
		}
	}


			
		


