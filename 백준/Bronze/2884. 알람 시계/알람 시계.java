import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
			int A = sc.nextInt();
			int B = sc.nextInt();
			
		if(B<45) {
			A = (A <= 0) ? 23 : A-1;
			B = 60+(B-45);
			
		}else {
			B-=45;
		}
		
		System.out.println(A+" "+B);
	}

}
