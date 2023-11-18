package BOJ;

import java.util.Scanner;

public class B1_10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] ch = new char[15][15];
		String[] str = new String[5];
		
		for ( int i = 0; i < 5; i++) {
			str[i] = sc.next();
		}
		
		for ( int i = 0; i < 5; i++) {
			for ( int j = 0; j < str[i].length(); j++) {
				ch[i][j] = str[i].charAt(j);
			}
		}
		

		
		for ( int i = 0; i < 15; i++) {
			for ( int j = 0; j < 15; j++) {
				if ( ch[j][i] > 0) {
					System.out.print(ch[j][i]);
				}
			}
		}
	}
}
