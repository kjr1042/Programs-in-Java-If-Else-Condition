//Check whether the given number is positive or not 

import java.util.Scanner;

public class positiveOrNegative {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n= scan.nextInt();
		if(n>0)
		{
			System.out.println("Positive");
		}
		else if(n==0)
		{
			System.out.println("Zero");
		}
		else
		{
			System.out.println("Negative");
		}

	}

}
