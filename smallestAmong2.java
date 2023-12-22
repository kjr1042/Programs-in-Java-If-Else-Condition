// smallest number among two integers

import java.util.Scanner;

public class smallestAmong2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a= scan.nextInt();
		int b= scan.nextInt();
		//System.out.println((a<b)?a:b);
		if(a<b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}


	}

}
