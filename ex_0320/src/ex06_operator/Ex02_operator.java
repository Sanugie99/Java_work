package ex06_operator;
import java.util.Scanner;
public class Ex02_operator {

	public static void main(String[] args) {
		//이항연산자
		//피연산자가 2개인 연산자
		
		//산술연산자
		int x = 100;
		int y = 200;
		
		System.out.println(x + y); //300
		System.out.println(x - y); //-100
		System.out.println(x * y); //20000
		System.out.println(x / y); //몫만 나옴
		System.out.println(x & y); //나머지만 나옴
		
		//오버플로우 발생
		int result = 1000000 * 1000000;
		System.out.println(result);
		
		//산술변환
		//기본적으로 이항 연산자의 연산은 두 피연산자의 타입이 일치해야 연산이 가능하다.
		
		//컴퓨터는 서로 다른 타입을 계산하지 못하므로 값의 손실이 적은 쪽으로 타입을 맞춰준다.
		//long + int -> long + long -> long
		//float + int -> float + float -> float
		//double + float -> double + double -> double
		
		//대입연산자
		//우변의 값을 좌변에 대입해주는 연산자
		
		//복합대입연산자
		//산술연산자와 대입연산자가 합쳐진 형태
		//a = a +,-,*,/,% b
		x = 10; 
		y = 1;
		
		y += x; // y = y + x;
		System.out.println(y);
		
		y *= x; // y = y * x;
		System.out.println(y);
		// ++x -> x+=1;
		
		//비교연산자
		//변수나 상수의 값을비교하여 참과 거짓을 판단하는 연산자
		//결과가 항상 true나 false로 나타난다
		int a = 10;
		int b = 20;
		
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a <= b);
		
		//논리연산자
		int myAge = 30;
		int limit = 35;
		//&&(and) : 앞 뒤 피연산자가 둘 다 참이여야 참을 반환한다
		boolean res = (limit-myAge) >= 5 && myAge > 30;
		System.out.println("&&연산결과 : " + res);
		//||(or) : 앞 뒤 피연산자 중 하나라도 참이면 참을 반환한다.
		res = (limit-myAge) >= 5 || myAge > 30;
		System.out.println("||연산결과 : " + res);
		
		
		//퀴즈
		x = 5;
		y = x++;//y = 5
		System.out.println("x의 값 : " + x);//x = 6
		System.out.println("y의 값 : " + y);//y = 5
		
		x = 10;
		y = 20;
		int z = (++x) + (y--); //x = 11, y = 20
		System.out.println("x의 값 : " + x);//x = 11
		System.out.println("y의 값 : " + y);//y = 19
		System.out.println("z의 값 : " + z);//z = 31
		
		a = 10;
		b = 12;
		System.out.println(++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (a % b) > 10);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해 주세요 : ");
		int k = sc.nextInt();
		System.out.print("영어 점수를 입력해 주세요 : ");
		int e = sc.nextInt();
		System.out.print("수학 점수를 입력해 주세요 : ");
		int m = sc.nextInt();
		int sum = k+e+m;
		String result2 = (k >= 40 && e >= 40 && m >= 40 && (sum/3) >= 60 ? "합격" : "불합격");
		System.out.printf("국, 영, 수 총 합은 : %d\n",(sum));
		System.out.printf("국영수 평균은 : %d\n",(sum)/3);
		System.out.println(result2);

	}

}
