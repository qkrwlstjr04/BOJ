package BOJ;

import java.util.Scanner;

public class B4_2439 {
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt(); // 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		
		int star = 0; // 별 찍기용 변수 
		
		for ( int i = N; i > 0; i--) { // 실행 횟수용 반복문이지만 i 가 N 부터 시작해서 숫자가 하나씩 줄어듬
			for ( int j = 0; j < i-1; j++) { // 별 찍기전 빈칸만들기용 반복문 : 하나씩 후치로 줄어드는 i의 -1 만큼 반복함
				System.out.print(" "); // 빈칸 찍기
			}
			star++; // 정수값이 0 이었던 star 변수를 후치로 1 씩 증가시킴
			for ( int k = 0; k < star; k++) { // 별 찍기용 반복문 : star(정수) 만큼 실행시킴
				System.out.print("*"); // 별 찍기
			}
			System.out.println(); // 빈칸찍고 별 찍은 후 줄바꿈
		}
	}
}
