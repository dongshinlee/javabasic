package javaStudy.day2;

import java.util.Scanner;

public class Score2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String[] student = new String[3];
		String[] msg = {"국어 입력: ", "수학 입력: ", "영어 입력: "};
		
		int[][] scores = new int[student.length][student.length + 1];
		double[] avg = new double[student.length];
		
		for (int i = 0; i < student.length; i++) {
			System.out.println("이름 입력: ");
			student[i] = scanner.next();
			
			// 점수를 입력 받아서 다중 배열에 넣도록 for 정의
			for (int j = 0 ; j < scores[i].length - 1; j++) {
				do {
					System.out.println(msg[j]);
					scores[i][j] = scanner.nextInt();
				} while(scores[i][j] < 0 || scores[i][j] > 100);
				scores[i][scores.length] += scores[i][j];
				
				// 평균 구하기
				avg[i] = scores[i][scores.length] / 3.0;
			}
		}
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(student[i] + "의 총점 : " + scores[i][3] + " 평균 : " + avg[i]);
		}
		
	}

}
