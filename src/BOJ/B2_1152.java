package BOJ;

import java.util.Scanner;

public class B2_1152 {
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int cnt = 1;
		
		char[] ch = str.toCharArray();
		
		for ( int i = 0; i < str.length(); i++) {
			switch (ch[i]) {
				case ' ' :
					cnt++;
					break;
				default :
					break;
			}
		}
		if ( ch[0] == ' ') {
			cnt--;
		}
		if ( ch[str.length() - 1] == ' ') {
			cnt--;
		}
		System.out.println(cnt);
		
		/*
		 * 첫 번째 제출 시도 틀림 (약 14%)
		 * 이유 (예상) : 단순히 문자열에 공백이 있을 경우 카운트를 세어 출력함 . 문자열이 공백으로 시작하거나 끝날 수 있다는걸 생각하지 못함
		 * 수정 : 문자열의 앞이나 뒤에 공백이 있을 경우 cnt를 빼줌 
		 */
	}
}
