package BOJ;

import java.util.Scanner;

public class B2_10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		int result = 0;
		
		for ( int i = 0; i < str.length() / 2; i++) {
			if ( ch[i] == ch[ch.length - (i + 1)]) {
				result += 1;
			}
			else {
				result = 0;
			}
		}
		if ( result == str.length() / 2) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
	}
}
