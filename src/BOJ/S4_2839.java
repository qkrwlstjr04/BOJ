package BOJ;

import java.util.Scanner;

public class S4_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = 0;
		
		while (true) {
			if ( N % 5 == 0) {
				result += N / 5; break;
			} else { N -= 3; result++; }
			if (N < 3) {
				if ( N == 0) break;
				result = -1; break;
			}
		}
		
		System.out.println(result);
	}
}
