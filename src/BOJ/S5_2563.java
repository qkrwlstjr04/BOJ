package BOJ;

import java.util.Scanner;

public class S5_2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[][] bool = new boolean[100][100];
		
		int N = sc.nextInt();
		int x, y;
		int cnt = 0;
		
		for ( int i = 0; i < N; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			for ( int j = 0; j < 10; j++) {
				for ( int k = 0; k < 10; k++) {
					bool[x+j][y+k] = true;
				}
			}
		}
		
		for ( int i = 0; i < 100; i++) {
			for ( int j = 0; j < 100; j++) {
				if ( bool[i][j] == true) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
	}
}
