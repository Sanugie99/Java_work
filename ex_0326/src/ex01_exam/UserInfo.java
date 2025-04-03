package ex01_exam;

public class UserInfo {
	
	
	int bank;
	//입금
	public void deposit(int money) {
		if(money <= 0) {
			System.out.println("0원 이하로는 입금이 불가능 합니다.");
		}
		System.out.printf("%d원 입금완료\n",money);
		bank += money; 
	}
	
	//출금
	public void withdraw(int money) {
		outer:if(money > bank) {
			System.out.println("계좌 잔액보다 많은 돈은 출금이 불가능합니다.");
			break outer;
		} else {
			System.out.printf("%d원이 출금되었습니다.\n",money);
			bank -= money;
		}
	}
	
	//잔액 확인
	public int showMoney() {
		return bank;
	}
	
}
