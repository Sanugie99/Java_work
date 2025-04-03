package ex06_operator;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		
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
		
		//-----------------------------------------------------
		//상자 1개에 농구공 5개
		//N개의 농구공을 담기 위한 박스의 개수를 구하세요
		//농구공의 개수는 키보드를 통해 입력 받는다
		
		System.out.println("농구공의 개수를 입력해 주세요 :");
		int ball = sc.nextInt();
		int box = ball % 5 == 0 ? ball / 5 : (ball / 5)+1;
		System.out.printf("상자의 개수는 %d개 필요합니다.\n",box);
		
		//-----------------------------------------------------
		//과수원이 있다
		//배, 사과, 오렌지를 키우고 있는데 하루에 생산된느 양은 각각 5, 7, 5개이다.
		//과수원에서 하루에 생산되는 총 개수를 출력하고,
		//시간당 전체 과일의 평균 생산 개수를 출력하시오
		//평균값을 담는 변수는 float으로 할것
		int pear = 5;
		int apple = 7;
		int orange = 5;
		int Sum = pear + apple + orange;
		int hour = 24;
		float avg = (float)Sum/hour;
		System.out.printf("하루에 생산되는 과일의 총 개수는 : %d개\n",Sum);
		System.out.printf("시간당 나오는 과일의 평균 개수는 %.2f개\n",avg);
	}
}
