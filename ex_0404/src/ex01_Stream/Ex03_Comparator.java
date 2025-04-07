package ex01_Stream;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.jar.Attributes.Name;

class User{
	String name;
	int age;
	int score;
	
	public User(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
	
	
	
}
public class Ex03_Comparator {

	public static void main(String[] args) {
		/*
		 * Comparator
		 * 자바에서 정렬 기준을 정의할 때 사용하는 함수형 인터페이스
		 * compare
		 */

		List<String> list = Arrays.asList("apple", "kiwi", "banana");

		list.stream().sorted((t1,t2) -> t1.length() - t2.length())
			.forEach(System.out::println);

		/*
		 * JAVA8에서 추가된 정렬 기준 메서드
		 * comparing(Function<T,U> keyExtractor)
		 * 특정 필드나 메서드를 기준으로 정렬
		 */
		System.out.println("-------------------------------------");
		list.stream().sorted(Comparator.comparing(t -> t.length()))
				.forEach(System.out::println);
		System.out.println("-------------------------------------");
		list.stream().sorted(Comparator.comparing(String::length))
				.forEach(System.out::println);

		/*
		 * themComparing()
		 * 1차 기준으로 정렬하고, 값이 같을 경우 2차, 3차 기준으로 정렬
		 */
		
		List<User> users = Arrays.asList(
				new User("Alice",25,90),
				new User("Bob",25,95),
				new User("Charlie",27,85),
				new User("David",25,90),
				new User("Eve",20,95)
				);
		
		users.stream().sorted(Comparator
				.comparing(User::getAge)
				.thenComparing(User::getScore)
				.thenComparing(User::getName))
				.forEach(System.out::println);
	}

}
