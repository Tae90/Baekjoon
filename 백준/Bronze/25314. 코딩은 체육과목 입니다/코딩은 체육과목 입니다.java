import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		num = num/4;
		String c[] = new String[num];
		for(int i=0;i<num;i++) {
			c[i] = "long ";
			System.out.print(c[i]);
		}
		System.out.print("int");

	}

}