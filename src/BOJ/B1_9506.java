package BOJ;

import java.util.Scanner;

public class B1_9506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = sc.nextInt(); // 입력은 테스트 케이스마다 한 줄 간격으로 n이 주어진다. (2 < n < 100,000)
			if ( n == -1 ) break; // 입력의 마지막엔 -1이 주어진다.
			
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
			
			// 값들을 앞으로 댕기기 ( 뒤에 조건을 더 추가한다면 딱히 의미 없을것같음. )
			int[] numArr = new int[n];
			for ( int i = 0, j = 0; i < n; i++) {
				if ( reArr[i] != 0) {
					numArr[j] = reArr[i];
					j++;
				}
			}
			
			int temp = 0; // 완전수 확인용 빈 공간 선언
			int cnt = 0;
			for ( int i = 0; i < n; i++) {
				if ( (numArr[i] == n) || (numArr[i] == 0)) { // 배열안에 든 값이 입력된 n 이랑 같거나 0이라면 넘기기
					continue;
				} else {
					temp += numArr[i]; // 값의 총합
					cnt++; // 값을 넣었던 횟수
				}
			}
			
			if ( temp == n ) { // 완전수이다
				// 답 출력
				System.out.print(n + " = ");
				for ( int i = 0; i < cnt; i++) {
					System.out.print(numArr[i]);
					if ( !(i == cnt -1) ) {
						System.out.print(" + ");
					}
				}
				System.out.println();
			} else { // 완전수가 아니다
				System.out.println(n + " is NOT perfect.");
			}
			
		}
	}
}
