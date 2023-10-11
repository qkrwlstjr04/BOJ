package BOJ;

import java.util.Scanner;

public class B3_10818 { // 최솟값과 최댓값을 찾는 문제
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다
		int[] arr = new int[N]; // N 개의 배열 선언
		int max = 0, min = 0; // 최댓값, 최솟값을 담아둘 공간 선언
		
		
		for ( int i = 0; i < N; i++ ) { // N 번 반복
			arr[i] = sc.nextInt(); // 인덱스 i 번째 
		}
		
		// 배열의 첫번째 값을 최댓값과 최솟값에 저장
		max = arr[0];
		min = arr[0];
		
		for ( int i = 1; i < N; i++ ) { // N-1번 반복 . i 는 1 부터 시작
			
			// 인덱스 0 번째 값을 i 번째와 비교
			if ( max < arr[i] ) { // i 번째가 더 클때
				max = arr[i];
			}
			else if ( min > arr[i] ) { // i 번째가 더 작을때
				min = arr[i];
			}
			else { // 같을때는 넘김
				continue;
			}
			
		}
		System.out.println(min + " " + max); // 답 출력
		
	}
}