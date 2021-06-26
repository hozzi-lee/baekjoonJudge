package stage04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q02_10951 {
	public static void main(String[] args) throws IOException {

		BufferedReader bfR = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfW = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String[] sArray = bfR.readLine().split(" ");
			int A = Integer.parseInt(sArray[0]);
			int B = Integer.parseInt(sArray[1]);
			bfW.write(A + B + "\n");
			bfW.flush();

		}

	}

}
