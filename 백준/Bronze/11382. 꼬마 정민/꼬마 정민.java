import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String cut[] = num.split("\\s");
		long A = Long.parseLong(cut[0]);
		long B = Long.parseLong(cut[1]);
		long C = Long.parseLong(cut[2]);
		
		System.out.println(A+B+C);
		
		

	}

}
