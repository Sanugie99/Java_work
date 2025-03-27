package ex01_inheritance;

public class AnimalMain {
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println("---고양이---");
		System.out.println("눈의 개수 : " + cat.eye);
		System.out.println("다리의 개수 : " + cat.leg);
		System.out.println("고양이 특징 : " + cat.cute);
		
	}
}
