package ex05_overloading;

public class Overload {
	public void result() {
		System.out.println("인자가 없는 메서드");
	}
	
	public void result(int n) {
		System.out.println("정수를 인자로 받는 메서드");
	}
	
	public void result(char n) {
		System.out.println("문자를 인자로 받는 메서드");
	}
	public void result(String s, int n) {
		System.out.println("문자열과 정수를 인자로 받는 메서드");
	}
	public void result(int n, String s) {
		System.out.println("정수와 문자열을 인자로 받는 메서드");
	}
}
