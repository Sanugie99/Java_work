package ex01_if;
import java.util.*;
public class Exam1 {

	public static void main(String[] args) {
		//삼항연산자로 만들었던 x개의 농구공을 담기 위한 박스의 개수 구하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력해 주세요 : ");
		int ball = sc.nextInt();
		System.out.print("박스에 농구공이 몇개 들어가는지 입력해 주세요 : ");
		int inbox = sc.nextInt();
		
		int box = ball%inbox;
		int needBox = ball/inbox;
		if(box != 0) {
			needBox++;
			System.out.printf("필요한 박스의 개수는 %d입니다.",needBox);
		} else if(box == 0) {
			System.out.printf("필요한 박스의 개수는 %d입니다.",needBox);
		}
		
		

	}

}
