package stage03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q04_15552 {

	public static void main(String[] args) throws IOException {

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in)); // Scanner 와 동일하지만 BufferedReader 는 String 값으로 고정 되어 있다.
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out)); // Sysout 와 동일

		StringTokenizer sT;

		int T = Integer.parseInt(bfr.readLine()); // 입력값으로 반복 횟수 설정

		for ( int i = 0; i < T; i++ ) {
			sT  = new StringTokenizer(bfr.readLine()); // BufferReader.redLine() 로 입력받은 값을 StringTokenizer 에 대입

			// sT.nextToken() --> 입력 받은 String 값을 공백 단위로 나눠서 순서대로 출력 공백+1 만큼의 배열이 생성 되는 느낌 == .split(" ")
			int A = Integer.parseInt( sT.nextToken() ); // 첫 번째 String 값을 int 형으로 변환
			int B = Integer.parseInt( sT.nextToken() ); // 두 번째 String 값을 int 형으로 변환

			bfw.write(A + B + "\n");
			//			bfw.flush(); --> 한줄 입력 후 출력 하려면 .flush() 작성

			/* 실패
			String text = bfr.readLine();
			String[] word = text.split(" ");
			int A = Integer.parseInt(word[0]);
			int B = Integer.parseInt(word[1]);
			bfw.write(A + B);
			bfw.newLine();
			 */

		}

		bfw.close();
		bfr.close();

	}

}
