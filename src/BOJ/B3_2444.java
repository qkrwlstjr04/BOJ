package BOJ;

import java.util.Scanner;

public class B3_2444 { // 별 찍는 문제 마름모
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int temp = N-1;
		
		for ( int i = 1; i < N*2; i++) {
			if ( i <=N ) {
				for ( int j = N-1; j > i-1; j--) {
					System.out.print(" ");
				}
			}
			
			if ( i <= N ) {
				for ( int j = 0; j < i*2-1; j++) {
					System.out.print("*");
				}
			}
			if ( i > N ) {
				for ( int j = 0; j < i-N; j++) {
					System.out.print(" ");
				}
			}
			if ( i > N ) {
				for ( int j = temp*2-1; j > 0; j--) {
					System.out.print("*");
				}
				temp--;
			}
			
			System.out.println();
		}
		
	}
}

