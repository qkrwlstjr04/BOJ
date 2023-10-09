package BOJ;


import java.util.Scanner;
public class B5_25314 { // 입력되는 수는 4의 배수.  4의 배수마다 Long 출력하는 프로그램 
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		N = N / 4;
		
		for ( int i = 0; i < N; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}
}
