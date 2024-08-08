import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int number[] = new int[a];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < a; i++) {

			number[i] = Integer.parseInt(st.nextToken());
			if (number[i] < b) {
				bw.write(number[i]+" ");
			}

		}
		bw.flush();
	}

}
