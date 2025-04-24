package ex01;

import java.util.ArrayList;

public class Exam {

	// 4.
	public static ArrayList<Integer> removeDuplicates(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num != arr[i]) {
				num = arr[i];
				list.add(arr[i]);
			}
		}

		return list;

	}

	// 9.
	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		/*
		 * 4. 주어진 배열에서 중복된 값을 제거하는 메서드를 작성하세요.
		 * 
		 * int[] i_arr = {1,1,1,2,2,2,2,3,3,3,4,4,4,4,4,5,5,5,5,5}
		 * 
		 * - 메서드명 : removeDuplicates - 매개변수 : 정수형 배열 - 반환값 : 정수형 배열
		 */

		int[] i_arr = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5 };

		ArrayList<Integer> result = removeDuplicates(i_arr);
		System.out.println(result);

		// 5. 주어진 숫자 배열에서 가장 큰 값을 찾는 메서드를 작성하세요.

		int[] f_arr = { 3, 2, 5, 7, 9, 4, 2, 1, 6, 8 };
		int max = 0;

		for (int i = 0; i < f_arr.length; i++) {
			if (f_arr[i] > max) {
				max = f_arr[i];
			}
		}
		System.out.println(max);

		// 6. '학생' 클래스를 작성하고, '이름', '나이', '학번'을 인스턴스 변수로 가지며 이를 출력하는 메서드를 작성하세요.
		Student s1 = new Student("이상욱", 27, "18115068");
		s1.printInfo();

		// 9. int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 메서드 만들기

		// 만일 변수 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력하라.

		// - 메서드명 : sumOfDigits
		// - 매개변수 : 정수
		// - 반환값 : 정수

		int num = 12345;
		int result2 = sumOfDigits(num);
		System.out.printf("각 자리의 합 : %d", result2);

	}

}
