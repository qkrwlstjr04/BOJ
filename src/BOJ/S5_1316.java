package BOJ;

import java.util.Scanner;

public class S5_1316 { // 아직 못품
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Run r = new Run();
		
		
		int N = sc.nextInt();
		int cnt = 0;
		
		
		for ( int i = 0; i < N; i++) {
			
			String str = sc.next();
			boolean result = false;
			result = r.escape(str);
			if ( result == true) {
				continue;
			} else {
				cnt++;
			}
			
		}
		System.out.println(cnt);
		
		
	}	
}

class Run {
	boolean result;
	
	
	boolean escape( String str ) {
	
		char[] abc = new char[26];
		for ( int i = 0; i < 26; i++) abc[i] = (char)(i+97);
		int[] Num = new int[26];
		for ( int i = 0; i < 26; i++) Num[i] = -1;
		
		char[] ch = str.toCharArray();
		
		for ( int i = 0; i < ch.length; i++) { // 문자 하나씩 검사
			for ( int j = 0; j < 26; j++) {
				if ( abc[j] == ch[i] ) {
					if ( Num[j] == -1) {
						Num[j] = 1;
						break;
					} else if ( Num[j] == 1) {
						if ( ch[i] == ch[i-1]) {
							break;
						} else {
							return true;
						}
					}
				}
			}
		}
		
		
		
		return false;
	}
}
