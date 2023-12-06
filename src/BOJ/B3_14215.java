package BOJ;

import java.util.Scanner;

public class B3_14215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		if ( (a == b) && (b == c) ) { 
			System.out.println(a+b+c);
		}
		else {
			int max = 0;
			int temp = 0;
				
			if ( (a >= b) && ( a >= c ) ) {
				max = a;
				temp = b + c;
			} else if ( (b >= a) && ( b >= c)) {
				max = b;
				temp = a + c;
			} else {
				max = c;
				temp = a+b;
			}
			
			if ( temp > max ) {
				System.out.println(a+b+c);
			} else {
				System.out.print((temp)*2-1);
			}
			
		}
	}
}