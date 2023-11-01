package BOJ;

import java.util.Scanner;

public class B2_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char temp;
		int[] num = new int[2];
		
		
		for ( int i = 0; i < 2; i++) {
			String str = sc.next();
			char[] ch = str.toCharArray();
			
			temp = ch[0];
			ch[0] = ch[2];
			ch[2] = temp;
			
			num[i] = (((int)ch[0] - 48)*100) + (((int)ch[1] - 48)*10) + ((int)ch[2] - 48);
		}
		
		if ( num[0] > num[1]) {
			System.out.println(num[0]);
		}
		else {
			System.out.println(num[1]);
		}

	}
}