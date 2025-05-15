package javaStudy.day1;
/*
 * 자바의 Data Type : 일반적으로 컴퓨터 언어는 메모리에 담는 값의 타입에 따라서 데이터 타입을 엄격하게 구분짓습니다.
 * 자바도 마찬가지입니다
 * 
 * 아래의 내용은 꼭 기억하세요
 * 
 * 제가 Java의 데이터 타입을 크게 2개로 말하세요 라고 하면, 반드시 Primitive Type(P type - 원시 자료형)
 * 과 Reference Type(객체 타입)이 존재한다 라고 하시면 됩니다. ! 꼭 기 억 하 세 요 !
 * 
 *  자바는 100% 객체지향 언어이기 때문에 모든 프로그래밍은 R type 으로 이뤄진다라고 생각하세요
 *  그럼 P type 은 언제 쓰냐? 객체 내에서 데이터들이 연산 등을 수행할 때 사용되어진다 라고 생각하세요
 *  
 *  P type 은 다시 값의 타입에 따라서 아래로 구분됨
 *  
 *  수치형
 *   1. 정수형 : byte(1byte), short(2), int(4 default), long(8)
 *   2. 실수형 : float(4byte), double(8 default)
 *   수치형의 리터럴값은 모두 기본형 타입의 메모리에 할당되어집니다.
 *   
 *   연산시의 타입 변환 : 기본적으로 자바에서는 두 변수가 연산이 되어질 때, 먼저 타입 검사를 합니다.
 *   만약 타입이 기본타입 이하인 경우엔 무조건 기본타입으로 메모리를 할당, 복사후 연산 합니다. ! 꼭 기 억 !
 *   만약 기본타입 이상의 경우엔 무조건 큰 타입으로 복사후 연산합니다. ! 꼭 기 억 !
 *   
 *   3. 문자형(문자 하나만 담은 타입) : char(2byte - 음수 없음, 내부적으론 정수형태, unicode 참조)
 *   4. boolean : true / false !! 스크립트처럼 0 1, empty 등을 true / false 로 못담음. 그냥 true, false 만 존재함
 *  
 */
