package BOJ;

import java.util.Scanner;

public class B2_2675 { // 각 문자를 반복하여 출력하는 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int R; // 반복 횟수
		String str; // 반복할 문자열
		
		for ( int i = 0; i < T; i++) {
			R = sc.nextInt();
			str = sc.next();
			
			for ( int j = 0; j < str.length(); j++) {
				for ( int k = 0; k < R; k++) {
					System.out.print(str.charAt(j));
				}
			}

			System.out.println();
		}
	}
}
