package ex01_Thread;
import java.util.*;
public class QuizThread extends Thread{
	
	private int seconds = 0;
	private boolean running = true;
	
	@Override
	public void run() {
		while(running) {
			try {
				Thread.sleep(1000);
				seconds++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void startGame() {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(running) {
			int r1 = r.nextInt(101);
			int r2 = r.nextInt(101);
			if(count < 5) {
				System.out.printf("문제. %d + %d = ",r1,r2);
				int num = sc.nextInt();
				if(num == r1+r2) {
					count++;
					System.out.printf("%d개 정답입니다.\n",count);
				} else {
					System.out.println("오답입니다.");
				}
			} else {
				running = false;
				System.out.println("5개 모두 맞췄습니다. 총" + seconds + "초 걸렸습니다.");
			}
		}
	}
}
