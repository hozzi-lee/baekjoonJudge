package stage01;

import java.util.Scanner;

public class Q11_2588 {
	public static void main(String[] args) {

		/* 
		(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

			iii - - - - (1)
		  x jjj - - - - (2)
		ㅡㅡㅡㅡ
		   yyyy - - - - (3)
		  llll  - - - - (4)
		 zzzz   - - - - (5)
	    ㅡㅡㅡㅡ
	  iii * jjj - - - - (6)

		(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		 */		

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();

		int AB01 = A * (B % 10);
		int AB02 = A * ( ( (B % 100) - (B % 10) ) / 10);
		int AB03 = A * (B / 100);

		int result = A * B;

		if ( 1000 > A && A > 99 && 1000 > B && B > 99 ) {
			System.out.println( AB01 );
			System.out.println( AB02 );
			System.out.println( AB03 );
			System.out.println( result );
		}
		scan.close(); 
	}
}
