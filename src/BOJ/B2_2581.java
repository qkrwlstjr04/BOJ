package BOJ;

import java.util.Scanner;

public class B2_2581 { // 아직 못품, 메모리 때문
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt() , N = sc.nextInt(); // 입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
		
		int sum = 0;
		int[] min = new int[N-M];
		for (int i = 0; i < min.length; i++ ) min[i] = -1;
		
		for ( int q = M, cnt = 0; q < N; q++) {
			int[] arr = new int[q]; // 입력된 숫자만큼 배열 선언
			
			for ( int i = 1; i <= q; i++) { // n번 반복, i = 1부터 n까지
				if ( q % i == 0 ) { // 입력된 숫자가 1~n 까지 나누었을때 0으로 떨어지는 숫자만  
					arr[i-1] = q / i; // 배열에 넣음
				}
			}
			
			// 배열 뒤집기
			int[] reArr = new int[q];
			for ( int i = q-1, j = 0; i >= 0; i--, j++) {
				reArr[j] = arr[i];
			}
			
			// 값들을 앞으로 댕기기
			int[] numArr = new int[q];
			for ( int i = 0, j = 0; i < q; i++) {
				if ( reArr[i] != 0) {
					numArr[j] = reArr[i];
					j++;
				}
			}
			
			
			if ( numArr[1] == q) {
				sum += numArr[1];
				min[cnt] = numArr[1];
			}
			cnt++; // 반복한 횟수 카운트
		}
		
		
		if ( sum == 0 ) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			for ( int i = 0; i < min.length; i++) {
				if ( min[i] != -1 ) {
					System.out.println(min[i]);
					break;
				}
			}
		}
	}
}
