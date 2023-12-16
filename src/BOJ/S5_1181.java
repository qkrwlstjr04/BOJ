package BOJ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class S5_1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] str = new String[N];
		
		for ( int i = 0; i < N; i++) {
			str[i] = sc.next();
		}
		
		for ( int i = 1; i <= 50; i++) {
			int cnt = 0;
			for ( int j = 0; j < N; j++) {
				if ( str[j].length() == i ) {
					cnt++;
				}
			}
			String[] temp = new String[cnt];
			for ( int j = 0, q = 0; j < N; j++) {
				if ( str[j].length() == i ) {
					temp[q] = str[j];
					q++;
				}
			}
			HashSet<String> hashSet = new HashSet<>(Arrays.asList(temp));
			String[] resulttemp = hashSet.toArray(new String[0]);
			Arrays.sort(resulttemp);
			for ( int j = 0; j < resulttemp.length; j++) {
				System.out.println(resulttemp[j]);
			}
		}
	}
}