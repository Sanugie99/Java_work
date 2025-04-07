package ex01_ThreadMethod;

public class SleepThread extends Thread{
	@Override
	public void run() {
		System.out.println("카운트다운 5초");
		for(int i = 5; i >= 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
				//InterruptedException
				//스레드가 해야할 일을 처리하지 못할 때 발생하는 이벤트
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("이벤트 종료");
	}
}
