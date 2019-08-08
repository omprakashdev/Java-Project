package com.bridgeit.functionalPrograms;
import com.bridgeit.utility.Utility;

public class WindChill {
	public static void main(String[]args)
	{
		
		double result=0;
		double t=Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);
		//double w;
		result=Utility.WinChill(v,t);
		System.out.println("Wind chill= "+result);
	}

}
