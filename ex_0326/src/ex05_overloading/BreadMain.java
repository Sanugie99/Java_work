package ex05_overloading;
import java.util.*;
public class BreadMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bread b = new Bread();
		
		b.makeBread();
		
		System.out.println("먹고싶은 빵의 개수를 적으세요");
		int n = sc.nextInt(); 
		b.makeBread(n);
		
		System.out.println("먹고싶은 빵의 이름을 적으세요");
		String x = sc.next();
		System.out.println("먹고싶은 빵의 개수를 적으세요");
		n = sc.nextInt();
		b.makeBread(x, n);

	}

}
