package javaStudy.day1;

import java.util.Scanner;

//import javax.swing.JOptionPane;

/*
 * System.in.read() 가 입력값을 처리하기 넘 ㅜ귀찮아서, 이를 향상시킨 API 인 Scanner 객체가 나옴
 * 이 객체를 이용하면, 콘솔로부터 입력된 값을 문자열로 쉽게 처리 가능함
 * Scanner 는 사용하기전에 반드시 import java.util.Scanner 를 해야함 (알아서 해줌)
 */
public class SystmeInStudy2 {

	public static void main(String[] args) {
		
		// 아래는 scanner 객체를 생성하는 코드임. 나중에 깊이 배울때까지 생성법만 알아두기
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫 수 입력하세요");
			String first = scanner.nextLine();
			System.out.println("입력된 수는 " + first);
			
			System.out.print("두번째 수 입력하세요");
			String second = scanner.nextLine();
			System.out.println("입력된 수는 " + second);
			
			int firstNum = Integer.parseInt(first);
			int secondNum = Integer.parseInt(second);
			
			int sum = firstNum + secondNum;
			System.out.println("두 수의 합은 " + sum);
			
			System.out.println("더할래?(Y or N)");
			
			String answer = scanner.nextLine();
			
			// 문자열 내의 값을 비교할 때는 equals() 사용
			if (answer.equals("Y")) {
				continue;
			}
			else if (answer.equals("N")) {
				System.out.println("프로그램 종료함");
				break;
			}
		}
		
		scanner.close();
		
		//JOptionPane.showInputDialog("첫 수 입력 하세요");

	}

}
