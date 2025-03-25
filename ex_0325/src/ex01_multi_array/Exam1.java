package ex01_multi_array;
import java.util.*;
public class Exam1 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,5}, {6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		//배열 arr의 총 합과 평균을 구하시오
		
		int sum = 0;
		int avg = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				avg = sum/4;
			}
		}
		System.out.printf("배열의 총 합 : %d\n",sum);
		System.out.printf("배열의 평균 : %d\n",avg);
		
		System.out.println("------------------------");
		/*
		 * 학생들의 정보를 입력하고, 출력하는 프로그램 작성하기
		 * 학생들의 수학과 영어 성적을 등록하는 프로그램입니다
		 * 1.프로그램을 실햏ㅇ하면 몇명의 정보를 저장할 것인지 입력받는다
		 * 2.입력받은 수 만큼 학생들의 이름 수학 영어 성적을 입력받는 프로그램 작성하기. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록할 인원 수 : ");
		int num = sc.nextInt();
		String[][] student = new String[num][3];
		for(int i = 0; i < student.length; i++) {
			if(num > 0) {
				System.out.printf("%d번째 학생 등록\n",i+1);
				System.out.print("이름 : ");
				String name = sc.next();
				student[i][0] = name;
				System.out.print("수학 : ");
				String m = sc.next();
				student[i][1] = m;
				System.out.print("영어 : ");
				String e = sc.next();
				student[i][2] = e;
				System.out.println("------------------------");
			}
		}
		System.out.println("등록이 완료되었습니다.");
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(student[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
