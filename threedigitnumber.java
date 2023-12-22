//Check whether the given number is three digit number or not
import java.util.Scanner;

public class threedigitnumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		if(n>=100 &&n<=999)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
