package ex01_Collections;
import java.util.*;
public class Ex01_Collections {
	/*
	 * Collections
	 * Java에서 컬렉션을 다룰 때 유용한 기능들을 제공하는 클래스
	 * java.util.Collections패키지에 포함되어 있으며
	 * 모든 메서드는 정적메서드이다.
	 */
	
	//sort()
	//리스트의 요소를 오름차순으로 정렬
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4, 0, 9, 3, 6, 7, 1, 8);
		Collections.sort(numbers);
		System.out.println(numbers);
	}
	
}
