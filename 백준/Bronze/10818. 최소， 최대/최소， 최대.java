import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];

		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}

		int max = num[0];
		int min = num[0];

		for (int j = 0; j < N; j++) {
			if (num[j] > max) {
				max = num[j];
			}
			if (num[j] < min) {
				min = num[j];
			}
		}
		System.out.println(min + " " + max);
	}

}
