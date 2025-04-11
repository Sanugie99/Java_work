package ex06_annotaion;

import java.lang.annotation.Annotation;

@TestInfo(name = "홍길동", skills = {"Java", "Spring"})
public class Ex02_Annotation {
	public static void main(String[] args) {
		Annotation[] annotations = Ex02_Annotation.class.getAnnotations();
		for(Annotation annotation : annotations) {
			System.out.println(annotation);
		}
		
		TestInfo testInfo = Ex02_Annotation.class.getAnnotation(TestInfo.class);
		System.out.println(testInfo.name());
		

	}

}
