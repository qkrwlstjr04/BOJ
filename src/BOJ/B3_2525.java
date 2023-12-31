package BOJ;


import java.util.Scanner;

public class B3_2525 { // 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt(); // 현재 시간, 분 변수
		int C = sc.nextInt(); // 요리하는 데 필요한 시간 변수
		
		
		// 요리하는 데 필요한 시간인 C 를 기준으로 계산함
		
		if ( C >= 60) { // C 가 60 보다 크거나 같을 때
			A += C / 60; // C 를 60 으로 나눈 값을 A에 더해서 넣음
			B += C % 60; // C 를 60 으로 나눈 후 나머지를 B에 더해서 넣음
			
			if ( A >= 24 ) { // 시간은 23 을 넘을 수 없으니 조건 추가 
				A -= 24; // 시간에 24를 뺌
			}
			if ( B >= 60) { // 분은 59 을 넘을 수 없으니 조건 추가  
				A++; // 시간 추가
				B -= 60; // 시간을 추가했으니 -60
			}
		}
		
		else { // C 가 60 보다 작을 때
			B += C; // B 에 C 를 더한 후 B 에 저장
			
			if ( A >= 24 ) { // 시간은 23 을 넘을 수 없으니 조건 추가 
				A -= 24; // 시간에 24를 뺌
			}
			if ( B >= 60) { // 분은 59 을 넘을 수 없으니 조건 추가  
				A++; // 시간 추가
				B -= 60; // 시간을 추가했으니 -60
			}
		}
		
		// 32번줄에서 24보다 크거나 같을 경우 시간에 24를 뺀다고 해놨는데 수가 24가 들어갔을때 0으로 계산이 안되서 넣은 조건문
		if ( A == 24 ) {
			A = 0;
		}
		
		System.out.print(A + " " + B); // 답 출력
		
	}
}
