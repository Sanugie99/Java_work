package ex01_Thread;
import java.util.*;
//스케너를 이용하여 키보드에서 숫자를 입력받고
//스레드에서 입력받은 숫자부터 1씩 감소하다가 0이 되었을때
//"종료" 메시지와 함께 프로그램이 종료되도록 만들어 보자.ThreadCount에다 작성하기
class ThreadCount extends Thread{
		
		private int count;
		
		//private에서 값을 전달 받을수 있는 방법
		//1. 생성자를 통해서 전달
		public ThreadCount(int count) {
			this.count = count;
		}
		
		//2. setter를 통해 받는다
		public void setCount(int count) {
			this.count = count;
		}
		
		//값을 반환 받고 싶으면 getter를 만든다
		
		public int getCount() {
			return count;
		}
		
		@Override
		public void run() {
				try {
					for(int i = count; i >= 0; i--) {
						System.out.println(i);
						Thread.sleep(1000);
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println("종료");
			}
		}

public class Exam1{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해 주세요");
		int count = sc.nextInt();
		
		ThreadCount tc = new ThreadCount(count);
		tc.start();
	}
}
