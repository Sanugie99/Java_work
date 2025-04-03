package ex01_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class P_lamda{
	/*
	 * 리스트의 필터 메서드를 만든다.
	 * 숫자 리스트에서 조건을 결합한 결과만 필터링
	 * Predicate<Integer>를 사용해 다음 조건을 구현
	 * 짝수(even)
	 * 100이상
	 * 100미만
	 */
	public List<Integer> filter(List<Integer> list, Predicate<Integer> condition){
		List<Integer> result = new ArrayList<Integer>();
		for(Integer num : list) {
			if(condition.test(num)) {
				result.add(num);
			}
		}
		return result;
	}
}
public class Exam1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(50,80,120,150,180,210,250,300);
	    /*
	     * 조건(람다식으로 만들기)
	     * Predicate<Integer>를 사용해 다음 조건을 구현
	     * 짝수(even)
	     * 100이상
	     * 200미만
	     * 
	     * 메서드 호출해서 리스트와 조건 넘겨주면 된다.
	     */
		Predicate<Integer> isEven = i -> i % 2 == 0; 
		Predicate<Integer> isOver100 = i -> i > 100;
		Predicate<Integer> isunder200 = i -> i < 200;
		
		Predicate<Integer> condition = isEven.and(isOver100).and(isunder200);
		
		
		P_lamda p = new P_lamda();

		
		List<Integer> list = p.filter(numbers, condition);
		System.out.println(list);
	}

}
