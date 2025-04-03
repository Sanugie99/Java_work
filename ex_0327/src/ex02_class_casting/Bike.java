package ex02_class_casting;

public class Bike {
	String riderName;
	int wheel = 2;
	
	public Bike(String riderName) {
		this.riderName = riderName;
	}
	
	public void info() {
		System.out.printf("%s의 자전거는 %d발 자전거 입니다\n",riderName,wheel);
	}
	
	public void ride() {
		System.out.println("씽씽");
	}
}
