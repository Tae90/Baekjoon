import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int num[] = new int[n];
		for (int k = 1; k <= n; k++) {
			num[k - 1] = k;
		}

		for (int a = 0; a < m; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int temp = num[i - 1];
			num[i - 1] = num[j - 1];
			num[j - 1] = temp;
			
		}

		for (int b = 0; b < num.length; b++) {
			System.out.println(num[b]);
		}

	}

}