import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num[] = new int[3];
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		num[0] = A;
		num[1] = B;
		num[2] = C;
		int max = num[0];
		int result = 0;

		if (A == B && A == C && B == C) {
			result = 10000 + (A * 1000);
		} else if (A == B || A == C) {
			result = 1000 + (A * 100);
		} else if (B == A || B == C) {
			result = 1000 + (B * 100);
		} else {
			for (int i = 0; i < 3; i++) {
				if (num[i] > max) {
					max = num[i];
				}

			}
			result = max * 100;
		}
		System.out.println(result);
	}
}