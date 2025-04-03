package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonFunction {

	public void personFunc() {
		ArrayList<Person> personArr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		int select;
		Person p;
		
		while(true) {
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 전체정보");
			System.out.println("4. 종료");
			System.out.print("항목 선택 : ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				//정보 추가
				p = new Person();
				System.out.println("--- 정보추가 ---");
				System.out.print("이름 : ");
				p.setName(sc.next());
				System.out.print("나이 : ");
				p.setAge(sc.nextInt());
				System.out.print("전화 : ");
				p.setTel(sc.next());
				
				personArr.add(p);
				System.out.println("정보가 저장되었습니다.");
				System.out.println("---------------------");
				break;
			case 2:
				//정보삭제
				System.out.println("--- 정보 삭제---");
				System.out.print("삭제할 이름 : ");
				String name = sc.next();
				for(int i = 0; i < personArr.size(); i++) {
					if((personArr.get(i).getName()).equals(name)) {
						personArr.remove(i);
						System.out.println(name+"의 정보를 삭제했습니다.");
						break;
					} else {
						//for문을 돌다가 마지막에 들어올 수 있게 하는 조건
						if(i + 1 == personArr.size()) {
							System.out.println(name+"이 존재하지 않습니다.");
						}
					}
				}
				break;
			case 3:
				//전체정보
				System.out.println("--- 전체정보 ---");
				System.out.println("등록인원 " + personArr.size()+"명");
				for(Person x : personArr) {
					System.out.println("이름 : " + x.getName());
					System.out.println("나이 : " + x.getAge());
					System.out.println("번호 : " + x.getTel());
					System.out.println("--------------------");
				}
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}
