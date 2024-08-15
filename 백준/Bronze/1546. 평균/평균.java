import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int number[] = new int[m];
		double result[] = new double[m];
		int max = number[0];
		float sum = 0f;
		for (int i = 0; i < m; i++) {
			number[i] = sc.nextInt();
		}
		for (int j = 0; j < m; j++) {
			if (number[j] > max) {
				max = number[j];
			}

		}
		for (int k = 0; k < m; k++) {
			result[k] = (number[k] /(double) max) * 100;
			sum += result[k];
		}
		System.out.println(sum / m);
	}
}