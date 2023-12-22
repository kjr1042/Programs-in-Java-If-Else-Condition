//Check whether the given number is multiple of 10 or not
import java.util.Scanner;

public class multipleOf10 {

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
