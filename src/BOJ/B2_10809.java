package BOJ;

import java.util.Scanner;

public class B2_10809 { // 한 단어에서 각 알파벳이 처음 등장하는 위치를 찾는 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next(); // 문자 입력
		
		char[] ch = str.toCharArray(); // 문자를 char 배열로 
		
		char[] alphabet = new char[26]; // 알파벳 a~z까지 넣기위한 배열 선언
		// 알파벳 a~z까지 넣기
		for ( int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char)(97 + i);
		}
		
		/*
		for ( int i = 0; i < alphabet.length; i++) { // 알파벳 a~z까지에 숫자를 0부터 25까지 숫자를 매겨서 출력
			System.out.println(alphabet[i] + " " + i);
		}
		*/
		
		int[] num = new int[26]; // 답 출력용 배열 , 안에 다 -1 이 들어가있음
		for ( int i = 0; i < num.length; i++) { // 26번 실행
			num[i] = -1; // 배열안에 모두 -1을 넣음
		}
		
		
		for ( int i = 0; i < str.length(); i++) { // 입력 받은 문자만큼 반복 실행
			for ( int j = 0; j < num.length; j++) { // 26번 실행
				if ( ch[i] == alphabet[j] ) {
					if (num[j] == -1) {
						num[j] = i;
					}
					break;
				}
			}
		}
		
		
		
		for ( int i = 0; i < num.length; i++) { // 26번 실행
			System.out.print(num[i] + " "); // 답 출력
		}
		
	}
}
