package ex01_lamda;

import java.util.function.Predicate;

import javax.print.DocFlavor.INPUT_STREAM;

public class Ex03_Function {

	public static void main(String[] args) {
		//Predicate의 결합
		//boolean test(T t)
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i % 2 == 0; 
		
		Predicate<Integer> all =p.and(r).or(q).negate();
		
		int x = 150;
		Predicate<Integer> and = p.and(r);
		//and() p and r (100미만이면서 짝수면 참)
		boolean result = and.test(x);
		System.out.println("x < 100 and 짝수인가? : " + result);
		//or() p or q (100미만 이거나 또는 200 미만이면 참)
		result = p.or(q).test(x);
		System.out.println("x < 100 또는 x < 200인가? : " + result);
		//negate()
		result = p.negate().test(x);
		System.out.println("x >= 100인가? : " + result);
	}

}
