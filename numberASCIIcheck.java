// check if a given number is ASCII value of an numeric character or not
// ASCII of Number: 0=48 to 9=57

import java.util.Scanner;

public class numberASCIIcheck {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		if(n>=48 && n<=57)
		{
			System.out.println("Yes, " +"ASCII code of "+ n+ " is : "+(char)n);
		}
		else
		{
			System.out.println("No, " + "ASCII code of "+ n+ " is : "+(char)n);
		}


	}

}
