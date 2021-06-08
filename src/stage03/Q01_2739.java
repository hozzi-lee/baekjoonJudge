package stage03;

import java.util.Scanner;

public class Q01_2739 {
	public static void main(String[] args) {

		/*
		N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오.
		출력 형식에 맞춰서 출력하면 된다.
		N은 1보다 크거나 같고, 9보다 작거나 같다.
		출력형식과 같게 N*1부터 N*9까지 출력한다.
		 */

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		if ( N > 0 && N < 10 ) {
			for ( int i = 1; i < 10; i++ ) {
				int result = N * i;
				System.out.println(N + " * " + i + " = " + result);
			}
		}

		scan.close();
	}
}
