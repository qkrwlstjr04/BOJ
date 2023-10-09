package BOJ;

import java.util.Scanner;

public class B5_10430 { // 세 수 A, B, C가 주어졌을 때, 네 가지 값을 구하는 프로그램
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
	}
}
