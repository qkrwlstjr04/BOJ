package BOJ;

import java.util.Scanner;

public class B3_2562 { // 최댓값이 어디에 있는지 찾는 문제
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] N = new int[9];
		int max = 0;
		int idx = 1;
		
		for ( int i = 0; i < 9; i++ ) {
			N[i] = sc.nextInt();
		}
		
		max = N[0];
		
		for ( int j = 0; j < 9; j++ ) {
			if ( N[j] > max ) {
				max = N[j];
				idx = j+1;
			}
			else {
				continue;
			}
		}
		System.out.println(max);
		System.out.println(idx);
		
	}
}
