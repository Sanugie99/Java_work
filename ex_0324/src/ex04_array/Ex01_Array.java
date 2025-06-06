package ex04_array;

public class Ex01_Array {

	public static void main(String[] args) {
		//배열 선언
		int[] arr = null;
		System.out.println(arr);
		
		//배열의 생성
		//크기가 4인 정수형 배열의 생성
		int[] iArr = new int[4]; //데이터가 안들어가 있음
		
		String s = "홍길동";
		
		System.out.println(System.identityHashCode(iArr));
		System.out.println(System.identityHashCode(iArr[0]));
		//값을 직접 변수에 저장하는것이 아니라 주소값이 저장되어
		//해당 주소를 통해 실제 주소에 접근하는 것을 참조 변수 라고 한다.
		
		//배열의 특징
		//1. 배열 선언 시 크기를 지정한다.
		//2. 배열 선언 후 공간의 크기를 늘리거나 줄일 수 없다
		//3. 지정된 자료형의 값만 저장할 수 있다.
		
		//배열에 각 방에 들어있는 데이터를 사용하는 방법
		//배열명[index] -> 변수처럼 사용하면 된다.
		//변수처럼 사용하면 된다 = 대입이 가능하다.
		
		iArr[0] = 100;
		iArr[1] = 200;
		iArr[2] = 300;
		iArr[3] = 400;
		
		//배열의 출력
		System.out.println(iArr[0]);
		System.out.println(iArr[1]);
		System.out.println(iArr[2]);
		System.out.println(iArr[3]);
		
		//배열의 길이
		//배열은 내부적으로 length라는 변수를 지니는데
		//해당 변수는 배열의 길이 값을 가지고 있다.
		//배열의 길이를 알고싶을 때는 배열명.length를 하면된다
		//이 변수의 값은 배열이 생성될 때 지정되며 변경할 수 없다. 
		System.out.println("---------------------");
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		//배열의 초기값
		//배열은 생성과 동시에 데이터 자료형 별로 기본값이 주어진다.
		//정수는 -> 0, 실수 -> 0.0, 문자형 -> '', 객체형 -> null
		
		int[] intArray = new int[5];
		String[] strArray = new String[5];
		
		int[] varArray = {1, 2, 3, 4, 5};
		
		//intArray의 첫번째 값 출력
		System.out.println("intArray[0] : " + intArray[0]);
		//intArray의 두번째 값 출력
		System.out.println("intArray[1] : " + intArray[1]);
		
		//strArray의 첫번째 값 출력
		System.out.println("strArray[0] : " + strArray[0]);
		//strArray의 두번째 값 출력
		System.out.println("strArray[1] : " + strArray[1]);
		
		//varArray의 첫번째 값 출력
		System.out.println("varArray[0] : " + varArray[0]);
		//varArray의 두번째 값 출력
		System.out.println("varArray[1] : " + varArray[1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
