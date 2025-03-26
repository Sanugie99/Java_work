package ex07_final;

public class Book {
	
	String title = "홍길동전";
	final int PRICE = 25000; //상수 : 다른 값을 대입할 수 없다.
	
	/*
	 * final메서드
	 * 자식클래스에서 오버라이드 할 수 없다.
	 */
	public final void info_title() {
		System.out.printf("책의 재목은 : %s 가격은 %d\n",title,PRICE);
	}
}
