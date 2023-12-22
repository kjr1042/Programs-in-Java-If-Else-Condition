// check if a given number is ASCII value of an Uppercase alphabet or not
// ASCII of Uppercase A=65 to Z=90
import java.util.Scanner;

public class CheckUppercaseASCII {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		if(n>=65 && n<=90)
		{
			System.out.println("Yes, " +"ASCII code of "+ n+ " is : "+(char)n);
		}
		else
		{
			System.out.println("No, " + "ASCII code of "+ n+ " is : "+(char)n);
		}
		

	}

}
