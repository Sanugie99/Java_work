package ex04_exam;
import java.util.*;
public class MethodTest {

	
	/*
	 * 배열의 최대값을 찾는 maxFinder메서드
	 * 임의의 배열은 매개변수로 받자
	 */
	public void maxFinder(int[] arr) {
		int max = arr[0];
		for(int x : arr) {
			if(x > max) max = x;
		}
		System.out.println("최대값 : " + max);
	}
	
	//원의 넓이와 둘레 구하기
	//함수를 호출하면서 반지름을 받는다.
	//원의 넓이를 구하는 circleArea
	//원의 둘레를 구하는 circleRound
	//circleArea 는 결과 출력하기
	//circleRound는 결과 반환하기.
	//원의 넓이 : 3.14*r*r
	//원의 둘레 : 2*3.14*r
	
	public void circleArea(int r) {
		if(r > 0) {
			System.out.println("원의 넓이 : " + r*r*3.14);
		}
	}
	
	public double circleRound(int r) {
		return 2*3.14*r;
	}
	
	
	//계산기 만들기
	//사칙연산을 할 수 있는 calculator메서드 만들기
	//두 수와 연산자를 매개변수로 받는다
	public void calculator(int num1,int num2,char x) {
		switch(x) {
		case('+'):
			System.out.printf("%d + %d = %d\n",num1,num2,(num1+num2));
		break;
		case('-'):
			System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));
		break;
		case('*'):
			System.out.printf("%d * %d = %d\n",num1,num2,(num1*num2));
		break;
		case('/'):
			System.out.printf("%d / %d = %d\n",num1,num2,(num1/num2));
		break;
		case('%'):
			System.out.printf("%d % %d = %d\n",num1,num2,(num1%num2));
		break;
		}
	}
	
	/*
	 * 1 ~ 50 사이의 난수를 생성
	 * main쪽에서 키보드를 통해 정수를 입력받는다
	 * check()메서드를 만들어서 사용자가 입력한 숫자를 판단
	 * 발생한 난수보다 크다면 DOWN!! 작다면 UP!!을 출력
	 * 사용자가 입력한 숫자와 발생한 난수가 같을경우에
	 * 프로그램을 종료
	 */
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	
	int ran = r.nextInt(50)+1;
	int count = 1;
	//사용자가 입력한 숫자와 난수를 체크하는 기능
	public string check(int number) {
		if(number == ran) {
			return "정답!";
		}else if(number > ran) {
			return "DOWN!!";
		}else if(number < ran) {
			return "UP!!";
		}
	}
	
	//  Graph라는 이름의 메인 클래스를 만들어 
	//0 ~ 9사이의 난수를 100개 저장하는 배열을 만들고, 
	//해당 배열이 가지고 있는 각 방의 난수를 판별하여 그래프화 해 보자.
	//
	//  단, 발생한 난수의 그래프화 작업은 PrintGraph클래스가 하도록 한다.
	//
	//  결과:
	//  0507...... //난수 100개
	//  0의 갯수 : ############ 12
	//  1의 갯수 : ######### 9
	//  2의 갯수 : ########### 11
	//  3의 갯수 : ######## 8
	//  4의 갯수 : ############## 14
	//  5의 갯수 : ####### 7
	//  6의 갯수 : ######### 9
	//  7의 갯수 : ############# 13
	//  8의 갯수 : ####### 7
	//  9의 갯수 : ########## 10
	

}
