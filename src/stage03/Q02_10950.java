package stage03;

import java.util.Scanner;

public class Q02_10950 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);        

		int A, B;
		int T = scan.nextInt();

		for ( int i = 0; i < T; i++ ) {
			A = scan.nextInt();
			B = scan.nextInt();
			System.out.println(A + B);
		}

		scan.close();
	}

}
