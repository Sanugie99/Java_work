package ex02_break;
import java.util.*;
public class Exam1 {

	public static void main(String[] args) {
		//1 ~ 50 사이의 난수를 생성하고
		//난수를 맞추는 프로그램 만들기
		//적은 값이 난수보다 작으면 "맞춰야할 숫자가 더 큽니다
		//적은 값이 난수보다 크면 " 맞춰야할 숫자가 더 작습니다.
		
		//경우의수
		//1. 난수를 맞추는 경우 if
		//2. 난수보다 큰경우 if
		//3. 난수보다 작은경우 if
		
		//반복횟수를 구하기 어려우니깐 while문 사용
		Scanner sc = new Scanner(System.in);
		Random x = new Random();
		int random = x.nextInt(50)+1;
		int i = 1;
		
		boolean ran = true;
		while(ran) {
			System.out.print("1 ~ 50 사이 숫자를 맞춰주세요! : ");
			int num = sc.nextInt();
			if(num == random) {
				System.out.printf("정답입니다! %d번째 맞추셨습니다.\n",i);
				ran = false;
			} else if(num > random) {
				System.out.println("맞춰야할 숫자가 더 작습니다.");
				i++;
			} else if(num < random) {
				System.out.println("맞춰야할 숫자가 더 큽니다.");
				i++;
			}
		}
		

	}

}
