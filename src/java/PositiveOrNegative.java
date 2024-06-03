package java;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=sc.nextInt();
		if (i>0)
		{
			System.out.println("The number is positive number");
		}
		else if(i<0)
		{
			System.out.println("The number is negative");
		}

		else
		{
			System.out.println("i is zero");
		}
		

	}

}
