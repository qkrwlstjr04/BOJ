package BOJ;

import java.util.Scanner;

public class B2_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		for ( int i = 1; i <= N; i++) {
			String str = "";
			int temp = i;
			
			str = Integer.toString(i);
			for ( int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				temp += ch-48;
			}
			
			if ( temp == N ) {
				System.out.println(i);
				break;
			}
			if ( i == N ) {
				System.out.println(0);
			}
			
		}
		
		
	}
}