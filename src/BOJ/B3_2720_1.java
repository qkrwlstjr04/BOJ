package BOJ;

import java.util.Scanner;

public class B3_2720_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for ( int i = 0; i < T; i++) {
			int[] result = new int[4];
			
			int dollar = sc.nextInt();
			
			int baek = dollar / 100;
			dollar = dollar % 100;
			
			while (true) {
				if ( dollar >= 25 ) {
					dollar -= 25;
					result[0]++;
				} else if ( dollar >= 10 ) {
					dollar -= 10;
					result[1]++;
				} else if ( dollar >= 5 ) {
					dollar -= 5;
					result[2]++;
				} else if ( dollar >= 1 ) {
					dollar--;
					result[3]++;
				} else {
					result[0] += baek * 4;
					break;
				}
			}
			for ( int j = 0; j < 4; j++) {
				System.out.print(result[j] + " ");
			}
			System.out.println();
		}
		
	}
}
