package javaStudy.day2;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;

		String str = null;

		str = "안녕";
		System.out.println(str);

		// null 객체의 메서드 호출
		System.out.println(str.toString());

		String str2 = "안녕";

		if (str == str2) {
			System.out.println("같은 객체입니다. 당연히 값도 같습니다");
		}

		// 생성자를 이용해서 같은 값의 문자열객체 생성해보기
		str2 = new String("안녕");

		if (str == str2) {
			System.out.println("같은 객체입니다. 당연히 값도 같습니다");
		} else {
			System.out.println("틀린 객체입니다. 값이 같은지는 모르겠네요");
		}

		// 다른 문자열 객체간의 값이 같은지를 문자열 객체의 메서드를 이용해서 알아보자
		if (str2.equals(str)) {
			System.out.println("같은 객체인지 모르지만, 값은 같습니다");
		} else {
			System.out.println("같은 객체인지 모르지만, 값은 틀리네요");
		}

		String str3 = "ABC";
		String str4 = "abc";

		if (str3.equalsIgnoreCase(str4)) {
			System.out.println("같은 문자열(대소문자 구분없음)");
		}

		System.out.println(str3.charAt(0));

		int leng = str4.length();
		System.out.println(leng);
		for (int i = 0; i < str4.length(); i++) {
			char ch = str4.charAt(i);
			System.out.println(ch);
		}

		String myName = "이동신";
		for (int i = 0; i < myName.length(); i++) {
			System.out.println(myName.codePointAt(i));
			System.out.println((char) myName.codePointAt(i));
		}

		// concat(str) : + 와 같은 역할, 문자열을 합친 새로운 객체(instance)를 생성해서 그 ref를 리턴시킨다
		myName = myName.concat("쌤");
		System.out.println(myName);
		System.out.println(myName);

		String mymail = "abc@abc.com";
		if (mymail.endsWith(".com")) {
			System.out.println(".com으로 끝나네요.");
		}

		System.out.println(mymail);
		/*
		 * 이메일을 입력 받아서 노가다로 검증하는 로직을 작성합니다. 이메일은 @을 기준으로 앞은 id, 뒤는 메일서버로 구분됩니다. 때문에 @을
		 * 기준으로 분리해야 하는데, 이때 subString()을 이용하면 편함 분리된 이메일은 ID는 6~10자 사이, 반드시 영문자와 숫자로만
		 * 구성되어야 함 첫자로는 숫자가 올 수 없어야함 서버는 반드시 .com, .net, co.kr 로 끝나야 합니다. 이 조건을 검증하는 로직을
		 * 작성하고, 만약 위배시엔 어떤 조건을 위배했는 지에 대한 내용을 콘솔에 찍어야 합니다. ex. id의 첫자에 숫자가 있음. 이런식
		 */

		/*
		 * int atIdx = -1; String eId = null, mailServer = null;
		 * 
		 * if(mymail.indexOf('@') != -1) { atIdx = mymail.indexOf('@');
		 * 
		 * mailServer = mymail.substring(atIdx+1); eId = mymail.substring(0, atIdx);
		 * System.out.println(mailServer); System.out.println(eId); }
		 * 
		 * System.out.println(" hello".trim().length());
		 */

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
