package javaStudy.day2;

/*
 * 열거형 상수를 정의 하고, 이를 다른 클래스에서 비교값으로 활용할 수 있또록 정의하는 목적을 가진 
 * 애를 Enum 이라고 합니다
 */

public enum Week {
	// 내부의 필드(변수;; 앞으로는 지역 변수 외에는 모두 필드로 명칭을 통일합니다)
	// 는 상수 이기때문에 상수의 형태를 유지해서 선언합니다.
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY
}
