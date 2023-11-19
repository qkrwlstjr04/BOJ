package BOJ;

import java.util.Scanner;

public class B2_1978 {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = 0;
		
		for ( int q = 0; q < N; q++ ) {
			int n = sc.nextInt();
			if ( n == 1 ) continue;
			
			int[] arr = new int[n]; // 입력된 숫자만큼 배열 선언
			
			for ( int i = 1; i <= n; i++) { // n번 반복, i = 1부터 n까지
				if ( n % i == 0 ) { // 입력된 숫자가 1~n 까지 나누었을때 0으로 떨어지는 숫자만  
					arr[i-1] = n / i; // 배열에 넣음
				}
			}
			
			int[] reArr = new int[n]; // 뒤집힌 약수 저장용 배열
			for ( int i = n-1, j = 0; i >= 0; i--, j++) { // 배열 뒤집기
				reArr[j] = arr[i];
			}
			
			// 값들을 앞으로 댕기기
			int[] numArr = new int[n];
			for ( int i = 0, j = 0; i < n; i++) {
				if ( reArr[i] != 0) {
					numArr[j] = reArr[i];
					j++;
				}
			}
			
			if ( numArr[1] == n) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
