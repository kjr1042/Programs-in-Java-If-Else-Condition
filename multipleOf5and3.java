//Check whether the given number is multiple of 3 and 5
import java.util.Scanner;

public class multipleOf5and3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		if(n%3==0 && n%5==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
