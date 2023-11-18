package BOJ;

import java.util.Scanner;

public class S5_25206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] str = new String[20]; // 과목명
		double[] score = new double[20]; // 학점
		String[] grade = new String[20]; // 등급
		double sum = 0.0; // (학점*과목평점)의 합
		double sum2 = 0.0; // 학점의 총합
		for ( int i = 0; i < 20; i++) { // 20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.
			str[i] = sc.next();
			score[i] = sc.nextDouble();
			grade[i] = sc.next();
		}
		
		for ( int i = 0; i < 20; i++) { // 20번 반복
			switch (grade[i]) {
				case "A+" :
					sum += score[i] * 4.5;
					sum2 += score[i];
					break;
				case "A0" :
					sum += score[i] * 4.0;
					sum2 += score[i];
					break;
				case "B+" :
					sum += score[i] * 3.5;
					sum2 += score[i];
					break;
				case "B0" :
					sum += score[i] * 3.0;
					sum2 += score[i];
					break;
				case "C+" :
					sum += score[i] * 2.5;
					sum2 += score[i];
					break;
				case "C0" :
					sum += score[i] * 2.0;
					sum2 += score[i];
					break;
				case "D+" :
					sum += score[i] * 1.5;
					sum2 += score[i];
					break;
				case "D0" :
					sum += score[i] * 1.0;
					sum2 += score[i];
					break;
				case "F" :
					sum += score[i] * 0.0;
					sum2 += score[i];
					break;
				case "P" :
					break;
			}
		}
		
		System.out.println(sum/sum2);
	}
}
