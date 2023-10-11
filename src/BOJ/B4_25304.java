package BOJ;

import java.util.Scanner;

public class B4_25304 { // 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사하는 프로그램
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt(); // 영수증에 적힌 총 금액 X가 주어진다.
		int N = sc.nextInt(); // 영수증에 적힌 구매한 물건의 종류의 수 N
		int temp = 0; // 영수증에 적힌 금액과 구매한 물건들의 가격을 비교하기위한 빈 공간
		
		// 이후 $N$개의 줄에는 각 물건의 가격 $a$와 개수 $b$가 공백을 사이에 두고 주어진다.
		for ( int i = 0; i < N; i ++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			temp += a * b; // 구매한 물건들의 가격을 temp에 저장
		}
		
		if ( temp == X ) { // 구매한 물건들이 영수증의 적힌 금액보다 같을 경우
			System.out.println("Yes");
		}
		else { // 구매한 물건들이 영수증의 적힌 금액보다 크거나 작을 경우
			System.out.println("No");
		}
		
	}
}
