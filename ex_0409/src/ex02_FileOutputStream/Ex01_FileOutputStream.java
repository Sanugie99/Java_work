package ex02_FileOutputStream;
import java.io.FileOutputStream;

public class Ex01_FileOutputStream {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			//경로에 파일이 없으면 파일을 만들어 준다.
			//write를 한 내용까지 작성을 해준다.
			fos = new FileOutputStream("D:\\full_stack_lsw\\3.JAVA\\fileout.txt",true);
			
//			fos.write('f');
//			fos.write('i');
//			fos.write('l');
//			fos.write('e');
			
			//바이트배열 -> 문자열 new String(byte[] b);
			//문자열 -> 바이트배열
			
			String msg = "fileOutput 에제입니다. \n";
			String msg2 = "여러줄도 가능";
			
			//잠중따옴표문법은 JAVA 15부터 사용할 수 있다
			//텍스트 블록이라고 부르며 여러 줄에 걸친 문자열을 작성할 때 사용된다
			//줄 끝에 \를 붙이면 줄바꿈 없이 이어서 쓸 수 있다.
			//html, JSON등을 쓸 때 유용하다.
			String msg3 = """
							여러줄
							문자열
							리터럴
						  """;
			
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			fos.write(msg3.getBytes());
			System.out.println("파일 생성 완료");
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
	}

}
