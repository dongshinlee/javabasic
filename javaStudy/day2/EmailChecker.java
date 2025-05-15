package javaStudy.day2;

import java.util.Scanner;

public class EmailChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int atIdx = -1;
		String eId = null, mailServer = null;

		Scanner scanner = new Scanner(System.in);
		System.out.println("이메일을 입력하세요");
		String enteredMail = scanner.nextLine();

		// 이메일 형식인지 검증
		if (enteredMail.indexOf('@') != -1) {
			atIdx = enteredMail.indexOf('@');

			mailServer = enteredMail.substring(atIdx + 1);
			eId = enteredMail.substring(0, atIdx);

			if (eId.length() < 6 || eId.length() > 10) { // id 길이 검증
				System.out.println("이메일 아이디 부분은 6~10자 사이여야 합니다");
			}

			// 첫자 숫자검증
			else if ('0' <= eId.charAt(0) && '9' >= eId.charAt(0)) {
				System.out.println("이메일 첫자는 숫자 불가능");
			}
			// 메일주소 검증
			else if (!(mailServer.endsWith(".com") || mailServer.endsWith(".net") || mailServer.endsWith(".co.kr"))) {
				System.out.println(".com / .net / .co.kr 중 하나로 끝나야 해요.");
			}

			else {
				// 영문자 숫자 검증
				for (int i = 0; i < eId.length(); i++) {
					if (('A' > eId.charAt(i) || 'Z' < eId.charAt(i)) && ('a' > eId.charAt(i) || 'z' < eId.charAt(i))
							&& ('0' > eId.charAt(i) || '9' < eId.charAt(i))) {
						System.out.println("영문자 혹은 숫자만 입력하세요");
					}
				}
			}
		} else {
			System.out.println("이메일 형식으로 입력하세요 (@ 포함)");
		}
		
		scanner.close();
	}

}
