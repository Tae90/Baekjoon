import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());

		int n1[] = new int[a];
		int n2[] = new int[a];

		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			n1[i] = b;
			n2[i] = c;
			bw.write((b+c)+"\n");
		}
		bw.flush();
	}

}