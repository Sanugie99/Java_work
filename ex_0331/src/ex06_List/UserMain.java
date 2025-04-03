package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		ArrayList<UserInfo> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		again:while(true) {
			System.out.print("아이디 생성");
			UserInfo ui = new UserInfo();
			ui.setId(sc.next());
			
			//중복체크하기(숙제)
			for(UserInfo user : arr) {
				if(user.getId().equals(ui.getId())) {
					System.out.println("아이디가 중복됩니다. 다른 아이디를 사용하세요");
					continue again;
				}
			}
			
			
			System.out.print("패스워드 입력 : ");
			ui.setPwd(sc.nextInt());
			arr.add(ui);
			
			for(UserInfo u : arr) {
				System.out.println(u.getId());
				System.out.println(u.getPwd());
				System.out.println("--------------");
			}
			
		}
	}
}






