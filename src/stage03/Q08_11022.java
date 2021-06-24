package stage03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q08_11022 {
	public static void main(String[] args) throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(bfr.readLine());
		for (int i = 0; i < T; i++) {
			String[] word = bfr.readLine().split(" ");
			int A = Integer.parseInt(word[0]);
			int B = Integer.parseInt(word[1]);
			bfw.write("Case #" + (i + 1) + ": " + A + " + " + B + " = " + (A + B) + "\n");
		}
		bfw.close();
		bfr.close();
	}

}
