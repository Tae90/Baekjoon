import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int num[] = new int[n];
		for (int f = 0; f < m; f++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			for (int y = i; y <= j; y++) {
				num[y - 1] = k;
			}

		}
		for (int f = 0; f < n; f++) {
			System.out.println(num[f]);
		}
	}
}
