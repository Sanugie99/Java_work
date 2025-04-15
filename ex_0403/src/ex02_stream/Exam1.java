package ex02_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Exam1 {

	public static void main(String[] args) {
		//짝수만 출력하기
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		numbers.stream()
			.filter(i -> i%2 == 0 )
			.forEach(System.out::println);
		System.out.println("----------------------------------------");
		
		//문자열 대문자로 변환하여 리스트로 수집하기
		List<String> words = Arrays.asList("java", "stream", "lamda");
		words.stream()
			.map(w -> w.toUpperCase())
			.collect(Collectors.toList())
			.forEach(System.out::println);
		System.out.println("----------------------------------------");
		
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		hs.put("1", 1);
		hs.put("2", 2);
		hs.put("3", 3);
		hs.put("4", 4);
		hs.put("5", 5);
		
		List<Integer> list = new ArrayList<>(hs.values());
		

	}

}
