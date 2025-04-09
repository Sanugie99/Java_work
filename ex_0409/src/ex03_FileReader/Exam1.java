package ex03_FileReader;

import java.io.FileInputStream;
import java.io.FileReader;

//text.txt 파일을 만들고 한글, 영어(대문자/소문자)섞어서 작성
//text.txt 파일의 내용을 읽어와서
//영어 대문자의 개수, 소문자의 개수를 판별하여 출력하세요
//대문자 : x개
//소문자 : x개
public class Exam1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileReader fr = null;
		int upper = 0;
		int lower = 0;
		try {
			fr = new FileReader("D:\\full_stack_lsw\\3.JAVA\\test.txt");
			int code = 0;
			while ((code = fr.read()) != -1) {
				System.out.print((char) code);
                if(code >= 'A' && code <= 'Z') {
                	upper++;
                } else if(code >= 'a' && code <= 'z') {
                	lower++;
                }
            }
			System.out.println();
			System.out.println("test.txt 안에 영어 대문자 : " + upper);
			System.out.println("test.txt 안에 영어 소문자 : " + lower);
			
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
