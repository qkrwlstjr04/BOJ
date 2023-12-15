package BOJ;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class S5_11650 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] arrays = new int[N][2];
		
		for ( int i = 0; i < N; i++) {
			for ( int j = 0; j < 2; j++) {
				arrays[i][j] = sc.nextInt();
			}
		}
		
		
		Arrays.sort(arrays, new Comparator<int[]>() {
		  @Override
		  public int compare(int[] o1, int[] o2) {
		    if (o1[0] == o2[0])
		      return o1[1] - o2[1];
		    else
		      return o1[0] - o2[0];
		  }
		});
		for ( int i = 0; i < N; i++) {
			for ( int j = 0; j < 2; j++) {
				System.out.print(arrays[i][j] + " ");
			}
			System.out.println();
		}
	}
}