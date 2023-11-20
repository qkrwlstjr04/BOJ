package BOJ;

import java.util.Scanner;

public class B3_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int[] xx = {w-x,0+x};
		int[] yy = {h-y,0+y};
		
		int tempx = 0, tempy = 0;
		
		if ( xx[0] > xx[1] ) {
			tempx = xx[1];
		} else {
			tempx = xx[0];
		}
		
		if ( yy[0] > yy[1] ) {
			tempy = yy[1];
		} else {
			tempy = yy[0];
		}
		
		if ( tempx < tempy ) {
			System.out.println(tempx);
		} else {
			System.out.println(tempy);
		}
	
	}
}