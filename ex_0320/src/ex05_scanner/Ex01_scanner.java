package ex05_scanner;
import java.util.Scanner;
public class Ex01_scanner {
	public static void main(String[] args) {
		//데이터의 입력
		//프로그램을 실행할 때 키보드를 통해 입력한 데이터를 변수에 대입하곘다.
		
		//java.util패키지에 있는 Scanner클래스를 이용해야한다.
		//다른 패키지에 있는 기능을 사용하기 위해서는 import를 해야한다.
		//import 경로.
		//let obj = new Object();
		//obj.key = value; //프로퍼티가 없으면 추가
		Scanner sc = new Scanner(System.in); //Scanner 객체 선언
		
//		System.out.print("정수 입력 : ");
//		int n = sc.nextInt();
//		System.out.println(n);
		
		//나이 입력받기
		//제 나이는 x세 입니다.
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		System.out.print("이름을 입력해 주세요 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("주소를 입력해 주세요 : ");
		String address = sc.nextLine();
		System.out.printf("제 나이는 %d세 입니다\n",age);
		System.out.printf("제 이름는 %s 입니다\n",name);
		System.out.printf("제 주소는 %s 입니다\n",address);
		
	}
}
