package ex02_FileOutputStream;
import java.util.*;
import java.io.*;
//학생의 이름과 점수를 입력받아 scores.txt저장
//이어쓰기를 한다.
//마지막에는 파일 내용을 읽어 콘솔에 출력하는 기능 구현하기
//입력:
//이름: 홍길동
//점수: 90
//이름: 김영희
//점수: 85
//이름: exit
//
//출력:
//현재 저장된 점수 목록:
//홍길동 : 90
//김영희 : 85
public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		FileInputStream fis = null;
		System.out.println(" == 학생의 이름과 점수를 저장하는 프로그램 == ");
		try {
			fos = new FileOutputStream("D:\\full_stack_lsw\\3.JAVA\\Java_work\\ex0409\\src\\ex02_FileOutputStream\\scores2.txt",true);
			
			//파일 내용 작성하기
			while(true) {
				System.out.print("학생의 이름을 입력해 주세요 :");
				String name = sc.nextLine();
				//equalsIgnoreCase() 대소문자 무시하고 값을 검증
				if (name.equalsIgnoreCase("exit")) {
					break;
		        } else {
		    		System.out.printf("%s 학생의 점수를 입력해 주세요 :",name);
		    		String score = sc.nextLine();
		    		
		    		String student = (name + " : " + score + "\n");
	    			fos.write(student.getBytes());
	    			System.out.println("학생이름, 점수 등록완료");
		        }
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		//파일 내용 읽어오기
		try {
			File f = new File("D:\\full_stack_lsw\\3.JAVA\\Java_work\\ex0409\\src\\ex02_FileOutputStream\\scores2.txt");
			fis = new FileInputStream(f);
			byte[] buffer = new byte[(int)f.length()];
			fis.read(buffer);
			String content = new String(buffer, "UTF-8");
			System.out.println(content);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
