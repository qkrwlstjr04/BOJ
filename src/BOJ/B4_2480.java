package BOJ;


import java.util.Scanner;

public class B4_2480 { // 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 나온 값에 따라 상금을 받는 게임
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dice1 = sc.nextInt(), dice2 = sc.nextInt(), dice3 = sc.nextInt(); // 1 부터 6 까지의 눈을 가진 3개의 주사위 변수
		int result = 0; // 답 출력용 변수
		
		
		if (( dice1 == dice2) && (dice1 == dice3 )) { // 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
			result = (dice1 * 1000) + 10000;
		}
		else if ( dice1 == dice2 ) { // 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
			result = (dice1 * 100) + 1000;
		}
		else if ( dice1 == dice3 ) { // 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
			result = (dice1 * 100) + 1000;
		}
		else if ( dice2 == dice3 ) { // 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
			result = (dice2 * 100) + 1000;
		}
		else { // 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
			if ( (dice1 > dice2) && (dice1 > dice3) ) { // dice1 이 가장 클 때
				result = dice1 * 100;
			}
			else if ( (dice2 > dice1) && (dice2 > dice3) ) { // dice2 가 가장 클 때 
				result = dice2 * 100;
			}
			else if ( (dice3 > dice2) && (dice3 > dice1) ) { // dice3 이 가장 클 때 
				result = dice3 * 100;
			}
		}

			
		System.out.println(result); // 최종 답 출력
	}
}
