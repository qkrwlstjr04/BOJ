package BOJ;

import java.util.Scanner;

public class B2_10811 {
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] basket = new int[N];
		int M = sc.nextInt();
		int i, j, temp = 0;
		
		for ( int q = 0; q < N; q++) {
			basket[q] = q+1;
		}
		
		for ( int p = 0; p < M; p++) {
			i = sc.nextInt();
			j = sc.nextInt();
			
			for ( int q = j-1; q >= i-1; q--) {
				temp = basket[q];
				basket[q] = basket[q+1];
				basket[q+1] = temp;
			}
		}
		
		for ( int a = 0; a < N; a++) {
			System.out.print(basket[a] + " ");
		}
		
	}
}
