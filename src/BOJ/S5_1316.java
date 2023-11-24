package BOJ;

import java.util.Scanner;

public class S5_1316 { // 아직 못품
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		
		Escape ec = new Escape(); // 그룹 단어 찾기용 인스턴스 생성
		
		for ( int i = 0; i < N; i++) { // 문자열을 입력할 횟수
			String str = sc.next(); 
			char[] ch = str.toCharArray(); // 문자열을 char배열로 하나씩 넣어줌
			
			if ( str.length() < 3) { // 입력된 문자열의 길이가 1~2 이라면 그룹 단어이므로 카운트 추가
				cnt++;
				continue;
			} else { // 입력된 문자열의 길이가 3 이상이라면
				boolean result = ec.bool(str);
				if ( result == true ) {
					continue;
				} else {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
	}
}

class Escape {
	boolean bool( String str ) {
		
		boolean result = false;
		
		char[] ch = str.toCharArray();
		
		int[] num = new int[str.length()]; // 문자열의 길이만큼 int배열 선언
		for ( int k = 0; k < str.length(); k++) num[k] = k+1; // 인덱스번호 + 1 만큼 값에 순서대로 넣음
		
		for ( int j = 1; j <= ch.length - 1; j++) { // 문자열의 길이 -1 만큼 반복
			for ( int q = 0; q < ch.length; q++) { // 문자열의 길이만큼 반복
				if ( ch[q] == ch[j] ) {
					if ( num[j] - num[q] > 1 ){
						result = true;
						return true;
					}
				}
			}
		}
		return result;
		
	}
}
