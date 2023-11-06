package BOJ;

import java.util.Scanner;

public class B1_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		int[] temp = new int[str.length()]; // 문자를 숫자로 치환해서 넣어둘 공간  | A(a) ~ Z(z) => 1 ~ 26
		int[] result = new int[26]; // 알파벳 개수만큼 선언 , 어떤 문자가 가장 많은지 비교하기위한 공간
		int[] num = new int[26];
		int max1 = 0, maxNum1 = 1;
		int max2 = 0, maxNum2 = 1;
		
		
		for ( int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		
		for ( int i = 0; i < str.length(); i++) {
			if ( ( 65 <= ch[i] ) && ( ch[i] <= 90 ) ) {
				temp[i] = ch[i] - 64;
			}
			else if ( ( 97 <= ch[i] ) && ( ch[i] <= 122 ) ) {
				temp[i] = ch[i] - 96;
			}
		}
		
		for ( int i = 0; i < temp.length; i++) {
			for ( int j = 0; j < 26; j++) {
				if ( temp[i] == num[j] ) {
					result[j] += 1;
				}
			}
		}
		
		max1 = result[0];
		
		for ( int i = 1; i < result.length; i++) {
			if ( max1 < result[i] ) {
				max1 = result[i];
				maxNum1 = i+1;
			} 
			else if ( max1 == result[i]) {
				max2 = result[i];
				maxNum2 = i;
			}
		}
		
		if ( max1 > max2 ) {
			System.out.println((char)(maxNum1+64));
		}
		else {
			System.out.println("?");
		}
		
		
	}
}
