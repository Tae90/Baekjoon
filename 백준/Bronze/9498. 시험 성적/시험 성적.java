import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if (score / 10 >= 9) {
			System.out.println("A");
			return;
		}
		if (score / 10 >= 8) {
			System.out.println("B");
			return;
		}
		if (score / 10 >= 7) {
			System.out.println("C");
			return;
		}
		if (score / 10 >= 6) {
			System.out.println("D");
			return;
		}else {
			System.out.println("F");
		}

	}

}