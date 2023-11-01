package BOJ;

import java.util.Scanner;

public class B5_10951 { //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램.
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = 0, B = 0;
		
		while (sc.hasNextInt()) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println(A+B);
		}
	
	}
}
