package ex_exception;

public class Ex01_NullPointException {
	public static void main(String[] args) {
		String[] strArray = null;
		
		//생성되지 않은 배열을  출력하려고 할 때 예외 발생
		System.out.println(strArray[0]);
	}
}
