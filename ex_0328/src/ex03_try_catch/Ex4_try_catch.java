package ex03_try_catch;

import java.util.Scanner;

public class Ex4_try_catch {

	public static void main(String[] args) {
		/*
		 * finally
		 * 예외 발생 유무와 상관없이 실행되는 구문이며 생략할 수 있다.
		 * 에외를
		 */
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("숫자 입력");
			int number = sc.nextInt();
			System.out.println("입력한 숫자 : " + number);
		} catch (Exception e) {
			System.out.println("숫자만 입력해야 한다");
		} finally {
			//연결을 종료하는 코드들
			//스캐너 연결종료
			//DB와 연결종료
			sc.close();
		}

	}

}
