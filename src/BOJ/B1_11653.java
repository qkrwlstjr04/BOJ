package BOJ;

import java.util.Scanner;

public class B1_11653 {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if ( N > 1 ) {
			int temp = N;
			int cnt = 2;
			
			while (true) {
				if ( temp == 1) break;
				if ( temp % cnt == 0 ) {
					temp /= cnt;
					System.out.println(cnt);
					cnt = 1;
				}
				cnt++;
			}	
		}
	}
}
