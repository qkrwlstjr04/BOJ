package BOJ;

import java.util.Scanner;

public class B2_2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		int[] card = new int[N];
		int max = 0;
		
		for ( int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		}
		
		for  (int i = 0; i < N-2; i++) {
			for ( int j = i+1; 	j < N-1; j++) {
				for ( int q = j+1; q < N; q++) {
					int temp = card[i] + card[j] + card[q];
					if ( temp > M ) {
						continue;
					} else {
						if ( temp > max) {
							max = temp;
						}
					}
				}
			}
		}
		
		System.out.println(max);
		
	}
}
