package BOJ;

import java.util.Scanner;

public class B2_2675 { // 각 문자를 반복하여 출력하는 문제 * 아직 못품
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int R; // 반복 횟수
		String str; // 반복할 문자열
		
		for ( int i = 0; i < T; i++) {
			R = sc.nextInt();
			str = sc.next();
			char[] ch_arr = str.toCharArray();
			char[] result = new char[ch_arr.length];
			for ( int j = 0; j < ch_arr.length; j++) {
				for ( int k = 0; k < R; k++) {
					result[j] = ch_arr[j];
				}
			}
			String s = new String(result);
			System.out.println(s);
		}
	}
}
