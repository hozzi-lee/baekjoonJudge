package stage02;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {

		/*
		시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 */

		Scanner scan = new Scanner(System.in);
		int point = scan.nextInt();


		if ( point > 100 || point < 0 ) {
			System.out.println("input error");
		} else if ( point > 89 ) {
			System.out.println("A");
		} else if ( point > 79 ) {
			System.out.println("B");
		} else if ( point > 69 ) {
			System.out.println("C");
		} else if ( point > 59 ) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		scan.close();
	}

}
