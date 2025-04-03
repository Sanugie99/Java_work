package ex05_overloading;

public class RectangleCalculator {
	/*
	 * 다양한 방식으로 사각형의 넓이 구하기
	 * 메서드 명 : area
	 * 
	 * 1. 정사각형의 한 변의 길이를 받아 넓이 반환하기
	 * 2. 가로 세로 길이를 받아 직사각형의 넓이 반환하기
	 * 3. 실수형 가로, 세로를 받아 실수 결과 계산하기
	 */
	
	public void area(int r) {
		System.out.printf("정사각형의 넓이는 : %d 입니다\n",(r*r));
		System.out.println("-----------------------------");
	}
	
	public void area(int r1, int r2) {
		System.out.printf("직사각형의 넓이는 : %d 입니다\n",(r1*r2));
		System.out.println("-----------------------------");
	}
	
	public void area(float d1, float d2) {
		System.out.printf("(실수형)직사각형의 넓이는 : %.3f 입니다\n",(d1*d2));
		System.out.println("-----------------------------");
	}
}
