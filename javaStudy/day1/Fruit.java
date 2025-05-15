package javaStudy.day1;

//Fruit.class 를 아래처럼 정의하세요
		// main 내부에
		// 아래의 로직을 정의하고 결과를 출력시키세요
		
		/*
		 * 여러분이 과수원을 한다라고 가정합니다
		 * 재배 과일로는 사과, 배, 오렌지 가 있고, 각각 하루에 3, 5, 3 개씩 생산이 되어집니다.
		 * 과수원의 하루 총 생산량(과일합산) 을 출력하고, 시간당 생산량을 출력시키세요
		 * 단 아래의 조건을 모두 만족해야 합니다.
		 * 
		 * 1. 최대한의 변수를 활용하세요
		 * 2. 시간당 결과는 소숫점으로 나올겁니다.
		 * 3. 한번의 리터럴과 한번의 캐스팅 연산을 사용하세요
		 */

public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple, pear, orange, sum;
		double sum_per_hour;
		
		apple = 3;
		pear = 5;
		orange = 3;
		
		sum = apple + pear + orange;
		
		sum_per_hour = (double)sum / 24;
		
		System.out.println(sum);
		System.out.println(sum_per_hour);
		
	}

}
