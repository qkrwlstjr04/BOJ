package BOJ;

import java.util.Scanner;

public class B1_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 시험을 본 과목의 개수
		int max = 0;
		int[] arr1 = new int[N]; // 점수/M*100 전
		float[] arr2 = new float[N]; // 점수/M*100 후
		
		for ( int i = 0; i < N; i++) { // N번 반복, 시험을 본 과목의 점수들 입력받기  
			arr1[i] = sc.nextInt();
		}
		
		// 입력받은 점수중 가장 큰 값 찾기
		max = arr1[0];
		for ( int i = 1; i < N; i++) { // N-1번 반복
			if ( max < arr1[i] ) {
				max = arr1[i];
			}
		}

		
		for ( int i = 0; i < N; i++) { // 입력받은 배열에 점수/가장큰점수*100 계산해주기
			arr2[i] = (float)arr1[i] / max * 100;
		}
		
		
		// 평균을 구하기, 값들 다 더해주기
		float temp = 0.0F;
		for ( int i = 0; i < N; i++) { // N번 반복
			temp += arr2[i];
		}
		System.out.println(temp / N);
		
	}
}
