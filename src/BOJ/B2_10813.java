package BOJ;

import java.util.Scanner;

public class B2_10813 { // 배열의 값을 교환하는 문제
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] basket = new int[N];
		int M = sc.nextInt();
		int temp = 0;
		
		int i, j;
		
		for ( int q = 0; q < N; q++) {
			basket[q] = q+1;
		}
		for ( int p = 0; p < M; p++) {
			i = sc.nextInt();
			j = sc.nextInt();
			temp = basket[i-1];
			basket[i-1] = basket[j-1];
			basket[j-1] = temp;
		}
		for ( int b = 0; b < N; b++) {
			System.out.print(basket[b]+ " ");
		}
	}
}