public class DataTypeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 리터럴을 이용한 예시
		System.out.println(10); // 내부적으로 int 메모리 할당후 값을 대입하고 출력시킨
		System.out.println(10 + 2); // int int 를 생성후 + 연산후 결과를 출력시킨다
		// 문자열객체(String)을 생성하고, double 메모리를 생성, 값을 할당후
		// 문자열 + double 연산을 처리, 최종결과가 문자열인 값을 출력시킨다
		// 문자열객체(String) + 모든 data type (P + R)의 결과는 String 임.
		System.out.println("파이의 값은 " + 3.14);
		
		// 변수의 타입 : 자바에서는 값이 사용되기 전엔 그 값의 타입이 반드시 먼저 선언이 되고, 값을 대입해야 합니다.
		// 만약 타입이 틀리거나, 범위가 벗어나면 에러 입니다.
		// 변수 선언시 주의 ! 값은 블락 내에서 재선언 절대 불가함
		
		// 변수 선언 예시
		byte b1, b2, b3;
		int k = 10;
		
		b1 = 10; // 대입
		byte b = 1; // 변수 초기화
		
		k = b + b1;
		
		// long 과 float 은 초기화시에 값 뒤에 L or l, f or F 를 넣어줘서 처음부터 메모리를 생성한다.
		long lo = 1L; // L 없이도 선언은 가능하나 붙이는게 관례
		
		// float(4 byte), double(default), float 1.4 * 10^-45 ~ 3.4 * 10^38
		System.out.println(Float.MAX_VALUE);
		
		lo = 0xAAA; // 16진수
		System.out.println(lo);
		lo = 06123; // 8진수
		System.out.println(lo);
		
		// 캐스팅 연산자 : 작은 타입을 큰 타입으로 변환하도록 하는 연산자
		// 캐스팅 연산자는 단항 연산자입니다. 때문에 우측항 하나에만 연산이 적용됩니다.
		// 사용 예
		byte bt = 1; byte bt2 = (byte)(bt + 2);
		float f2 = (float)1;
		System.out.println(f2);
		
		// char 데이터 타입 : 2byte 이며 유니코드 테이블의 문자셋을 정수로 표현한다
		// 음수가 없는 형태이기 때문에
		// 일반 수치형 데이터타입의 같은 메모리 타입과는 호환이 불가능함
		// 단 int 형과는 호환됨, 즉 promotion 및 casting 됨 (음수 빼고)
		String sung = "이"; // 문자 하나만 담을 수 있음, '' 로 묶음
		System.out.println(sung.codePointAt(0));
		
		char ch1 = '\uAbcd';
		System.out.println(ch1);
		
		char codeCh = 12335;
		
		//short sh = codeCh; 호환 불가
		int theCh = codeCh;
		
		System.out.println(codeCh);
		System.out.println((char)theCh);
		
		// boolean 타입 : true / false 만 갖는 타입. 다른 타입으로 캐스팅 불가
		boolean theFlag = false; // 조건이나 루프 등에서 사용

		System.out.println("\"\'\\\n\t하하");
		
		// promotion : casting 의 반대 개념
		// 작은 타입을 큰 타입에 대입하는 것. 특별한 문제 없이 변환 됨
		int it = 1;
		long ln = it; // 프로모션
		float fl = ln;
		double dl = fl;
		
		// 출력문 형태 알아보기
		// System.out.print("모든 P R type 및 void가 아닌 메서드 호출 가능") 결과 출력 후 커서 맨 마지막 위치
		// System.out.println ("위와 같지만 라인 개행 및 맨 처음으로 커서 이동)
		System.out.print("누군가..");
		System.out.println("이건 개행");
		System.out.println("이건 개행");
		
		// printf() : 특정 format 대로 문자열을 출력시키는 출력문, 형식은 아래와 같음
		// print("format문자열", 값1, 값2, ....)
		// format 문자열의 형식(format)은 다음과 같음
		
		/*
		 * [값의 순번],[flage(-,0)],[width(전체자릿수)],[.precision(소수 자리수)] conversion(변환 문자)
		 * 
		 * 위 메서드가 나온 이유는 기존 println() 에서는 특정 형식대로 출력을 만들 수 가 없기때문..(ex> 소수점 2자리까지만 출력하는 등으)
		 * 해서 JDK1.5부터 C의 그것과 똑같은 기능의 메서드 제공	
		 * 주의 사항!!! []은 optional 하기때문에 줘도 그만.안줘도그만. 만약 줄 경우엔 반드시 패턴에 따른 값 처리 해야함
		 * 하지만 conversion은 반드시 존재해야함
		 * conversion 문자는 d(정수), f(실수), s(문자열)이 올수 있다.
		 * 
		 *  */
		
		String name = "동신";
		int age = 30;
		
		System.out.printf("이름은 %s \n",name);
		
		System.out.printf("이름: %1$s 나이: %2$d\n", name, age);
		
		// 컨버전 형태를 좀 볼게요
		/*
		 * 정수(d) : %d 일반정수표기
		 * %자릿수d : 자릿수 정수,,왼쪽 빈자리 공백
		 * %-자릿수d : 자릿수 정수,, 오른쪽 빈자리 공백
		 * %0자릿수d : 자릿수 정수.. 왼쪽 0으로 채움
		 * 
		 * 실수(f) : %f
		 * %10.2f : 소수이하 2자리(반올림아님)
		 * 
		 * 문자열(s): %s
		 * %자릿수s : 자릿수 길이의 문자열, 공백으로 채움
		 * %% : % 채움
		 */
		
		int value = 123;
		System.out.printf("상품 가격 %6d원\n", value);
		System.out.printf("상품 가격 %-6d원\n", value);
		System.out.printf("상품 가격 %06d원\n", value);
		
		double pi = Math.PI;
		
		System.out.println(pi);
		System.out.printf("\n파이값:%010.2f\n",pi);
		
		String no = "김";
		String man = "승민";
		
		System.out.printf("Mr. 질문맨..%-10s | %10s", no, man);
		
	}


}
