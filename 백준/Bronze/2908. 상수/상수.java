import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		String result1 = String.valueOf(num1.charAt(2)) + String.valueOf(num1.charAt(1)) + String.valueOf(num1.charAt(0));
		String result2 = String.valueOf(num2.charAt(2)) + String.valueOf(num2.charAt(1)) + String.valueOf(num2.charAt(0));
		int change1 = Integer.parseInt(result1);
		int change2 = Integer.parseInt(result2);
		
		if(change1>change2) {
			System.out.println(change1);
		}else {
			System.out.println(change2);
		}
		
	}

}
