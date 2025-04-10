package ex05_Enum;

public class WeekdayMain {

	public static void main(String[] args) {
		
		Weekday today = Weekday.MONDAY;
		
		if(today == Weekday.SUNDAY) {
			System.out.println("쉬는날 입니다.");
		} else {
			System.out.println("출근하는 날 입니다.");
		}

		

	}

}
