package BOJ;

import java.util.Scanner;

public class B2_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int temp = A * B * C;
		
		String str = temp+"";
		
		int[] cnt = new int[10];
		
		for ( int i = 0; i < str.length(); i++) {
			switch (str.charAt(i) - 48) {
			case 0:
				cnt[0]++;
				break;
			case 1:
				cnt[1]++;
				break;
			case 2:
				cnt[2]++;
				break;
			case 3:
				cnt[3]++;
				break;
			case 4:
				cnt[4]++;
				break;
			case 5:
				cnt[5]++;
				break;
			case 6:
				cnt[6]++;
				break;
			case 7:
				cnt[7]++;
				break;
			case 8:
				cnt[8]++;
				break;
			case 9:
				cnt[9]++;
				break;
			}
		}
		for ( int i = 0; i < 10; i++) {
			System.out.println(cnt[i]);
		}
		
	}
}
