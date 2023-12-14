package BOJ;

import java.util.Scanner;
import java.util.Arrays;

public class S5_1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String str = sc.next();
		int[] arr = new int[str.length()];
		
		
		
		for ( int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i) - 48;
		}
		
		Arrays.sort(arr);
		int[] arr2 = new int[str.length()];
		int j = 0;
		
		for ( int i = str.length(); i > 0; i--) {
			arr2[i-1] = arr[j];
			j++;
		}
		
		for ( int i = 0; i < str.length(); i++) {
			System.out.print(arr2[i]);
		}
		
		
	}
}