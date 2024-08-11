import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int C = sc.nextInt();

		int hour = (A * 60 + B + C) / 60;
		int minute = (A * 60 + B + C) % 60;

		if (hour > 23) {
			hour -= 24;
		}

		System.out.println(hour + " " + minute);
	}

}
