package ex01_Stream;
import java.util.*;
import java.util.Optional;

public class Ex02_Optional {

	public static void main(String[] args) {
		//스트림의 최종결과를 Optional로 반환하는 것들이 있었다.
		//제네릭 클래스로 T 타입의 객체를 감싸는 Wrapper클래스이다.
		
		Optional<String> optStr = Optional.of("abcd");
		//opStr에 들어있는 글자의 수를 반환하기
		Optional<Integer> optInt = optStr.map(String::length);
		System.out.println("optStr = " + optStr.get());
		System.out.println("optInt = " + optInt.get());
		
		//autoBox, nubox
		int result = Optional.of("123")
			.filter(x -> x.length() > 0)
			.map(Integer::parseInt)
			.get();
		
		System.out.println("result1 = " + result);

	}

}
