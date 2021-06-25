package stage03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Q11_10871 {
	public static void main(String[] args) throws IOException {

		Set<Integer> Nset = new HashSet<Integer>();

		BufferedReader bfR = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfW = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = bfR.readLine();
		String[] sArray = str.split(" ");
		int N = Integer.parseInt(sArray[0]);
		int X = Integer.parseInt(sArray[1]);

		while (Nset.size() < N) {
			int num = (int) ((Math.random() * N) + 1);
			Nset.add(num);
		}

		for (int n : Nset) {
			if (n < X)
				bfW.write(n + " ");
		}

		bfR.close();
		bfW.close();

	}

}
