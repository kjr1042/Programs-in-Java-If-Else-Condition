// Largest number among three integers

import java.util.Scanner;

public class largestAmongThree {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a= scan.nextInt();
		int b= scan.nextInt();
		int c= scan.nextInt();
		int max1 =(a>b)?a:b;
		int max2=(max1>c)?max1:c;
		System.out.println(max2);
	}

}
