package BOJ;

import java.util.Scanner;

public class S5_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		boolean tok = false;
		
		for ( int i = 0; i < N; i++) { // 문자열을 입력할 횟수
			String str = sc.next(); 
			char[] ch = str.toCharArray(); // 문자열을 char배열로 하나씩 넣어줌
			
			int[] num = new int[str.length()]; // 문자열의 길이만큼 int배열 선언
			for ( int k = 0; k < str.length(); k++) num[k] = k+1; // 인덱스번호 + 1 만큼 값에 순서대로 넣음
			
			if ( str.length() == 1) {
				cnt++;
			} else {
				for ( int j = 1; j <= ch.length - 1; j++) {
					for ( int q = 0; q < ch.length; q++) {
						if ( ch[q] == ch[j] ) {
							if ( (num[j] - num[q] == 1) && (num[j] - num[q] == 0) ) {
								continue;
							} else {
								tok = false;
								break;
							}
						} else {
							tok = true;
							break;
						}
					}
				}
				if ( tok == true ) cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}
