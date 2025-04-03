package ex04_casting;

public class Ex01_casting {

	public static void main(String[] args) {
		//형 변환(casting)
		//데이터를 다른 자료형의 데이터로 변환하는 것을 의미한다.
		//모든 연산은 기본적으로 같은 자료형들끼리만 가능하다.
		//따라서 서로 다른 자료형의 연산을 수행하기 위해서는
		//같은 자료형으로 변환해야한다.
		
		int num = 11;
		double num2 = 3.14;
		double numChange = (double)11;
		
		System.out.println("num : " + num);
		System.out.println("num2 : " + num2);
		System.out.println("numChange : " + numChange);
		System.out.println((int)1.23);
		
		//형 변환 숫자를 담을 수 있는 기본 자료형간에만 가능
		//정수형, 실수형, 자료형 뿐만 아니라
		//문자 이면서 동시에 숫자기도한 문자형(char)도 가능하다.
		
		//자동형변환(Promotion)
		//서로 다른 자료형간의 대입이나 연산을 할 때 형 변환으로
		//자료형을 일치시켜야만 하지만 다음과 같은 경우 자바의
		//컴파일러가 자동으로 형 변환을 해주기 때문에 생략이 가능하다.
		
		//1. 작은 자료형에서 큰 자료형으로 변환할때
		//정수형
		//byte -> short -> int -> long
		//실수형
		//float -> double
		
		//2. 정수형이 실수형으로 바뀔때
		int i = 14;
		double d = 3.14;
		d = i;//자동형변환.
		
		char c = 'a';
		i = c;//char형에서 int형으로 자동형변환
		System.out.println("i : " + i);
		
		//강제형변환(Demotion)
		//(원하는 자료형)데이터 or 변수;
		
		//큰쪽에서 작은쪽으로 바꿀때 강제로 바꿔야한다.
		
		int x = 10; //4byte
		byte y = (byte)x; //1byte
		System.out.println("[int -> byte] x의 값 : " + x + " y의 값 : " + y);
		
		//int -> byte로 강제형변환(값이 큰경우)
		int j = 1000;
		byte k = (byte)j;
		System.out.println("[int -> byte] j의 값 : " + j + " k의 값 : " + k);
	}

}
