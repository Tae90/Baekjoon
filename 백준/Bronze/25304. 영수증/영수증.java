import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();

		int number = sc.nextInt();

		int a[] = new int[number];
		int b[] = new int[number];

		int hap = 0;

		for (int i = 0; i < number; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			hap += a[i] * b[i];
		}
		if (total == hap) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}