//Check whether the given number is multiple of 5 or not
import java.util.Scanner;

public class multiplesOf5 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int number =scan.nextInt();
		
		if(number%5==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
