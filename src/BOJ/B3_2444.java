package BOJ;

import java.util.Scanner;

public class B3_2444 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for ( int i = 2*N-1; i > 0; i--) {
			for ( int j = 0; j < i-(i/2); j++ ) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}

