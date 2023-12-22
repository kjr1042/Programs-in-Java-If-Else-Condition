// smallest number among three integers

import java.util.Scanner;

public class smallestAmong3 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a= scan.nextInt();
		int b= scan.nextInt();
		int c= scan.nextInt();
		int min1 =(a<b)?a:b;
		int min2=(min1<c)?min1:c;
		System.out.println(min2);

	}

}
