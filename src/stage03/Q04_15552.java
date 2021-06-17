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
			/*
			sT  = new StringTokenizer(bfr.readLine()); // BufferReader.redLine() 로 입력받은 값을 StringTokenizer 에 대입

			// sT.nextToken() --> 입력 받은 String 값을 공백 단위로 나눠서 순서대로 출력 공백+1 만큼의 배열이 생성 되는 느낌 == .split(" ")
			int A = Integer.parseInt( sT.nextToken() ); // 첫 번째 String 값을 int 형으로 변환
			int B = Integer.parseInt( sT.nextToken() ); // 두 번째 String 값을 int 형으로 변환

			bfw.write(A + B + "\n"); // "\n" 미작성시 출력 문자 오류 발생
			//			bfw.flush(); --> 한줄 입력 후 출력 하려면 .flush() 작성 --> Buffer 에 1회씩 저장 후 출력을 반복하기 때문에 총 반복 횟수만큼의 출력시간이 늘어남 --> 미작성시 반복 횟수만큼 저장후 한번에 출력
			 */

			// 수정 --> 오류없음
			//			String text = bfr.readLine();
			String[] word = bfr.readLine().split(" "); // 입력값을 공백으로 나눠서 word 배열에 대입
			int A = Integer.parseInt(word[0]); // 공백 전(첫 번째 값 [0]) 입력 값을 int 형으로 변환후 A에 대입
			int B = Integer.parseInt(word[1]); // 공백 후(두 번째 값 [1]) 입력 값을 int 형으로 변환후 A에 대입
			bfw.write(A + B + "\n"); // "\n" 미작성시 출력 문자 오류 발생

		}

		bfw.close();
		bfr.close();

	}

}
