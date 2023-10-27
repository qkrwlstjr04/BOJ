package BOJ;

import java.util.Scanner;

public class B3_2566 { // 최댓값을 2차원에서 찾는 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9]; // 9행 9열 2차원 배열 선언
		
		int max = 0; // 최대값을 담아둘 공간
		int row = 0, column = 0; // 행, 열을 담아둘 공간
		
		for ( int i = 0; i < 9; i++) { // 9번 실행
			for ( int j = 0; j < 9; j++) { // 9번 실행, 1행 1열부터 9행 9열까지 하나씩 입력받기
				arr[i][j] = sc.nextInt();
			}
		}
		
		max = arr[0][0]; // 최댓값을 첫번째 행 첫번째 열로 
		row = 1; // 행을 첫번째 행으로
		column = 1; // 열을 첫번째 열로
		
		for ( int i = 0; i < 9; i++) { // 9번 실행
			for ( int j = 0; j < 9; j++) { // 9번 실행
				if ( max < arr[i][j] ) { // 1행 1열의 값보다 i 행 j 열의 값이 더 클 경우
					max = arr[i][j]; // i 행 j 열의 값을 최대값으로 지정
					row = i+1; // i행 j열의 i행을 row에 대입
					column = j+1; // i행 j열의 j행을 column에 대입
				}
			}
		}
		
		System.out.println(max + "\n" + row + " " +column); // 답 출력
		
		/*
		 * 첫번째 제출 시도 97%에서 실패
		 * 틀린 이유 (예상) : 최대값을 1행1열의 값으로 대입한 후 하나씩 비교했는데 행, 열을 넣어두지 않았음
		 * 두번째 제출 정답
		 */
		
	}
}
