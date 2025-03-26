package ex01_exam;
import java.util.*;
import java.util.Scanner;

public class Bank {
	int money;
	public void bank() {
		
		Scanner sc = new Scanner(System.in);
		UserInfo ui = new UserInfo();
		boolean x = true;
		while(x) {
			System.out.println("메뉴를 선택해 주세요");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액확인");
			System.out.println("4. 종료");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case(1):
				System.out.println("입금할 금액을 입력해 주세요");
				money = sc.nextInt();
				ui.deposit(money);
				System.out.println("-------------------");
				break;
			case(2):
				System.out.println("출금할 금액을 입력해 주세요");
				money = sc.nextInt();
				ui.withdraw(money);
				System.out.println("-------------------");
				break;
			case(3):
				System.out.println(ui.showMoney()+"원");
				System.out.println("-------------------");
				break;
			case(4):
				System.out.println("프로그램을 종료합니다.");
				x = false;
			}
		}
	}
}
