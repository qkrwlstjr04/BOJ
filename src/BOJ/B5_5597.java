package BOJ;

import java.util.Scanner;

public class B5_5597 { //1 ~ 30의 숫자가 무작위 순서로 28 개가 주어질때 (중복안됨)남은 두개의 숫자를 찾는 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] std = new int[31];
		int temp = 0;
		int cnt = 0;
		
		for ( int i = 1; i <= 28; i++) {
			temp = sc.nextInt();
			std[temp] = 1;
		}
		
		for ( int i = 1; i < std.length; i++) {
			cnt++;
			if ( std[i] == 0 ) {
				System.out.println(cnt);
			}
		}
	}
}