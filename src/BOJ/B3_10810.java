package BOJ;

import java.util.Scanner;

public class B3_10810 { // 바구니에 공을 넣는 문제
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 바구니의 개수 
		int M = sc.nextInt(); // 공을 넣을 횟수
		
		// M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다. 
		// 각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻
		int i, j , k;
		int[] basket = new int[N]; // N 개의 배열 선언
		
		for ( int q = 0; q < M; q++ ) { // M 번 반복
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();
			for ( int p = i-1; p <= j-1; p++) { // j 번 반복
				// 바구니 인덱스 번호 i-1부터 j-1까지의 공간안에 k 번 번호 공을 넣음
				basket[p] = k;
			}
		}
		
		for ( int q = 0; q < N; q++) { // N 번 반복
			System.out.print(basket[q] + " "); // 답 출력
		}
		
	}
}
