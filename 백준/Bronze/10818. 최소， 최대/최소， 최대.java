import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int number[] = new int[n];

		for (int i = 0; i < n; i++) {
			number[i] = sc.nextInt();
		}
		int max = number[0];
		int min = number[0];
		for (int j = 0; j < n; j++) {
			if (max < number[j]) {
				max = number[j];
			}
			if (min > number[j]) {
				min = number[j];
			}
		}
		System.out.println(min + " " + max);
	}
}
