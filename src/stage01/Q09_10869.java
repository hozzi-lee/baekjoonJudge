package stage01;

import java.util.Scanner;

public class Q09_10869 {
	public static void main(String[] args) {

		// 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);

		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();

		if ( A > 0 && B > 0 ){
			System.out.println(A + B);
			System.out.println(A - B);
			System.out.println(A * B);
			System.out.println(A / B);
			System.out.println(A % B);
		}   

		sc.close(); 
	}

}
