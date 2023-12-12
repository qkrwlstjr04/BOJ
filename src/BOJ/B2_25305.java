package BOJ;

import java.util.Scanner;
import java.util.Arrays;

public class B2_25305 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int cut = sc.nextInt();
		
		for ( int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int[] arr2 = new int[N];
		int j = 0;
		
		for ( int i = N; i > 0; i--) {
			arr2[i-1] = arr[j];
			j++;
		}
		
		System.out.println(arr2[cut-1]);
		
	}
}