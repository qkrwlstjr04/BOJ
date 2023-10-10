package BOJ;

import java.util.Scanner;

public class B5_11021 { // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int A = 0, B = 0;
		
		for ( int i=1; i <= T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println("Case #" + i + ": " + (A+B));
		}
	}
}
