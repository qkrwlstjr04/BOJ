package BOJ;

import java.util.Scanner;

public class B2_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10]; // 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
		int[] divnum = new int[10]; // 입력받은 수를 각각 42로 나눈 값을 넣기 위한 배열
		int[] temp = new int[10];
		int result_cnt = 0; // 서로 다른 나머지의 개수, 서로 다른 나머지의 개수가 0 일때에도 1을 출력해야하기 때문에 1로 초기화
		
		int[] num41 = new int[42]; // 1~41까지의 숫자를 넣을 배열 선언
		for ( int i = 0; i <= 41; i++) num41[i] = i;
		int[] result = new int[42]; // -1로 초기화되어있는 배열
		for ( int i = 0; i <= 41; i++) result[i] = -1;
		
		for ( int i = 0; i < 10; i++) { // 10번 실행, 값을 입력 받음
			num[i] = sc.nextInt();
		}
		
		for ( int i = 0; i < 10; i++) { // 10번 실행, 입력받은 값들을 각각 42로 나눠줌
			divnum[i] = num[i] % 42;
		}
		
		
		for ( int i = 0; i < 10; i++) { // 10번 실행
			for ( int j = 0; j <= 41; j++) { // 41번 실행
				if ( divnum[i] == num41[j]) {
					if ( !(result[j] == -1)) {
						continue;
					} else {
						result[j] = num41[j];
					}
				}
				
			}
		}
		
		for ( int i = 0; i <= 41; i++) {
			if ( !(result[i] == -1)) {
				result_cnt++;
			}
		}
		
		System.out.println(result_cnt);
		
	}
}
