package BOJ;

import java.util.Scanner;

public class B5_10951 { //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램. 아직 못품
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = 0, B = 0;
		
		while (true) {
			A = sc.nextInt();
			B = sc.nextInt();
			if ( (0 < (A+B)) && ((A+B) < 19) ) {
				System.out.println(A+B);
				continue;
			}
			else {
				break;
			}
		}
		
	}
}
