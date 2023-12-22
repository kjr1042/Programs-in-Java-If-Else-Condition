//Check whether the given number is three digit number or not and multiple of 5 or not
import java.util.Scanner;

public class threedigitnumberAndMultipleOf5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		if((n>=100 &&n<=999) && n%5==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}


	}

}
