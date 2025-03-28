package ex03_for;
import java.util.*;
public class Ex01_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 반복문
		 * 특정 명령을 원하는 만큼 반복하여 실행하는 제어문
		 * for, while
		 * 
		 * for
		 * 주로 반복 횟수가 정해져있을 때 사용하는 문법
		 * 
		 * for(초기식; 조건식; 증감식){
		 * 	반복하고자 하는 명령
		 * }
		 * 
		 * 초기식 : 반복을 하기 위한 시작값으로 변수를 하나 초기화 한다.
		 * 조건식 : 반복을 위한 종료값으로 비교연산자를 많이 사용한다
		 * 증감식 : 초기식에 있는 변수의 값을 증감시켜주는 역할을 한다
		 */
		
//		for(int i = 0; i <= 3; i++) {
//			System.out.println(i);
//		}
//		
//		int i = 0;//초기 값을 밖에다가 쓸 수는 있음.
//		for(; i <= 3;) {
//			System.out.println(i);
//			i++;//증감값도 밖에다가 쓸 수 있음.
//		}
//		//초기식에 들어가는 변수 i를 무조건 사용할 필요는 없다.
//		//사용한느게 좋을 거 같을 때 쓰면 된다.
//		
//		
//		
//		//1부터 10까지 출력하는 for문 작성하기
//		//1 2 3 4 5 6 7 8 9 10 <- 이렇게 가로로
//		for(int j = 1; j <= 10; j++) {
//			System.out.printf("%d ",j);
//		}
//		System.out.println();
//		
//		//10부터 1까지 출력하는 for문 작성하기
//		for(int j = 10; j >= 1; j--) {
//			System.out.printf("%d ",j);
//		}
//		System.out.println();
//		
//		//1부터 10까지 3의 배수만 출력하는 for문 작성하기
//		for(int j = 1; j <= 10; j++) {
//			if(j%3 == 0) {
//				System.out.printf("%d ",j);
//			}
//		}
//		System.out.println();
//		
//		//1부터 10까지 총 합 구하기
//		int sum = 0;
//		for(int j = 1; j <= 10; j++) {
//			sum += j;
//		}
//		System.out.printf("1부터 10까지 총 합은 %d 입니다.",sum);
//		System.out.println();
//		
//		//키보드에서 정수를 하나 입력 받아 해당 단의 구구단 출력하기
//		System.out.print("출력할 구구단의 단 수를 입력해주세요 : ");
//		int gugudan = sc.nextInt();
//		for(int j = 1; j < 10; j++) {
//			System.out.printf("%d x %d = %d\n",gugudan,j,(gugudan*j));
//		}
//		
//		//키보드에서 정수 n을 입력받고
//		//1부터 정수 n까지의 총 합을 계산하여 결과 출력하기
//		System.out.print("n을 입력해주세요 : ");
//		int n = sc.nextInt();
//		int Sum = 0;
//		for(int j = 1; j <= n; j++) {
//			Sum += j;
//		}
//		System.out.printf("1 ~ %d까지의 총 합은 : %d 입니다.\n",n,Sum);
		
		//10개의 정수를 입력받아 그 중 짝수의 개수가 몇개인지 구하세요.
//		int count = 0;
//		for(int i = 1; i <= 10; i++) {
//			System.out.printf("%d번째 정수를 입력해주세요 : \n",i);
//			int a = sc.nextInt();
//			if(a%2 == 0) {
//				++count;
//			}
//		}
//		System.out.printf("입력한 10개의 정수에서 짝수는 %d개 입니다.\n",count);
		
		//1 + (1+2) + (1+2+3)... +(1+2+3+4+5+6+7+8+9+10)의 결과를 계산하시오
//		int sum = 0;
//		int totalSum = 0;
//		for(int i = 1; i <= 10; i++) {
//			sum += i;
//			totalSum += sum;
//		}
//		System.out.println(totalSum);
		
		//양의 정수 x를 키보드에서 입력받아
		//x가 홀수면 x 이하의 홀수인 정수의 합을 구하고
		//x가 짝수면 x 이하의 짝수인 정수의 제곱의 합을 구하세요
		System.out.print("정수 x을 입력해주세요 : ");
		int x = sc.nextInt();
		int X = x%2;
		int sum = 0;
		int Sum = 0;
		if(X != 0) {
			for(int i = 0; i <= x; i++) {
				if(i%2 != 0) {
					sum += i;
				}
			}
			System.out.printf("x가 홀수 임으로 1 ~ x 까지의 홀수인 정수의 합은 %d 입니다!\n",sum);
		} else if(X == 0){
			for(int i = 0; i <= x; i++) {
				if(i%2 == 0) {
					sum = i*i;
					Sum += sum;
					sum = 0;
				}
			}
			System.out.printf("x가 짝수 임으로 1 ~ x 까지의 짝수인 정수의 제곱의 합은 %d 입니다!\n",Sum);
		}
		
	}

}
