import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int cook = sc.nextInt();
		
		if(M+cook>=60) {
		H = H+(M+cook)/60;
		M = (M+cook)%60;
		 if(H>23) {
			 H-=24;
		 }else if(M>59){
			 M=0;
		 }
		}else {
		M = M+cook;
		}
		System.out.println(H+" "+M);
	}

}