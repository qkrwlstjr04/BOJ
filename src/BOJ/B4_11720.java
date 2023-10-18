package BOJ;

import java.util.Scanner;

public class B4_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = 0;
		
		int[] arr = new int[N];
		
		String num = sc.next();
		char[] num2 = num.toCharArray(); 
		
		
		for ( int i = 0; i < num2.length; i++) {
			arr[i] = num2[i];
		}
		
		for ( int i = 0; i < num2.length; i++) {
			result += arr[i] - '0';
		}
		
		System.out.println(result);
	}
}
