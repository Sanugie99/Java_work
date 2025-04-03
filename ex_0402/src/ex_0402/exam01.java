package ex_0402;
import java.util.*;
public class exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id : ");
		String id = sc.next();
		System.out.println("pw : ");
		int pw = sc.nextInt();
		
		if(!map.containsKey(id)) {
			System.out.println("아이디가 없습니다.");
		} else {
			if(map.get(id) != pw) {
				System.out.println("비밀번호 불일치");
			}else {
				System.out.println("로그인 성공");
			}
		}
		
		

	}

}
