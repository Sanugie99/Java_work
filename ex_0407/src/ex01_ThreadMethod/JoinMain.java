package ex01_ThreadMethod;

public class JoinMain {
	public static void main(String[] args) {
		JoinExample je = new JoinExample();
		je.start();
		
		try {
			je.join();//main스레드는 je스레드가 끝날때 까지 기다린다.
		} catch (Exception e) {
			
		}
		System.out.println("main스레드 종료");
	}
}
