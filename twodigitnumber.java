//Check whether the given number is two digit number or not

import java.util.Scanner;

public class twodigitnumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		if(n>=10 &&n<=99)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}


	}

}
