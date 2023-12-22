//Check whether the given number is three digit number or not and multiples of2,5,10
//input:140 ,output: yes
import java.util.Scanner;

public class threedigitnumberAndMultipleOf2n5n10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		if((n>=100 &&n<=999) && (n%2==0 && n%5==0 && n%10==0))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}


	}

}
