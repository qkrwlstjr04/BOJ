package BOJ;

import java.util.Scanner;

public class B3_2884 { // 45분 일찍 알람 설정하기
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		// 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) H시 M분을 의미함
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		// 입력된 시분에 45분을 빼기위한 공간
		int temp = 0;
		
		// 입력된 H 시를 기준으로 -45분 계산
		if ( 0 < H ) { // H 가 0 보다 클 때
			temp = ((H * 60) + M) - 45; // 입력된 시간, 분을 분단위로 temp에 저장
			H = temp / 60; // 분단위로 저장된 temp 값을 시간으로 계산 후 H에 저장
			M = temp % 60; // 분단위로 저장된 temp 값을 시간을 뺀 후 M에 저장
		}
		else { // H 가 0 일 때
			// 45분을 빼야하니 분을 기준
			if ( 45<=M ) { // M 이 45보다 크거나 같을 때
				M-=45; // 45분을 뺌
			}
			else { // M 이 45보다 작을 때
				H = 23; // 시간을 23시로 바꿔줌
				M = (M+60)-45; // 시간을 23시로 바꿔줬으니 60분을 추가 후 45분을 뺌
			}
		}
		System.out.print(H + " " + M); // 답 출력
	}
}