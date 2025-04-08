package ex03_FileInputStream;
import java.io.*;
public class Ex02_FileInputStream {
	public static void main(String[] args) {
		
		//경로를 저장
		String path = "D:\\full_stack_lsw\\3.JAVA\\test.txt";
		
		//File 객체에 경로 알려주기
		File f = new File(path);
		
		//length()를 통해 내용의 크기만큼 만든다
		byte[] b_read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				//파일에서 읽어온 내용을 바이트 배열에 담는다.
				//read() : 1바이트씩 읽어온다.
				//read(byte[] b) : 한번에 읽어와서 배열에 담는다.
				fis.read(b_read);
				
				String res = new String(b_read);
				
				System.out.println(res);
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
}
