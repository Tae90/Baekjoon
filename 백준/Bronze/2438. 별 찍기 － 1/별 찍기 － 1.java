import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = new String();
		String star = "*";

		for (int i = 0; i < N; i++) {
			s += star;
			System.out.println(s);
		}

	}

}
