package BOJ;

import java.util.Scanner;

public class B5_5597 { // 1 ~ 30의 숫자가 무작위 순서로 28 개가 주어질때 (중복안됨)남은 두개의 숫자를 찾는 문제  *아직 못품
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] std = new int[28];
		int[] num = new int[30];
		int cnt1 = 0, cnt2 = 0;
		int result = 0;
		
		for ( int i = 0; i < 30; i++) {
			num[i] = i+1;
		}
		
		for ( int i = 0; i < 28; i++) {
			std[i] = sc.nextInt();
		}
		
		while (true) {
			if ( std[cnt1] == num[cnt2]) {
				cnt2++;
				cnt1 = 0;
				continue;
			}
			else if ( std[cnt1] != num[cnt2]) {
				cnt1++;
				continue;
			}
			
		}
		
		
		
	}
	
}

