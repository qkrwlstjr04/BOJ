package BOJ;

import java.util.Scanner;

public class B5_11654 { // 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.nextLine().charAt(0); // charAt(index) : 문자열에서 해당위치 문자반환

		System.out.println((int)ch);
	}
}