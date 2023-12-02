package BOJ;

import java.util.Scanner;

public class B3_3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] result = new int[2];
		
		int[][] xy = new int[3][2];
		for ( int i = 0; i < 3; i++) {
			for ( int j = 0; j < 2; j++) {
				xy[i][j] = sc.nextInt();
			}
		}
		
		
		for ( int i = 0; i < 2; i++) {
			if ( xy[0][i] == xy[1][i] ) {
				result[i] = xy[2][i];
			} else if ( xy[0][i] == xy[2][i] ) {
				result[i] = xy[1][i];
			} else {
				result[i] = xy[0][i];
			}
		}
		
		System.out.println(result[0] + " " + result[1]);
	}
}
