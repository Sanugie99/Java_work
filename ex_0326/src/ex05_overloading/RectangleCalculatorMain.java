package ex05_overloading;
import java.util.*;
public class RectangleCalculatorMain {

	public static void main(String[] args) {
		RectangleCalculator rc = new RectangleCalculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정사각형의 한 변의 길이를 입력하세요 : ");
		int r = sc.nextInt();
		rc.area(r);
		
		System.out.print("직사각형의 첫번째 변의 길이를 입력하세요 : ");
		int r1 = sc.nextInt();
		System.out.print("직사각형의 두번째 변의 길이를 입력하세요 : ");
		int r2 = sc.nextInt();
		rc.area(r1,r2);
		
		System.out.print("(실수형)직사각형의 첫번째 변의 길이를 입력하세요 : ");
		float d1 = sc.nextFloat();
		System.out.print("(실수형)직사각형의 두번째 변의 길이를 입력하세요 : ");
		float d2 = sc.nextFloat();
		rc.area(d1,d2);

	}

}
