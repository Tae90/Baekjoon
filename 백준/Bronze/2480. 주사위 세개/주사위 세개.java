import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();
		int result = 0;

		if (f == s && s == t) {
			result = 10000 + (f * 1000);
		} else if (f == s || f == t) {
			result = 1000 + (f * 100);
		} else if (s == t) {
			result = 1000 + (s * 100);
		} else {
			result = ((f > s && f > t) ? f : (s > t) ? s : t) * 100;

		}
		System.out.println(result);
	}

}
