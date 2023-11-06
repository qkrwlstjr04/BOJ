package BOJ;

import java.util.Scanner;

public class B5_3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] chess = new int[6];
		
		for ( int i = 0; i < chess.length; i++) {
			chess[i] = sc.nextInt();
		}
		
		// 킹 , 퀸
		for ( int i = 0; i < 2; i++) {
			if ( chess[i] > 1) { 
				System.out.print(-(chess[i]) + 1 + " ");
			}
			else if ( chess[i] < 1) {
				System.out.print(1 + " ");
			}
			else {
				System.out.print(0 + " ");
			}
		}
		
		for ( int i = 2; i < 5; i++) {
			if ( chess[i] == 2) { 
				System.out.print(0 + " ");
			}
			else if ( chess[i] > 2) {
				System.out.print(-(chess[i]) + 2 + " ");
			}
			else {
				System.out.print(2 - chess[i] + " ");
			}
		}
		
		if ( chess[5] == 8 ) {
			System.out.print(0);
		}
		else if ( chess[5] > 8) {
			System.out.print(-(chess[5]) + 8 + " ");
		}
		else if ( chess[5] < 8) {
			System.out.print(8 - chess[5]);
		}

	}
}
