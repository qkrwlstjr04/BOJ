package BOJ;

import java.util.Scanner;

public class B5_2738 { // 행렬을 2차원 배열로 만들어 더하는 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		int[][] arr = new int[N][M]; // N행 M열 선언
		int[][] arr2 = new int[N][M]; // N행 M열 선언, 더하기용
		
		for ( int i = 0; i < N; i++) { // N번 실행
			for ( int j = 0; j < M; j++) { // M번 실행, 첫번째 배열 N행 M열의 공간에 값들 넣기
				arr[i][j] = sc.nextInt();
			}
		}
		
		for ( int i = 0; i < N; i++) { // N번 실행
			for ( int j = 0; j < M; j++) { // M번 실행, 두번째 배열 N행 M열의 공간에 값들 넣기
				arr2[i][j] = sc.nextInt();
			}
		}
		
		for ( int i = 0; i < N; i++) { // N번 실행
			for ( int j = 0; j < M; j++) { // M번 실행, 첫번째 배열의 N행 M열과 두번째 배열의 N행 M열의 값을 더하기
				arr[i][j] += arr2[i][j];
			}
		}
		
		for ( int i = 0; i < N; i++) { // N번 실행
			for ( int j = 0; j < M; j++) { // M번 실행
				System.out.print(arr[i][j] + " "); // 답 출력
			}
			System.out.println();
		}
	}
}
