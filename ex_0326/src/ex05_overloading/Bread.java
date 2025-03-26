package ex05_overloading;

public class Bread {
	/*
	 * 각기 다른 기능을 하는 makeBread()메서드를 세 개 만드는데,
	 * 메인클래스에서 각각의 메서드를 호출했을 때 결과를 보고 로직을 구현해 보자.
	 */
	
	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
		System.out.println("-------------");
	}
	
	public void makeBread(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n",n);
		System.out.println("-------------");
	}
	
	public void makeBread(String b, int n) {
		for(int i = 0; i < n; i++) {
			System.out.printf("%s을 만들었습니다.\n",b);
		}
		System.out.printf("요청하신 %d개의 %s을 만들었습니다\n",n,b);
		System.out.println("-------------");
	}
	
}
