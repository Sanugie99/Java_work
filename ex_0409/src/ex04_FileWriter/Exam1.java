package ex04_FileWriter;
//메모장 프로그램 만들기
//사용자가 키보드로 입력한 내용을 "memo.txt"에 저장하고
//입력이 종료되면 해당 파일의 내용을 다시 읽어서 화면에 출력하기
//사용자로부터 여러 줄의 텍스트를 입력받는다.
//사용자가 exit 입력하면 종료합니다.

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//메모 입력 (exit 입력 시 종료):
//   > 오늘 날씨가 좋다.
//   > 내일은 시험이다.
//   > exit
//
//   저장 완료. 저장된 메모 내용:
//   오늘 날씨가 좋다.
//   내일은 시험이다.
public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		FileReader fr = null;
		
		try {
			fw = new FileWriter("D:\\full_stack_lsw\\3.JAVA\\memo.txt");
			System.out.println("메모 입력 (exit 입력 시 종료)");
			while(true) {
				System.out.print(">>");
				String memo = sc.nextLine();
				if(memo.equalsIgnoreCase("exit")) {
					System.out.println("메모장을 종료합니다");
					break;
				} else {
					fw.write(memo);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
            try {
                if (fw != null) {
                	fw.close();
                }
            } catch (Exception e) {
            	
            }   
		}
		
		try {
			fr = new FileReader("D:\\full_stack_lsw\\3.JAVA\\memo.txt");
			int code = 0; 
			while ((code = fr.read()) != -1) { 
                System.out.println((char)code);
            }
		} catch (Exception e) {
			
		} finally {
            try {
                if (fr != null) {
                	fr.close();
                }
            } catch (Exception e) {
            	
            }   
		}

	}

}
