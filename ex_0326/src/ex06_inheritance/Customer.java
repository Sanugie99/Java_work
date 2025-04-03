package ex06_inheritance;

//자식 클래스
public class Customer extends Person{
	int memberId;
	
	public Customer(String name, int age, int memberId) {
		super(name, age);//부모의 생성자 호출
		this.memberId = memberId;
	}
	
	void enter() {
		System.out.printf("회원번호 : %d (%s, %d세)님 입장하셨습니다.\n",memberId,name,age);
	}
}
