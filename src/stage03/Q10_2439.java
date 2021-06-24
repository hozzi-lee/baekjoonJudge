package stage03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10_2439 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfR = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfW = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = bfR.readLine();
		int N = Integer.parseInt(str);

		for (int i = 0; i < N; i++) {
			for (int s = 0; s < N - (i + 1); s++) {
				bfW.write(" ");
			}
			for (int j = 0; j < (i + 1); j++) {
				bfW.write("*");
			}
			bfW.newLine();
			bfW.flush();
		}

		bfR.close();
		bfW.close();

	}

}
