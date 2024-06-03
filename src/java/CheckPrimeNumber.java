package Day1;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		int n=8;
		String msg="it is a prime number";
		
		for(int i=2;i<=10;i++)
		{
			if(n%2==0)
			{
				msg="not a prime number";
			}
		}
		System.out.println(msg);
	}
      
}