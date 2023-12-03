package BOJ;

import java.util.Scanner;

public class S5_13241 {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		
			
		long a = sc.nextLong(), b = sc.nextLong();
			
		long aa = a, bb = b;
		long result = 0;
		
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
			
			
		sc.close();
	} 
}