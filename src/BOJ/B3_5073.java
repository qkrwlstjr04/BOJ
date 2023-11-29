package BOJ;

import java.util.Scanner;

public class B3_5073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if ( a + b + c == 0 ) {
				break;
			}
			
			int temp = 0;
			int max = 0;
			// 최대값 구하기
			if ( (a > b) && ( b > c ) ) {
				max = a;
				temp = b + c;
			} else if ( (b > a) && ( a > c)) {
				max = b;
				temp = a + c;
			} else {
				max = c;
				temp = a + b;
			}
			
			if ( max >= temp ) {
				System.out.println("Invalid");
			} else {
				if ( (a == b) && (b == c) ) {
					System.out.println("Equilateral");
				} else if ( (a == b) || (a == c) || (b == c) ) {
					System.out.println("Isosceles");
				} else {
					System.out.println("Scalene");
				}
				
			}	
		}
		
	}
}
