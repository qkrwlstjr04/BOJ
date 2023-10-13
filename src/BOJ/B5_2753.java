package BOJ;

import java.util.Scanner;

public class B5_2753 { // 윤년을 판별하는 문제
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if ( year % 4 == 0) {
			if ( !(year % 100 == 0) || (year % 400 == 0)) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
		else {
			System.out.println(0);
		}
		
	}
}
