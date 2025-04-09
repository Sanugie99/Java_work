package ex03_FileReader;

import java.io.FileInputStream;
import java.io.FileReader;

public class Ex01_FileReader {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\full_stack_lsw\\3.JAVA\\test.txt");
			int code = 0; 
			while ((code = fr.read()) != -1) { 
                System.out.print((char) code);
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
