package BOJ;

import java.util.Scanner;

public class B3_5086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[2];
		
		while (true) {
			num[0] = sc.nextInt();
			num[1] = sc.nextInt();
			
			if ( num[0] < num[1] ) {
				if ( num[1] % num[0] == 0 ) {
					System.out.println("factor");
				} else {
					System.out.println("neither");
				}
			}
			if ( num[0] > num[1] ) {
				if ( num[0] % num[1] == 0 ) {
					System.out.println("multiple");
				} else {
					System.out.println("neither");
				}
			}
			
			if ( (num[0] == 0) && (num[1] == 0) ) {
				break;
			}
		}
	}
}
