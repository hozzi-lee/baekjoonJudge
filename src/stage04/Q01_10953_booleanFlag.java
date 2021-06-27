package stage04;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q01_10953_booleanFlag {

	public static void main(String[] args) throws IOException {
		BufferedReader bfR = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfW = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean flag = true;

		while (flag) {
			String[] sArray = bfR.readLine().split(" ");
			int A = Integer.parseInt(sArray[0]);
			int B = Integer.parseInt(sArray[1]);

			if (A + B == 0) {
				flag = false;
				break;
			}
			bfW.write(A + B + "\n");
		}

		bfR.close();
		bfW.close();
	}

}
