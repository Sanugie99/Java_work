package ex03_class;

public class Student {
	//정적 필드
	static String schoolName = "한국 고등학고";
	String studentName;//객체 멤버(필드).
	
	//정적 메서드
	static void goToSchool() {
		System.out.println("학교에 갑니다.");
	}
	
	//일반 메서드
	public void hello() {
		System.out.printf("안녕하세요 제 이름은 %s입니다.\n",studentName);
	}
}
