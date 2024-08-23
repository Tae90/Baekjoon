import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = new String[8];
		String str = sc.next();
		int sum = 0;
		num[0] = "ABC";
		num[1] = "DEF";
		num[2] = "GHI";
		num[3] = "JKL";
		num[4] = "MNO";
		num[5] = "PQRS";
		num[6] = "TUV";
		num[7] = "WXYZ";

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < 8; j++) {
				for (int k = 0; k < num[j].length(); k++) {
					if (str.charAt(i) == num[j].charAt(k)) {
						sum += j + 3;
					}
				}

			}
		}
		System.out.println(sum);
	}
}