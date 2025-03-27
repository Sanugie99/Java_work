package ex03_Polymorphism;

public class ComputerRoom {
	
	//필드
//	Samsung com1;//아무것도 들어있지 않은 null 상태
//	Samsung com2;
	
//	LZ com1;
//	LZ com2;
	
	Computer com1;
	Computer com2;
	
	//메서드
	public void allPowerOn() {
		com1.powerOn();
		com2.powerOn();
	}
	
	public void allPowerOff() {
		com1.powerOff();
		com2.powerOff();
	}
	
//	public static void main(String[] args) {
//		ComputerRoom cr = new ComputerRoom();
//		System.out.println(name);
//	}
	
	
}
