package BOJ;

import java.util.Scanner;

public class B5_10807 { // 배열을 입력받고 v를 찾는 문제
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다.
		int[] num = new int [N]; // N 만큼 배열 선언
		
		for ( int i = 0; i < N; i++) { // N번실행, 배열에 담기 위함
			num[i] = sc.nextInt(); // num배열에 i 번째 안에 값넣기
		}
		
		int v = sc.nextInt(); // 찾을려고하는 값 
		int result = 0; // 찾은 v의 값의 갯수
		
		for ( int i = 0; i < N; i++) { // N번실행, 배열에 담긴 값을 찾기위함
			if ( num[i] == v ) { // 만약 num의 배열 i 번째 값이 v랑 같다면
				result++; // 찾은 v 갯수 추가
			}
		}
		System.out.println(result);
	}
}