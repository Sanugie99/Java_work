package ex01;

public class Student {

	private String name;
	private int age;
	private String studentId;

	public Student(String name, int age, String studentId) {
		super();
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}

	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("학번: " + studentId);
	}
}
