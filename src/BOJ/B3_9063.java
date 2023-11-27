package BOJ;

import java.util.Scanner;

public class B3_9063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] xy = new int[N][2];
		
		for ( int i = 0; i < N; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
		}	
		
		int[] x = {xy[0][0] , xy[0][0] }; // x 큰값 작은값 비교용
		int[] y = {xy[0][1] , xy[0][1] }; // y 큰값 작은값 비교용
		
		for ( int i = 1; i < N; i++ ) {
			if ( x[0] < xy[i][0] ) {
				x[0] = xy[i][0];
			}
			if ( x[1] > xy[i][0] ) {
				x[1] = xy[i][0];
			}
		}
		
		for ( int i = 1; i < N; i++ ) {
			if ( y[0] < xy[i][1] ) {
				y[0] = xy[i][1];
			} 
			if ( y[1] > xy[i][1] ) {
				y[1] = xy[i][1];
			}
		}
		
		System.out.println((x[0] - x[1]) * (y[0] - y[1]));
	}
}