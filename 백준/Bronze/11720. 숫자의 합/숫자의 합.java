import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String cut = sc.nextLine();
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += cut.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
