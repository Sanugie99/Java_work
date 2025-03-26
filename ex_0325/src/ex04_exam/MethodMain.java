package ex04_exam;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1, 2, 3, 4, 5};
		mt.maxFinder(arr);
		
		
		mt.circleArea(3);
		System.out.println("원의 둘레 : "+mt.circleRound(4));
		
		mt.calculator(1,2,'+');
		
		
		while(true) {
			System.out.println("숫자를 입력해 주세요 : ");
			int answer = sc.nextInt();
			if(mt.check(answer) == 0) {
				System.out.println(mt.count + "회 만에 정답입니다.");
				break;
			} else if(mt.check(answer) == 1) {
				System.out.println("DOWN!!");
				mt.count++;
			}else {
				System.out.println("UP!!");
				mt.count++;
			}
		}
	}
	
}
