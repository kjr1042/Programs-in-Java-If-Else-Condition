// check if a given number is ASCII value of an lowercase alphabet or not
// ASCII of Uppercase a=97 to z=122

import java.util.Scanner;

public class lowerUppercaseASCII {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		if(n>=97 && n<=122)
		{
			System.out.println("Yes, " +"ASCII code of "+ n+ " is : "+(char)n);
		}
		else
		{
			System.out.println("No, " + "ASCII code of "+ n+ " is : "+(char)n);
		}

	}

}
