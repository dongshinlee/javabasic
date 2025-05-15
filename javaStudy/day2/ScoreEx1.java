package javaStudy.day2;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 동적가변배열 : Outer 의 길이만 생성하고, inner 배열은 필요시에 동적으로 생성하는 문법 잘 안쓰임
		 */
		char[][] stars = new char[10][];

		for (int i = 0; i < stars.length; i++) {
			// Outer 의 inner 로 로직을 태울 때 inner 배열을 생성한다.
			// 참고로 자바 배열은 값이 들어갈 공간이 생성되지 않을 시 값 access 하면 예외가 발생
			stars[i] = new char[i + 1];
			for (int j = 0; j < stars[i].length; j++) {
				stars[i][j] = '*';

				System.out.print(stars[i][j]);
			}
			System.out.println();
		}

		// 배열 copy
		/*
		 * 특정 배열의 값을 유지한채, 배열을 더 늘리고 싶을떄 자바에서는 한번 생성된 배열은 크기 변경할 수 없다 새 배열을 생성, 기존 배열을
		 * 순회해서 값을 복사해서 넣어야 하는 번거로움 해결하기 위한 API
		 */

		int[] oldArr = { 1, 2, 3 };
		int[] newArr = new int[100];
		
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
		
		System.out.println(Arrays.toString(newArr));

		/*
		 * 점수 문제
		 * 
		 * Scanner scanner = new Scanner(System.in); System.out.println("이름 입력 : ");
		 * String userName = scanner.nextLine();
		 * 
		 * String[] subject = {"국어 입력 : ", "수학 입력 : ", "영어 입력 : "}; int[] score = new
		 * int[subject.length + 1];
		 * 
		 * for (int i = 0; i < subject.length; i++) { do {
		 * System.out.println(subject[i]); score[i] = scanner.nextInt(); }
		 * while(score[i] < 0 || score[i] > 100);
		 * 
		 * score[subject.length] += score[i]; }
		 * 
		 * System.out.println(Arrays.toString(score));
		 * 
		 * // 평균 구해보세요 double avg = score[subject.length] / 3.0;
		 * 
		 */

		/*
		 * int kor, eng, math, sum; double avg; char grade;
		 * 
		 * System.out.println("너의 이름은?"); String name = scanner.nextLine();
		 * 
		 * do { System.out.println("국어 점수 입력하세요"); kor = scanner.nextInt(); } while (kor
		 * < 0 || kor > 100);
		 * 
		 * 
		 * do { System.out.println("영어 점수 입력하세요"); eng = scanner.nextInt(); } while (eng
		 * < 0 || eng > 100);
		 * 
		 * do { System.out.println("수학 점수 입력하세요"); math = scanner.nextInt(); }
		 * while(math < 0 || math > 100);
		 * 
		 * sum = kor + eng + math; avg = sum / 3.0;
		 * 
		 * switch((int)(avg / 10)) { case 10: case 9: case 8 : grade = 'A'; break; case
		 * 7 : grade = 'B'; break; default : grade = 'F'; break; }
		 * 
		 * System.out.println("국어" + kor); System.out.println("영어" + eng);
		 * System.out.println("수학" + math); System.out.println("합" + sum);
		 * System.out.println("평균" + avg);
		 * 
		 * System.out.printf("%s님의 결과는 %c입니다",name,grade);
		 * 
		 */

	}

}
