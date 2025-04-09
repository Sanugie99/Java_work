package ex02_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//학생의 이름과 점수를 저장하는 프로그램
//이름과 점수를 FileOutputStream을 이용하여 scores.txt파일에 저장하세요

//요구사항
//1. 사용자로부터 이름과 점수를 입력받는다. (Scanner)
//2. 입력받은 데이터를 "이름 : 점수 \n" 형식으로 문자열로 만들어 파일에 쓴다 ex) "김철수 : 84"
//3. 이름에 exit를 입력하면 프로그램 종료
//4. 파일은 scores.txt 파일로 저장되며, 기존 내용은 덮어 씁니다
//5. "이름 : 점수" 형식의 문자열의 각 문자의 char값을 +3을 해 암호화 한다
// John : 80 => Mrkq#5;#B8
public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		FileInputStream fis = null;
		String name = "";
		System.out.println(" == 학생의 이름과 점수를 저장하는 프로그램 == ");
		
		try {
			fos = new FileOutputStream("D:\\full_stack_lsw\\3.JAVA\\Java_work\\ex0409\\src\\ex02_FileOutputStream\\scores.txt",false);
			
			while(true) {
				System.out.print("학생의 이름을 입력해 주세요 :");
				name = sc.nextLine();
				//equalsIgnoreCase() 대소문자 무시하고 값을 검증
				if (name.equalsIgnoreCase("exit")) {
					break;
		        } else {
		    		System.out.printf("%s 학생의 점수를 입력해 주세요 :",name);
		    		String score = sc.nextLine();
		    		
		    		String student = (name + " : " + score + "\n");
	    			//fos.write(student.getBytes());
	    			//System.out.println("학생이름, 점수 등록완료");
	    			
	    			String result = "";
	    			for(int i = 0; i < student.length(); i++) {
	    				char ch = student.charAt(i);
	    				ch += 3;
	    				result += ch;
	    			}
	    			fos.write(result.getBytes());
	    			System.out.println("학생이름, 점수 암호화 후 등록완료");
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
//		System.out.println("프로그램을 종료합니다.");
//		System.exit(0);
		
		//복호화를 해서 콘솔에 출력하기
		//scores.txt 내용을 content로 불러오기
		try {
			File f = new File("D:\\full_stack_lsw\\3.JAVA\\Java_work\\ex0409\\src\\ex02_FileOutputStream\\scores.txt");
			fis = new FileInputStream(f);
			byte[] buffer = new byte[(int)f.length()];
			fis.read(buffer);
			String content = new String(buffer, "UTF-8");
			
			//복호화
			String result = "";
			for(int i = 0; i < content.length(); i++) {
				char ch = content.charAt(i);
				ch -= 3;
				result += ch;
			}
			System.out.println("학생이름, 점수 복호화 " + result);
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
