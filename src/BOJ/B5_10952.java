package BOJ;

import java.util.Scanner;

public class B5_10952 { // 0 0이 들어올 때까지 A+B를 출력하는 문제
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			if ( (A == 0) && (B == 0)) {
				break;
			}
			System.out.println(A+B);
		}
	}
}
