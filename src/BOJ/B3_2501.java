package BOJ;

import java.util.Scanner;

public class B3_2501 {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[N];
		
		for ( int i = 1; i <= N; i++) {
			if ( N % i == 0 ) {
				arr[i-1] = N / i;
			}
		}
		
		
		int[] reArr = new int[N]; // 뒤집힌 약수 저장용 배열
		for ( int i = N-1, j = 0; i >= 0; i--, j++) { // 배열 뒤집기
			reArr[j] = arr[i];
		}
		
		
		int[] result = new int[N];
		for ( int i = 0, j = 0; i < N; i++) {
			if ( reArr[i] != 0) {
				result[j] = reArr[i];
				j++;
			}
		}
		
		if ( result[K-1] == -1 ) {
			System.out.println(0);
		} else {
			System.out.println(result[K-1]);
		}
		sc.close();
	}
}
