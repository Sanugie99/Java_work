package ex04_FileWriter;

import java.io.FileReader;
import java.io.FileWriter;

public class Ex01_FileWriter {

	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			//파일을 정해주고 파일이 없으면 생성도 해준다.
			fw = new FileWriter("D:\\full_stack_lsw\\3.JAVA\\fileWriter예제.txt");
			
			String str = "hi";
			
			//파일에 들어갈 내용 작성
			fw.write("첫번째 줄 작성합니다. \n");
			fw.write("두번째 줄 작성합니다. \n");
			fw.write("세번째 줄 작성합니다. \n");
			
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
