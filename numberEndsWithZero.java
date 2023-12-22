//Check whether the given number ends with Zero or not

import java.util.Scanner;

public class numberEndsWithZero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		if(n%10==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}


	}

}
