//Check whether the given two number is even or not , if even print product otherwise sum

import java.util.Scanner;

public class multiplicationAndAddition {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a= scan.nextInt();
		int b= scan.nextInt();
		if(a%2==0 && b%2==0)
		{
			System.out.println(a*b);
		}
		else
		{
			System.out.println(a+b);
		}

	}

}
