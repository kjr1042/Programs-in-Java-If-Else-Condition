import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the value :");
		int number =scan.nextInt();
		if(number%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		

	}

}
