package BOJ;

import java.util.Scanner;

public class B5_9086 { // 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String ch;
		int len = 0;
		
		for ( int i = 0; i < T; i++) {
			ch = sc.next();
			len = ch.length(); // 해당 문자열의 길이 출력
			System.out.print(ch.charAt(0)); // charAt(index) : 문자열에서 해당 위치 문자 반환
			System.out.println(ch.charAt(len-1));
		}
	}
}
