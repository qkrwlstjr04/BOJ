package BOJ;

import java.math.*;
import java.util.Scanner;

public class B3_2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal Quarter = new BigDecimal("0.25");
		BigDecimal Dime = new BigDecimal("0.10");
		BigDecimal Nickel = new BigDecimal("0.05");
		BigDecimal Penny = new BigDecimal("0.01");
		BigDecimal zero = BigDecimal.ZERO;

		int T = sc.nextInt(); // 테스트 케이스 개수
		
		int[][] answer = new int[T][4]; // 답 출력용 배열
		
		for ( int i = 0; i < T; i++) {
			int[] result = new int[4]; // 결과값 초기화
			
			int dollar = sc.nextInt(); // 테스트 케이스 입력
			
			float change = (dollar / 100) + ((dollar % 100 / 10) * 0.1f) + ((dollar % 10) * 0.01f); // 124 -> 1.24 계산
			BigDecimal change2 = new BigDecimal(change).setScale(2, RoundingMode.HALF_EVEN); // 빅데미컬 변수 선언과 소수점 2자리수까지 반올림
			
			while (true) {
				
				int temp = change2.compareTo(Quarter); // 왼쪽 값이 우측보다 클 경우에는 1 같을 경우에는 0 작을 경우에는 -1을 반환한다
				
				if ( ( temp >= 1) || ( temp == 0 ) ) { // 1 or 0
					change2 = change2.subtract(Quarter); // 값에 0.25 를 빼줌
					result[0]++; // 값을 빼준 횟수 + 1 0 0 0
					continue; // 빼준 후 while문으로 돌아가기
				} else { // -1 일 경우
					temp = change2.compareTo(Dime); // 0.10 랑 비교
					if ( ( temp >= 1) || ( temp == 0 ) ) { // 1 or 0
						change2 = change2.subtract(Dime); // // 값에 0.10 를 빼줌
						result[1]++; // 값을 빼준 횟수 + 0 1 0 0
						continue; // 빼준 후 while문으로 돌아가기
					} else { // -1 일 경우
						temp = change2.compareTo(Nickel); // 0.05 랑 비교
						if ( ( temp >= 1) || ( temp == 0 ) ) { // 1 or 0
							change2 = change2.subtract(Nickel); // 값에 0.05 를 빼줌
							result[2]++; // 값을 빼준 횟수 + 0 0 1 0
							continue; // 빼준 후 while문으로 돌아가기
						} else { // -1 일 경우
							temp = change2.compareTo(Penny); // 0.01 랑 비교
							if ( ( temp >= 1) || ( temp == 0 ) ) { // 1 or 0
								change2 = change2.subtract(Penny); // 값에 0.01 를 빼줌
								result[3]++; // 값을 빼준 횟수 + 0 0 0 1
								continue; // 빼준 후 while문으로 돌아가기
							} else { // -1 일 경우
								temp = change2.compareTo(zero); // 0 이랑 비교
								if ( temp == 0 ) { // 0이랑 비교해서 0이랑 같다면 종료
									break;
								}
							}
						}
					}
				}
				
				
				/*
				if ( change2 >= 0.25 ) {
					change2 = change2.subtract(Quarter);
					result[0]++;
					continue;
				} else if ( change2 >= 0.10 ) {
					change2 = change2.subtract(Dime);
					result[1]++;
					continue;
				} else if ( change2 >= 0.05 ) {
					change2 = change2.subtract(Nickel);
					result[2]++;
					continue;
				} else if ( change2 >= 0.01 ) {
					change2 = change2.subtract(Penny);
					result[3]++;
					continue;
				} else {
					break;
				}
				*/
			}
			
			for ( int j = 0; j < 4; j++) { // 4번 반복, 답 저장용
				answer[i][j] = result[j]; 
			}
			
		}
		
		
		for ( int i = 0; i < T; i++) { // 테스트 케이스만큼 반복
			for ( int j = 0; j < 4; j++) {
				System.out.print(answer[i][j] + " "); 
			}
			System.out.println();
		}
		
		// 1번째 방법
		// 124가 입력될 경우 1.24로 float 형 변환 후 1.24에서 대소 비교를 통해 0.25 보다 클 경우 0.25를 빼준 후 continue 해서 
		// 반복하는 방법 : 실패 : 26이 입력될 경우 0.26으로 변환은 되지만 0.25를 빼준 후 0.01과의 비교에서 그냥 넘어가버림
		// 값이 정확하게 계산이 안되는거같음
		
		// 2번째 방법
		// BigDecimal 함수 사용 subtract(), compareTo() 메서드 사용
		// setScale(2, RoundingMode.HALF_EVEN) 은 소수점 반올림용
		// compareTo() 메서드 같은 경우에는 대소 비교는 되지만 1, 0, -1을 반환하기때문에 if문에 사용하기 까다로움
		
		// 3번째 방법
		// 124가 입력될 경우 100을 빼주고 나머지들은 int형으로 계산 10, 5, 1 
		// 굳이 실수 계산을 하지않았어도 됨
	}
}
