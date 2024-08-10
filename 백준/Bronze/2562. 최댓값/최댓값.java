import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] number = new int[9];
		int max = number[0];
		int index = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		for (int j = 0; j < number.length; j++) {
			if (number[j] > max) {
				max = number[j];
			}
		}
		for (int k = 0; k < number.length; k++) {
			if (number[k] == max) {
				index = k+1;
				break;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

}
