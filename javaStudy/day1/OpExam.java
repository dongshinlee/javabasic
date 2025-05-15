package javaStudy.day1;
/*
 * 자바 연산자 : 자바스크립트와 완전 같음. 순서까지 같음
 * 몇가지 차이가 있는 것만 확인
 */
public class OpExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수형의 오버플로우, 언더플로우에 대해서
		// 오버플로우는 정수에 선, 후행 연산이 가해진 후 지정된 범위의 값을 넘어설 때 발생하는 오류를 뜻함
		// 하나의 예를 들면, byte의 max 값은 127임. 만약 128을 byte에 초기화 하면 에러
		// 하지만 127을 담고, 이후 선후행 증가 연산을 하게 되면, 오버플러우가 발생되어서,
		// -128로 변환이 됨.. 이러한 형태를 잘 알고 사용해야함
		
		byte bb = 125;
		
		for (int i = 0; i < 5; i++) {
			bb++;
			System.out.println("bb:" + bb);
		}
		
		// 정확한 계산은 정수로 하세요 . float 은 부동소수점으로 처리하기 때문에 값이 변할 가능성이 있습니다.
		
		int apple = 1;
		double pieceUnit = 0.1;
		int totalP = apple * 10;
		int number = 7;
		
		double result = totalP - number;
		
		System.out.println("사과 1개에서 남은 양:" + result/10.0);
		
		/*
		 * == 연산자.. P type 끼리의 연산시엔 값이 같은지를 물어보고, true / false 를 리턴하고
		 * R type 끼리 물어보면 같은 객체 즉 Reference 가 같으면 true 아니면 false 리턴함
		 */
		
		/* 문제 3
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		
		System.out.println(sum + "\n정답입니다!!"); 
		 */
		
		/* 문제 4
		
		int dice1 = 0, dice2 = 0, sum = 0;
		
		while(sum != 5) {
			dice1 = (int)(Math.random()*6) + 1;
			dice2 = (int)(Math.random()*6) + 1;
			
			sum = dice1 + dice2;
		}
		
		System.out.printf("(%d, %d)", dice1, dice2);
		
		*/
		/* 문제5
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}	
			System.out.print("\n");
		}
		*/
		
		/* 문제 6
		char start = 'A';
		for (int i = 0; i <= 25; i++) {
			for (int j = i; j <= 25; j++) {
				System.out.printf("%c",start + j);
			}
			System.out.println();
		}
		*/
		
		char start = 'A';
		for (int i = 0; i <= 25; i++) {
			for (int j = i; j <= (25 - i); j++) {
				System.out.printf("%c",start + j);
			}
			if (i > 11) break;
			System.out.println();
		}
	}

}
