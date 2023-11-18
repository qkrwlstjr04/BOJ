package BOJ;

import java.util.Scanner;

public class S5_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String str1 = str + " ";
		String str2 = str + "  ";
		
		String temp1, temp2;
		char[] ch = str.toCharArray();
		int cnt = 0, num = 0;
		String dzz = new String("dz=");
		
		for ( int i = 0; i < str.length(); i++) { // 입력된 문자열의 길이 -1 반복
			temp1 = ""; temp2 = ""; // 값 초기화
			
			temp1 = str1.substring(i,i+2);
			temp2 = str2.substring(i,i+3);
			
			if ( temp2.equals(dzz)) {
				cnt++;
				i += 2;
				num++;
				continue;
			} else {
				switch (temp1) {
				case "c=": case "c-": case "d-": case "lj": case "nj": case "s=": case "z=":
					cnt++;
					i++;
					break;
				}
				num++;
				if (!( cnt == num)) {
				cnt++;
				}
			}
			
		}
		
		System.out.println(cnt);
		
	}
}