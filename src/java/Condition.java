package java;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
	//	int i=10,j=20;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the i value");
		int i=sc.nextInt();
		System.out.println("Enter the j value");
		int j=sc.nextInt();
		if(i<j)
		{
		System.out.println("Hi");
		}
		else
		{
		System.out.println("condition false");
		}

	}

}
