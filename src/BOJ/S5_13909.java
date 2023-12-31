package BOJ;

import java.util.Scanner;

public class S5_13909 { // 아직 못품 (메모리 초과)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for ( int i = 0; i < N; i++ ) arr[i] = 0;
		
		for ( int i = 1; i <= N; i++) {
			
			for ( int j = i; j <= N; j += i) {
				
				if ( arr[j-1] == 0 ) {
					arr[j-1] = 1;
				} else {
					arr[j-1] = 0;
				}
				
			}
			
		}
		
		int result = 0;
		
		for ( int i = 0; i < N; i++) {
			if ( arr[i] == 1 ) result++;
		}
		
		System.out.println(result);
	}
}
