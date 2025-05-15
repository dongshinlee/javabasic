package javaStudy.day2;

import java.util.Scanner;

/*
 * 아래의 로직에 맞게 코드를 작성하세요
 * 
 * 수 세개를 입력 받습니다. 이 수를 작은수 --> 큰수로 나열하도록 하세요
 * ex> 2, 5, 1 입력 되었다면, 1 <= 2 <= 5
 * 
 * TIP 변수 4개 필요
 */
public class SortingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int temp;
		
		System.out.print("첫번째 수 입력하세요");
		int num1 = scanner.nextInt();
		
		System.out.print("두번째 수 입력하세요");
		int num2 = scanner.nextInt();
		
		System.out.print("세번째 수 입력하세요");
		int num3 = scanner.nextInt();
		
		// num1 < num2 < num3
		if (num1 > num2) {
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		if (num2 > num3) {
			temp = num3;
			num3 = num2;
			num2 = temp;
		}
		if (num1 > num2) {
			temp = num2;
			num2 = num1;
			num1 = temp;
		}	
		
		System.out.printf("%d <= %d <= %d",num1,num2,num3);
	}

}
