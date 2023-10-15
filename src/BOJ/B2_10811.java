package BOJ;

import java.util.Scanner;

public class B2_10811 { // 배열을 뒤집는 문제 . (푸는데 오래 걸림)
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 바구니 개수 입력
		int[] basket = new int[N]; // 바구니 개수만큼 배열 선언
		int M = sc.nextInt(); // 바구니 순서를 역순으로 만들 횟수
		
		// 바구니의 순서를 역순으로 만드는 방법이 주어진다. 방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다
		int i, j;
		
		int temp = 0; // 빈 공간 선언초기화 
		
		for ( int q = 0; q < N; q++) { // N 번 실행 . 바구니의 배열에 순서 넣기
			basket[q] = q+1;
		}
		
		for ( int p = 0; p < M; p++) { // M 번 실행 . 순서를 i 번째 바구니부터 j 번째 바구니까지의 순서를 역순으로 
			i = sc.nextInt();
			j = sc.nextInt();
			
			for ( int q = i; q < j; q++) { // j - i 만큼 실행
				// 빈 공간을 통해 순서 교환
				temp = basket[i-1];
				basket[i-1] = basket[j-1];
				basket[j-1] = temp;
				
				// *** 중요 ***
				// i(1) j(4) 가 들어갈 경우 총 3 번 반복문이 실행되고 첫번째 바구니와 4번째 바구니가 교환되는데
				// 첫번째 바구니와 네번째 바구니만 3번 교환될 뿐 두번째 바구니와 세번째 바구니는 교환이 안되서 i와 j에 후위 증감연산함
				i++;
				j--;
			}
		}
		
		for ( int a = 0; a < N; a++) { // N 번 실행. 바구니에 든 값 출력
			System.out.print(basket[a] + " ");
		}
		
	}
}
