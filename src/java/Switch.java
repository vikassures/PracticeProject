package Day1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the option");
		int option=sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("you selected english");
			
			break;
		case 2:
			System.out.println("you selected kannada");
			
			break;
		case 3:
			System.out.println("you selected hindi");
			
			break;
		}
	}

}
