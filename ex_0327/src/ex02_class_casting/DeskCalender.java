package ex02_class_casting;

public class DeskCalender extends Calender {

	public DeskCalender(String color, int months) {
		super(color, months);
	}
	
	@Override
	public void info() {
		System.out.printf("%s 달력을 벽에 걸기 위해 고리가 추가로 필요합니다\n",color);
	}
	
	public void onTheDesk() {
		System.out.printf("%s 달력을 책상에 세울 수 있습니다.\n",color);
	}

}
