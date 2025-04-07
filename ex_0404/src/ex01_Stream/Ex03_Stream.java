package ex01_Stream;
import java.util.*;
import java.util.stream.IntStream;
public class Ex03_Stream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int sum = list.stream().reduce(0, (a,b) -> a+b);
		System.out.println("list 모든 요소의 총 합 : " + sum);
		
		//IntStream과 같은 기본형 스트림에는 스트림의 요소들에 대한 통계 정보를 얻을수 있는 메서드들이 있다
		
		//sum()
		int sum2 = IntStream.of(1,2,3,4,5).sum();
		OptionalDouble res = IntStream.of(1,2,3,4,5).average();
		System.out.println();
	}
}
