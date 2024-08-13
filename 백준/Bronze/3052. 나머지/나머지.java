import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int count = 0;

		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt() % 42;
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {

				if (num[i] == num[j]) {
					count+=1;
					break;
					
				}
				
			}
		}
		System.out.println(10-count);
	}

}
