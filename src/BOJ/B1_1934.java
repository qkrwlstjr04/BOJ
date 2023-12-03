package BOJ;

import java.util.Scanner;

public class B1_1934 {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		
		int T = sc.nextInt();
		
		for ( int i = 0; i < T; i++) {
			
			int a = sc.nextInt(), b = sc.nextInt();
			
			int aa = a, bb = b;
			int result = 0;
			
			while (true) {
				if ( aa < bb ) {
					aa += a;
				} else if ( aa > bb ) {
					bb += b;
				} else {
					result = aa;
					break;
				}
			}
			
			
			System.out.println(result);
			
			
		}
		sc.close();
	} 
}