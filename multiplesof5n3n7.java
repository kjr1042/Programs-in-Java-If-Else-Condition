//Check whether the given number is multiple of 3,5 and 7 
// input : 105 ,output:yes
//input : 14 ,output: No
import java.util.Scanner;

public class multiplesof5n3n7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		if(n%3==0 && n%5==0 && n%7==0)//(n%15==0 && n%7==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
