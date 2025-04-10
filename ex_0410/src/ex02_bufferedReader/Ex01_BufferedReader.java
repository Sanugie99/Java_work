package ex02_bufferedReader;
import java.io.*;
public class Ex01_BufferedReader {
	public static void main(String[] args) {
		
		FileReader reader = null;
		BufferedReader br = null;
		
		try {
			reader = new FileReader("D:\\full_stack_lsw\\3.JAVA\\book.txt");
			br = new BufferedReader(reader);
			
			String str = "";
			//버퍼에 문자를 저장하기 때문에 한번에 불러오는게 가능하다.
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				if(reader != null) {
					reader.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
