// Largest number among three integers

import java.util.Scanner;

public class largestAmongFour {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a= scan.nextInt();
		int b= scan.nextInt();
		int c= scan.nextInt();
		int d= scan.nextInt();
		int max1 =(a>b)?a:b;
		int max2=(c>d)?c:d;
		int res=(max1>max2)?max1:max2;
		System.out.println(res);

	}

}
