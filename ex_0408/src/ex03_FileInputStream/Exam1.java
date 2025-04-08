package ex03_FileInputStream;
import java.io.*;
import java.util.Arrays;
public class Exam1 {
	public static void main(String[] args) {
		//file.txt를 만들고
		//문장을 입력하고 저장을 한다.
		//FileInputStream으로 읽어온 뒤, 회문인지 아닌지 검증하세요
		String path = "D:\\full_stack_lsw\\3.JAVA\\file.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];
		FileInputStream fis = null;
		byte[] revb_read = new byte[b_read.length];
		int x = 0;
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				fis.read(b_read);
				String res = new String(b_read);
		        for (int i = 0; i < b_read.length; i++) {
		        	revb_read[i] = b_read[b_read.length - 1 - i];
		        }
				if(b_read[0] == revb_read[0]) {
					System.out.println("file에 들어있는 문장 "+ res +"은 회문입니다.");
				} else {
					System.out.println("file에 들어있는 문장은 회문이 아닙니다.");
				}
			} catch (Exception e) {
			}
		}
	}
}
