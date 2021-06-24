package stage03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q5_2741 {
	public static void main(String[] args) throws IOException {

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(bfr.readLine());

		for ( int i = 1; i <= N; i++ ) {
			bfw.write(i + "\n");
		}
		bfw.flush();
	}
}
