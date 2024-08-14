import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int num[] = new int[n];
		int temp = 0;
		for (int i = 0; i < n; i++) {
			num[i] = i + 1;
		}
		for (int k = 0; k < m; k++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			while (i < j) {
			temp = num[i-1];
			num[i-1] = num[j-1];
			num[j-1] = temp;
			i++;
			j--;
			}

		}
		for (int i = 0; i < n; i++) {
			System.out.println(num[i]);
		}
	}
}
