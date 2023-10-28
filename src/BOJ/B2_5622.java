package BOJ;

import java.util.Scanner;

public class B2_5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] ch = new char[str.length()];
		int result = 0;
		
		for ( int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		
		for ( int i = 0; i < str.length(); i++) {
			int temp = ch[i];
			if ( (65 <= temp) && ( temp <= 67)  ) {
				result += 3;
			} else if ( (68 <= temp) && ( temp <= 70) ) {
				result += 4;
			} else if ( (71 <= temp) && ( temp <= 73) ) {
				result += 5;
			} else if ( (74 <= temp) && ( temp <= 76) ) {
				result += 6;
			} else if ( (67 <= temp) && ( temp <= 79) ) {
				result += 7;
			} else if ( (80 <= temp) && ( temp <= 83) ) {
				result += 8;
			} else if ( (84 <= temp) && ( temp <= 86) ) {
				result += 9;
			} else if ( (87 <= temp) && ( temp <= 90) ) {
				result += 10;
			} else {
				result += 0;
			}
		}
		System.out.println(result);
	}
}