//Quadratic program
package com.bridgeit.functionalPrograms;


public class demo2 {
	public static void main(String[]args)
	{
		int a=2,b=8,c=9;
		int delta=0;
		delta=b*b-4*a*c;
		int root1=(int) ((-b+Math.sqrt(delta))/(2*a));
		int root2=(int)((-b-Math.sqrt(delta))/(2*a));
		System.out.println(delta);
		System.out.println(root1);
		System.out.println(root2);
	}

}
