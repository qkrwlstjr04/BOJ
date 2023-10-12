package BOJ;

import java.util.Scanner;

public class B5_10871 { // 배열을 입력받고 X보다 작은 수를 찾는 문제
	public static  void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] A = new int [N];
		
		for ( int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for ( int i = 0; i < N; i++) {
			if ( A[i] < X ) {
				System.out.print(A[i] + " ");
			}
		}
	}
}
