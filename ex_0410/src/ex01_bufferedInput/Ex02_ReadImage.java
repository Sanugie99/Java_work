package ex01_bufferedInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex02_ReadImage {

	public static void main(String[] args) {
		//byte배열을 사용해서 이미지를 읽어왔을 때
		//속도가 굉장히 빠르다는 것을 알 수 있었다.
		
		FileInputStream readFile = null;
		BufferedInputStream bis = null;
		
		try {
			System.out.println("보조스트림으로 읽기");
			//기반스트림 먼저 생성
			readFile = new FileInputStream("D:\\full_stack_lsw\\3.JAVA\\wall.jpg");
			//그 후 보조스트림 생성
			bis = new BufferedInputStream(readFile);
			
			//시작시간 측정
			double start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			//이미지를 읽는 속도를 측정하려는 것이기 때문에
			//텍스트 처럼 변수에 넣어주는것이 아닌 그냥 읽기만 하는것.
			while(bis.read() != -1) {
				
			}
			double end = System.currentTimeMillis();
			
			double time = (end - start)/1000;
			System.out.println("소요시간 : " + time + "초");
			System.out.println("보조스트림으로 읽기 종료");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(bis != null) {
					bis.close();
				}
				if(readFile != null) {
					readFile.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
