package javaStudy.day1;

import java.util.Scanner;

public class RockPaperScissors {

	public static int compare(String user, String com) {
		if (user.equals("가위")) {
			if (com.equals("가위")) {
				System.out.println("무승부");
				return 1;
			} else if (com.equals("바위")) {
				System.out.println("패배");
				return 2;
			} else {
				System.out.println("승리");
				return 0;
			}
		} else if (user.equals("바위")) {
			if (com.equals("가위")) {
				System.out.println("승리");
				return 0;
			} else if (com.equals("바위")) {
				System.out.println("무승부");
				return 1;
			} else {
				System.out.println("패배");
				return 2;
			}
		} else if (user.equals("보")) {
			if (com.equals("가위")) {
				System.out.println("패배");
				return 2;
			} else if (com.equals("바위")) {
				System.out.println("승리");
				return 0;
			} else {
				System.out.println("무승부");
				return 1;
			}
		}
		// exception
		else
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int win = 0, draw = 0, lose = 0;

		while (true) {
			System.out.println("가위 바위 보 입력하세요");
			String userInput = scanner.nextLine();
			
			if (userInput.equals("가위") || userInput.equals("바위") || userInput.equals("보")) {
				System.out.println("사용자: " + userInput);
			} else {
				System.out.println("'가위' '바위' '보' 중 하나만 입력하세요");
				continue;
			}

			int randomNum = (int) (Math.random() * 3);
			String computerInput;

			if (randomNum == 0) {
				computerInput = "바위";
			} else if (randomNum == 1) {
				computerInput = "보";
			} else {
				computerInput = "가위";
			}

			System.out.println("컴퓨터: " + computerInput);

			int res = compare(userInput, computerInput);
			if (res == 0)
				win++;
			else if (res == 1)
				draw++;
			else if (res == 2)
				lose++;

			System.out.printf("%d승 %d무 %d패\n", win, draw, lose);

			while (true) {
				System.out.print("다시 하시겠습니까? (Y or N)");
				String retry = scanner.nextLine();
				if (retry.equals("Y")) {
					break;
				} else if (retry.equals("N")) {
					System.out.print("프로그램 종료");
					scanner.close();
					return;
				} else
					System.out.println("Y 또는 N 을 입력해주세요");
			}

		}
	}

}
