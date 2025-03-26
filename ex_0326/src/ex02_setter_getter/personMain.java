package ex02_setter_getter;

public class personMain {

	public static void main(String[] args) {
		Person p = new Person();
		/*
		 * 필드를 private으로 선언하면 외부에서 직접 사용할 수 없다.
		 * p.age = -30;//코드상 문제는 없음
		 * 
		 * setter메서드를 통애서 필드에 값을 세팅
		 */
		p.setAge(30);

	}

}
