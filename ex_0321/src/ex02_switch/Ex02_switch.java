package ex02_switch;

public class Ex02_switch {

	public static void main(String[] args) {
		//switch문에 break가 없는 경우
		int num = 1;
		switch(num) {
		case 1:
			System.out.println("num은 1입니다.");
		case 7:
			System.out.println("num은 7입니다.");
		default:
			System.out.println("num은 1도 7도 아닙니다.");
		}
		
		//int형 변수 x 가 10보다 크고 20보다 작을 때 true인 조건식
		int x = 0;
		if(x > 10 && x < 20) {
			System.out.printf("x는 %d입니다.\n",x);
		} else {
			System.out.println("x는 10보다 작거나 20보다 큽니다.");
		}
		
		//char형 변수 ch가 알파벳(대문자 또는 소문자)일때 true인 조건식
		char ch = 'o';
		if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
			System.out.printf("ch는 : %c입니다.\n",ch);
		} else {
			System.out.println("ch는 알파벳이 아닙니다.");
		}
	}

}
