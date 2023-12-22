// smallest number among four integers

import java.util.Scanner;

public class smallestAmong4 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a= scan.nextInt();
		int b= scan.nextInt();
		int c= scan.nextInt();
		int d= scan.nextInt();
		int min1 =(a<b)?a:b;
		int min2=(c<d)?c:d;
		int res=(min1<min2)?min1:min2;
		System.out.println(res);

	}

}
